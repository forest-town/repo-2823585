package org.apache.camel.processor.aggregate.hazelcast;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.apache.camel.Exchange;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.Set;


public class HazelcastAggregationRepositoryOperationsTest extends CamelTestSupport {

    private static HazelcastInstance hzOne = null;
    private static HazelcastInstance hzTwo = null;
    private static final String THREAD_SAFE_REPO = "threadSafeRepo";
    private static final String OPTIMISTIC_REPO = "optimisticRepo";

    @BeforeClass
    public static void setUpHazelcastCluster() {
        hzOne = Hazelcast.newHazelcastInstance();
        hzTwo = Hazelcast.newHazelcastInstance();
    }

    @AfterClass
    public static void shutDownHazelcastCluster() {
        hzOne.getLifecycleService().shutdown();
        hzTwo.getLifecycleService().shutdown();
    }

    @Test
    public void checkOptimisticAddOfNewExchange() throws Exception {
        HazelcastAggregationRepository repoOne = new HazelcastAggregationRepository(OPTIMISTIC_REPO, true, hzOne);
        HazelcastAggregationRepository repoTwo = new HazelcastAggregationRepository(OPTIMISTIC_REPO, true, hzTwo);

        try {
            repoOne.doStart();
            repoTwo.doStart();

            final String testBody = "This is an optimistic test body. Sincerely yours, Captain Obvious.";
            final String key = "optimisticKey";
            Exchange newEx = createExchangeWithBody(testBody);
            Exchange oldEx = repoOne.add(context(), key, null, newEx);

            assertNull("Old exchange should be null.", oldEx);

            final String theNewestBody = "This is the newest test body.";
            Exchange theNewestEx = createExchangeWithBody(theNewestBody);

            oldEx = repoTwo.add(context(), key, newEx, theNewestEx);
            assertEquals(newEx.getIn().getBody(), oldEx.getIn().getBody());

        } finally {
            repoOne.stop();
            repoTwo.stop();
        }
    }

    @Test
    public void checkThreadSafeAddOfNewExchange() throws Exception {
        HazelcastAggregationRepository repoOne = new HazelcastAggregationRepository(THREAD_SAFE_REPO, false, hzOne);
        HazelcastAggregationRepository repoTwo = new HazelcastAggregationRepository(THREAD_SAFE_REPO, false, hzTwo);

        try {
            repoOne.doStart();
            repoTwo.doStart();

            final String testBody = "This is a thread-safe test body. Sincerely yours, Captain Obvious.";
            final String key = "threadSafeKey";
            Exchange newEx = createExchangeWithBody(testBody);
            Exchange oldEx = repoOne.add(context(), key, newEx);

            assertNull("Old exchange should be null.", oldEx);

            final String theNewestBody = "This is the newest test body.";
            Exchange theNewestEx = createExchangeWithBody(theNewestBody);

            oldEx = repoTwo.add(context(), key, theNewestEx);
            assertEquals(newEx.getIn().getBody(), oldEx.getIn().getBody());

        } finally {
            repoOne.stop();
            repoTwo.stop();
        }
    }

    @Test
    public void checkOptimisticGet() throws Exception {
        HazelcastAggregationRepository repoOne = new HazelcastAggregationRepository(THREAD_SAFE_REPO, true, hzOne);
        HazelcastAggregationRepository repoTwo = new HazelcastAggregationRepository(THREAD_SAFE_REPO, true, hzTwo);
        try {
            repoOne.doStart();
            repoTwo.doStart();

            final String testBody = "This is an optimistic test body. Sincerely yours, Captain Obvious.";
            final String key = "optimisticKey";

            Exchange ex = createExchangeWithBody(testBody);
            repoOne.add(context(), key, null, ex);

            Exchange gotEx = repoTwo.get(context(), key);
            assertEquals("ex and gotEx should be equal", gotEx.getIn().getBody(), ex.getIn().getBody());
        } finally {
            repoOne.doStop();
            repoTwo.doStop();
        }
    }

    @Test
    public void checkThreadSafeGet() throws Exception {
        HazelcastAggregationRepository repoOne = new HazelcastAggregationRepository(OPTIMISTIC_REPO, false, hzOne);
        HazelcastAggregationRepository repoTwo = new HazelcastAggregationRepository(OPTIMISTIC_REPO, false, hzTwo);

        try {
            repoOne.doStart();
            repoTwo.doStart();


            final String testBody = "This is a thread-safe test body. Sincerely yours, Captain Obvious.";
            final String key = "threadSafeKey";

            Exchange ex = createExchangeWithBody(testBody);
            repoOne.add(context(), key, ex);

            Exchange gotEx = repoTwo.get(context(), key);
            assertEquals("ex and gotEx should be equal", gotEx.getIn().getBody(), ex.getIn().getBody());
        } finally {
            repoOne.doStop();
            repoTwo.doStop();
        }
    }

    @Test
    public void checkOptimisticPersistentRemove() throws Exception {
        final String persistentRepoName = String.format("%s-completed", OPTIMISTIC_REPO);
        HazelcastAggregationRepository repoOne = new HazelcastAggregationRepository(OPTIMISTIC_REPO, persistentRepoName, true, hzOne);
        HazelcastAggregationRepository repoTwo = new HazelcastAggregationRepository(OPTIMISTIC_REPO, persistentRepoName, true, hzTwo);

        try {
            repoOne.doStart();
            repoTwo.doStart();

            final String testBody = "This is an optimistic test body. Sincerely yours, Captain Obvious.";
            final String key = "optimisticKey";

            Exchange ex = createExchangeWithBody(testBody);

            repoOne.add(context(), key, null, ex);

            Exchange getBackEx = repoTwo.get(context(), key);
            assertNotNull("getBackEx should not be null.", getBackEx);

            repoTwo.remove(context(), key, ex);

            getBackEx = repoOne.get(context(), key);
            assertNull("getBackEx should be null here.", getBackEx);

            Set<String> keys = repoTwo.scan(context());
            assertCollectionSize(keys, 1);

            getBackEx = repoOne.recover(context(), keys.iterator().next());
            assertNotNull("getBackEx got from persistent repo should not be null.", getBackEx);


        } finally {
            repoOne.doStop();
            repoTwo.doStop();
        }
    }
}
