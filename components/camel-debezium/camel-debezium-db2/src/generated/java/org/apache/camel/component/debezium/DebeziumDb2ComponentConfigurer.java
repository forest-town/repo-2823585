/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class DebeziumDb2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.debezium.configuration.Db2ConnectorEmbeddedDebeziumConfiguration getOrCreateConfiguration(DebeziumDb2Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.debezium.configuration.Db2ConnectorEmbeddedDebeziumConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumDb2Component target = (DebeziumDb2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": getOrCreateConfiguration(target).setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "columnexcludelist":
        case "columnExcludeList": getOrCreateConfiguration(target).setColumnExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "columnincludelist":
        case "columnIncludeList": getOrCreateConfiguration(target).setColumnIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": getOrCreateConfiguration(target).setColumnPropagateSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.debezium.configuration.Db2ConnectorEmbeddedDebeziumConfiguration.class, value)); return true;
        case "converters": getOrCreateConfiguration(target).setConverters(property(camelContext, java.lang.String.class, value)); return true;
        case "custommetrictags":
        case "customMetricTags": getOrCreateConfiguration(target).setCustomMetricTags(property(camelContext, java.lang.String.class, value)); return true;
        case "databasedbname":
        case "databaseDbname": getOrCreateConfiguration(target).setDatabaseDbname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehostname":
        case "databaseHostname": getOrCreateConfiguration(target).setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword":
        case "databasePassword": getOrCreateConfiguration(target).setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport":
        case "databasePort": getOrCreateConfiguration(target).setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseuser":
        case "databaseUser": getOrCreateConfiguration(target).setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": getOrCreateConfiguration(target).setDatatypePropagateSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": getOrCreateConfiguration(target).setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "errorsmaxretries":
        case "errorsMaxRetries": getOrCreateConfiguration(target).setErrorsMaxRetries(property(camelContext, int.class, value)); return true;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": getOrCreateConfiguration(target).setEventProcessingFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": getOrCreateConfiguration(target).setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": getOrCreateConfiguration(target).setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "includeschemachanges":
        case "includeSchemaChanges": getOrCreateConfiguration(target).setIncludeSchemaChanges(property(camelContext, boolean.class, value)); return true;
        case "incrementalsnapshotchunksize":
        case "incrementalSnapshotChunkSize": getOrCreateConfiguration(target).setIncrementalSnapshotChunkSize(property(camelContext, int.class, value)); return true;
        case "incrementalsnapshotwatermarkingstrategy":
        case "incrementalSnapshotWatermarkingStrategy": getOrCreateConfiguration(target).setIncrementalSnapshotWatermarkingStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": getOrCreateConfiguration(target).setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": getOrCreateConfiguration(target).setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": getOrCreateConfiguration(target).setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": getOrCreateConfiguration(target).setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": getOrCreateConfiguration(target).setMaxQueueSizeInBytes(property(camelContext, long.class, value)); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": getOrCreateConfiguration(target).setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "notificationenabledchannels":
        case "notificationEnabledChannels": getOrCreateConfiguration(target).setNotificationEnabledChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "notificationsinktopicname":
        case "notificationSinkTopicName": getOrCreateConfiguration(target).setNotificationSinkTopicName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": getOrCreateConfiguration(target).setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": getOrCreateConfiguration(target).setOffsetCommitTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": getOrCreateConfiguration(target).setOffsetFlushIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetstorage":
        case "offsetStorage": getOrCreateConfiguration(target).setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": getOrCreateConfiguration(target).setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": getOrCreateConfiguration(target).setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": getOrCreateConfiguration(target).setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": getOrCreateConfiguration(target).setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": getOrCreateConfiguration(target).setPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "postprocessors":
        case "postProcessors": getOrCreateConfiguration(target).setPostProcessors(property(camelContext, java.lang.String.class, value)); return true;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": getOrCreateConfiguration(target).setProvideTransactionMetadata(property(camelContext, boolean.class, value)); return true;
        case "queryfetchsize":
        case "queryFetchSize": getOrCreateConfiguration(target).setQueryFetchSize(property(camelContext, int.class, value)); return true;
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": getOrCreateConfiguration(target).setRetriableRestartConnectorWaitMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "schemahistoryinternal":
        case "schemaHistoryInternal": getOrCreateConfiguration(target).setSchemaHistoryInternal(property(camelContext, java.lang.String.class, value)); return true;
        case "schemahistoryinternalfilefilename":
        case "schemaHistoryInternalFileFilename": getOrCreateConfiguration(target).setSchemaHistoryInternalFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "schemahistoryinternalskipunparseableddl":
        case "schemaHistoryInternalSkipUnparseableDdl": getOrCreateConfiguration(target).setSchemaHistoryInternalSkipUnparseableDdl(property(camelContext, boolean.class, value)); return true;
        case "schemahistoryinternalstoreonlycaptureddatabasesddl":
        case "schemaHistoryInternalStoreOnlyCapturedDatabasesDdl": getOrCreateConfiguration(target).setSchemaHistoryInternalStoreOnlyCapturedDatabasesDdl(property(camelContext, boolean.class, value)); return true;
        case "schemahistoryinternalstoreonlycapturedtablesddl":
        case "schemaHistoryInternalStoreOnlyCapturedTablesDdl": getOrCreateConfiguration(target).setSchemaHistoryInternalStoreOnlyCapturedTablesDdl(property(camelContext, boolean.class, value)); return true;
        case "schemanameadjustmentmode":
        case "schemaNameAdjustmentMode": getOrCreateConfiguration(target).setSchemaNameAdjustmentMode(property(camelContext, java.lang.String.class, value)); return true;
        case "signaldatacollection":
        case "signalDataCollection": getOrCreateConfiguration(target).setSignalDataCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "signalenabledchannels":
        case "signalEnabledChannels": getOrCreateConfiguration(target).setSignalEnabledChannels(property(camelContext, java.lang.String.class, value)); return true;
        case "signalpollintervalms":
        case "signalPollIntervalMs": getOrCreateConfiguration(target).setSignalPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "skippedoperations":
        case "skippedOperations": getOrCreateConfiguration(target).setSkippedOperations(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": getOrCreateConfiguration(target).setSnapshotDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": getOrCreateConfiguration(target).setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": getOrCreateConfiguration(target).setSnapshotIncludeCollectionList(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": getOrCreateConfiguration(target).setSnapshotLockTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotmode":
        case "snapshotMode": getOrCreateConfiguration(target).setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotmodeconfigurationbasedsnapshotdata":
        case "snapshotModeConfigurationBasedSnapshotData": getOrCreateConfiguration(target).setSnapshotModeConfigurationBasedSnapshotData(property(camelContext, boolean.class, value)); return true;
        case "snapshotmodeconfigurationbasedsnapshotondataerror":
        case "snapshotModeConfigurationBasedSnapshotOnDataError": getOrCreateConfiguration(target).setSnapshotModeConfigurationBasedSnapshotOnDataError(property(camelContext, boolean.class, value)); return true;
        case "snapshotmodeconfigurationbasedsnapshotonschemaerror":
        case "snapshotModeConfigurationBasedSnapshotOnSchemaError": getOrCreateConfiguration(target).setSnapshotModeConfigurationBasedSnapshotOnSchemaError(property(camelContext, boolean.class, value)); return true;
        case "snapshotmodeconfigurationbasedsnapshotschema":
        case "snapshotModeConfigurationBasedSnapshotSchema": getOrCreateConfiguration(target).setSnapshotModeConfigurationBasedSnapshotSchema(property(camelContext, boolean.class, value)); return true;
        case "snapshotmodeconfigurationbasedstartstream":
        case "snapshotModeConfigurationBasedStartStream": getOrCreateConfiguration(target).setSnapshotModeConfigurationBasedStartStream(property(camelContext, boolean.class, value)); return true;
        case "snapshotmodecustomname":
        case "snapshotModeCustomName": getOrCreateConfiguration(target).setSnapshotModeCustomName(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": getOrCreateConfiguration(target).setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshottablesorderbyrowcount":
        case "snapshotTablesOrderByRowCount": getOrCreateConfiguration(target).setSnapshotTablesOrderByRowCount(property(camelContext, java.lang.String.class, value)); return true;
        case "sourceinfostructmaker":
        case "sourceinfoStructMaker": getOrCreateConfiguration(target).setSourceinfoStructMaker(property(camelContext, java.lang.String.class, value)); return true;
        case "tableexcludelist":
        case "tableExcludeList": getOrCreateConfiguration(target).setTableExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": getOrCreateConfiguration(target).setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tableincludelist":
        case "tableIncludeList": getOrCreateConfiguration(target).setTableIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": getOrCreateConfiguration(target).setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": getOrCreateConfiguration(target).setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        case "topicnamingstrategy":
        case "topicNamingStrategy": getOrCreateConfiguration(target).setTopicNamingStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "topicprefix":
        case "topicPrefix": getOrCreateConfiguration(target).setTopicPrefix(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.util.Map.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "columnexcludelist":
        case "columnExcludeList": return java.lang.String.class;
        case "columnincludelist":
        case "columnIncludeList": return java.lang.String.class;
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.debezium.configuration.Db2ConnectorEmbeddedDebeziumConfiguration.class;
        case "converters": return java.lang.String.class;
        case "custommetrictags":
        case "customMetricTags": return java.lang.String.class;
        case "databasedbname":
        case "databaseDbname": return java.lang.String.class;
        case "databasehostname":
        case "databaseHostname": return java.lang.String.class;
        case "databasepassword":
        case "databasePassword": return java.lang.String.class;
        case "databaseport":
        case "databasePort": return int.class;
        case "databaseuser":
        case "databaseUser": return java.lang.String.class;
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": return java.lang.String.class;
        case "decimalhandlingmode":
        case "decimalHandlingMode": return java.lang.String.class;
        case "errorsmaxretries":
        case "errorsMaxRetries": return int.class;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return java.lang.String.class;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return int.class;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return java.lang.String.class;
        case "includeschemachanges":
        case "includeSchemaChanges": return boolean.class;
        case "incrementalsnapshotchunksize":
        case "incrementalSnapshotChunkSize": return int.class;
        case "incrementalsnapshotwatermarkingstrategy":
        case "incrementalSnapshotWatermarkingStrategy": return java.lang.String.class;
        case "internalkeyconverter":
        case "internalKeyConverter": return java.lang.String.class;
        case "internalvalueconverter":
        case "internalValueConverter": return java.lang.String.class;
        case "maxbatchsize":
        case "maxBatchSize": return int.class;
        case "maxqueuesize":
        case "maxQueueSize": return int.class;
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": return long.class;
        case "messagekeycolumns":
        case "messageKeyColumns": return java.lang.String.class;
        case "notificationenabledchannels":
        case "notificationEnabledChannels": return java.lang.String.class;
        case "notificationsinktopicname":
        case "notificationSinkTopicName": return java.lang.String.class;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return java.lang.String.class;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return long.class;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return long.class;
        case "offsetstorage":
        case "offsetStorage": return java.lang.String.class;
        case "offsetstoragefilename":
        case "offsetStorageFileName": return java.lang.String.class;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return int.class;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return int.class;
        case "offsetstoragetopic":
        case "offsetStorageTopic": return java.lang.String.class;
        case "pollintervalms":
        case "pollIntervalMs": return long.class;
        case "postprocessors":
        case "postProcessors": return java.lang.String.class;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return boolean.class;
        case "queryfetchsize":
        case "queryFetchSize": return int.class;
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": return long.class;
        case "schemahistoryinternal":
        case "schemaHistoryInternal": return java.lang.String.class;
        case "schemahistoryinternalfilefilename":
        case "schemaHistoryInternalFileFilename": return java.lang.String.class;
        case "schemahistoryinternalskipunparseableddl":
        case "schemaHistoryInternalSkipUnparseableDdl": return boolean.class;
        case "schemahistoryinternalstoreonlycaptureddatabasesddl":
        case "schemaHistoryInternalStoreOnlyCapturedDatabasesDdl": return boolean.class;
        case "schemahistoryinternalstoreonlycapturedtablesddl":
        case "schemaHistoryInternalStoreOnlyCapturedTablesDdl": return boolean.class;
        case "schemanameadjustmentmode":
        case "schemaNameAdjustmentMode": return java.lang.String.class;
        case "signaldatacollection":
        case "signalDataCollection": return java.lang.String.class;
        case "signalenabledchannels":
        case "signalEnabledChannels": return java.lang.String.class;
        case "signalpollintervalms":
        case "signalPollIntervalMs": return long.class;
        case "skippedoperations":
        case "skippedOperations": return java.lang.String.class;
        case "snapshotdelayms":
        case "snapshotDelayMs": return long.class;
        case "snapshotfetchsize":
        case "snapshotFetchSize": return int.class;
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": return java.lang.String.class;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": return long.class;
        case "snapshotmode":
        case "snapshotMode": return java.lang.String.class;
        case "snapshotmodeconfigurationbasedsnapshotdata":
        case "snapshotModeConfigurationBasedSnapshotData": return boolean.class;
        case "snapshotmodeconfigurationbasedsnapshotondataerror":
        case "snapshotModeConfigurationBasedSnapshotOnDataError": return boolean.class;
        case "snapshotmodeconfigurationbasedsnapshotonschemaerror":
        case "snapshotModeConfigurationBasedSnapshotOnSchemaError": return boolean.class;
        case "snapshotmodeconfigurationbasedsnapshotschema":
        case "snapshotModeConfigurationBasedSnapshotSchema": return boolean.class;
        case "snapshotmodeconfigurationbasedstartstream":
        case "snapshotModeConfigurationBasedStartStream": return boolean.class;
        case "snapshotmodecustomname":
        case "snapshotModeCustomName": return java.lang.String.class;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return java.lang.String.class;
        case "snapshottablesorderbyrowcount":
        case "snapshotTablesOrderByRowCount": return java.lang.String.class;
        case "sourceinfostructmaker":
        case "sourceinfoStructMaker": return java.lang.String.class;
        case "tableexcludelist":
        case "tableExcludeList": return java.lang.String.class;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return boolean.class;
        case "tableincludelist":
        case "tableIncludeList": return java.lang.String.class;
        case "timeprecisionmode":
        case "timePrecisionMode": return java.lang.String.class;
        case "tombstonesondelete":
        case "tombstonesOnDelete": return boolean.class;
        case "topicnamingstrategy":
        case "topicNamingStrategy": return java.lang.String.class;
        case "topicprefix":
        case "topicPrefix": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumDb2Component target = (DebeziumDb2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return getOrCreateConfiguration(target).getAdditionalProperties();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "columnexcludelist":
        case "columnExcludeList": return getOrCreateConfiguration(target).getColumnExcludeList();
        case "columnincludelist":
        case "columnIncludeList": return getOrCreateConfiguration(target).getColumnIncludeList();
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": return getOrCreateConfiguration(target).getColumnPropagateSourceType();
        case "configuration": return target.getConfiguration();
        case "converters": return getOrCreateConfiguration(target).getConverters();
        case "custommetrictags":
        case "customMetricTags": return getOrCreateConfiguration(target).getCustomMetricTags();
        case "databasedbname":
        case "databaseDbname": return getOrCreateConfiguration(target).getDatabaseDbname();
        case "databasehostname":
        case "databaseHostname": return getOrCreateConfiguration(target).getDatabaseHostname();
        case "databasepassword":
        case "databasePassword": return getOrCreateConfiguration(target).getDatabasePassword();
        case "databaseport":
        case "databasePort": return getOrCreateConfiguration(target).getDatabasePort();
        case "databaseuser":
        case "databaseUser": return getOrCreateConfiguration(target).getDatabaseUser();
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": return getOrCreateConfiguration(target).getDatatypePropagateSourceType();
        case "decimalhandlingmode":
        case "decimalHandlingMode": return getOrCreateConfiguration(target).getDecimalHandlingMode();
        case "errorsmaxretries":
        case "errorsMaxRetries": return getOrCreateConfiguration(target).getErrorsMaxRetries();
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return getOrCreateConfiguration(target).getEventProcessingFailureHandlingMode();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return getOrCreateConfiguration(target).getHeartbeatIntervalMs();
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return getOrCreateConfiguration(target).getHeartbeatTopicsPrefix();
        case "includeschemachanges":
        case "includeSchemaChanges": return getOrCreateConfiguration(target).isIncludeSchemaChanges();
        case "incrementalsnapshotchunksize":
        case "incrementalSnapshotChunkSize": return getOrCreateConfiguration(target).getIncrementalSnapshotChunkSize();
        case "incrementalsnapshotwatermarkingstrategy":
        case "incrementalSnapshotWatermarkingStrategy": return getOrCreateConfiguration(target).getIncrementalSnapshotWatermarkingStrategy();
        case "internalkeyconverter":
        case "internalKeyConverter": return getOrCreateConfiguration(target).getInternalKeyConverter();
        case "internalvalueconverter":
        case "internalValueConverter": return getOrCreateConfiguration(target).getInternalValueConverter();
        case "maxbatchsize":
        case "maxBatchSize": return getOrCreateConfiguration(target).getMaxBatchSize();
        case "maxqueuesize":
        case "maxQueueSize": return getOrCreateConfiguration(target).getMaxQueueSize();
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": return getOrCreateConfiguration(target).getMaxQueueSizeInBytes();
        case "messagekeycolumns":
        case "messageKeyColumns": return getOrCreateConfiguration(target).getMessageKeyColumns();
        case "notificationenabledchannels":
        case "notificationEnabledChannels": return getOrCreateConfiguration(target).getNotificationEnabledChannels();
        case "notificationsinktopicname":
        case "notificationSinkTopicName": return getOrCreateConfiguration(target).getNotificationSinkTopicName();
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return getOrCreateConfiguration(target).getOffsetCommitPolicy();
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return getOrCreateConfiguration(target).getOffsetCommitTimeoutMs();
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return getOrCreateConfiguration(target).getOffsetFlushIntervalMs();
        case "offsetstorage":
        case "offsetStorage": return getOrCreateConfiguration(target).getOffsetStorage();
        case "offsetstoragefilename":
        case "offsetStorageFileName": return getOrCreateConfiguration(target).getOffsetStorageFileName();
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return getOrCreateConfiguration(target).getOffsetStoragePartitions();
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return getOrCreateConfiguration(target).getOffsetStorageReplicationFactor();
        case "offsetstoragetopic":
        case "offsetStorageTopic": return getOrCreateConfiguration(target).getOffsetStorageTopic();
        case "pollintervalms":
        case "pollIntervalMs": return getOrCreateConfiguration(target).getPollIntervalMs();
        case "postprocessors":
        case "postProcessors": return getOrCreateConfiguration(target).getPostProcessors();
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return getOrCreateConfiguration(target).isProvideTransactionMetadata();
        case "queryfetchsize":
        case "queryFetchSize": return getOrCreateConfiguration(target).getQueryFetchSize();
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": return getOrCreateConfiguration(target).getRetriableRestartConnectorWaitMs();
        case "schemahistoryinternal":
        case "schemaHistoryInternal": return getOrCreateConfiguration(target).getSchemaHistoryInternal();
        case "schemahistoryinternalfilefilename":
        case "schemaHistoryInternalFileFilename": return getOrCreateConfiguration(target).getSchemaHistoryInternalFileFilename();
        case "schemahistoryinternalskipunparseableddl":
        case "schemaHistoryInternalSkipUnparseableDdl": return getOrCreateConfiguration(target).isSchemaHistoryInternalSkipUnparseableDdl();
        case "schemahistoryinternalstoreonlycaptureddatabasesddl":
        case "schemaHistoryInternalStoreOnlyCapturedDatabasesDdl": return getOrCreateConfiguration(target).isSchemaHistoryInternalStoreOnlyCapturedDatabasesDdl();
        case "schemahistoryinternalstoreonlycapturedtablesddl":
        case "schemaHistoryInternalStoreOnlyCapturedTablesDdl": return getOrCreateConfiguration(target).isSchemaHistoryInternalStoreOnlyCapturedTablesDdl();
        case "schemanameadjustmentmode":
        case "schemaNameAdjustmentMode": return getOrCreateConfiguration(target).getSchemaNameAdjustmentMode();
        case "signaldatacollection":
        case "signalDataCollection": return getOrCreateConfiguration(target).getSignalDataCollection();
        case "signalenabledchannels":
        case "signalEnabledChannels": return getOrCreateConfiguration(target).getSignalEnabledChannels();
        case "signalpollintervalms":
        case "signalPollIntervalMs": return getOrCreateConfiguration(target).getSignalPollIntervalMs();
        case "skippedoperations":
        case "skippedOperations": return getOrCreateConfiguration(target).getSkippedOperations();
        case "snapshotdelayms":
        case "snapshotDelayMs": return getOrCreateConfiguration(target).getSnapshotDelayMs();
        case "snapshotfetchsize":
        case "snapshotFetchSize": return getOrCreateConfiguration(target).getSnapshotFetchSize();
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": return getOrCreateConfiguration(target).getSnapshotIncludeCollectionList();
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": return getOrCreateConfiguration(target).getSnapshotLockTimeoutMs();
        case "snapshotmode":
        case "snapshotMode": return getOrCreateConfiguration(target).getSnapshotMode();
        case "snapshotmodeconfigurationbasedsnapshotdata":
        case "snapshotModeConfigurationBasedSnapshotData": return getOrCreateConfiguration(target).isSnapshotModeConfigurationBasedSnapshotData();
        case "snapshotmodeconfigurationbasedsnapshotondataerror":
        case "snapshotModeConfigurationBasedSnapshotOnDataError": return getOrCreateConfiguration(target).isSnapshotModeConfigurationBasedSnapshotOnDataError();
        case "snapshotmodeconfigurationbasedsnapshotonschemaerror":
        case "snapshotModeConfigurationBasedSnapshotOnSchemaError": return getOrCreateConfiguration(target).isSnapshotModeConfigurationBasedSnapshotOnSchemaError();
        case "snapshotmodeconfigurationbasedsnapshotschema":
        case "snapshotModeConfigurationBasedSnapshotSchema": return getOrCreateConfiguration(target).isSnapshotModeConfigurationBasedSnapshotSchema();
        case "snapshotmodeconfigurationbasedstartstream":
        case "snapshotModeConfigurationBasedStartStream": return getOrCreateConfiguration(target).isSnapshotModeConfigurationBasedStartStream();
        case "snapshotmodecustomname":
        case "snapshotModeCustomName": return getOrCreateConfiguration(target).getSnapshotModeCustomName();
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return getOrCreateConfiguration(target).getSnapshotSelectStatementOverrides();
        case "snapshottablesorderbyrowcount":
        case "snapshotTablesOrderByRowCount": return getOrCreateConfiguration(target).getSnapshotTablesOrderByRowCount();
        case "sourceinfostructmaker":
        case "sourceinfoStructMaker": return getOrCreateConfiguration(target).getSourceinfoStructMaker();
        case "tableexcludelist":
        case "tableExcludeList": return getOrCreateConfiguration(target).getTableExcludeList();
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return getOrCreateConfiguration(target).isTableIgnoreBuiltin();
        case "tableincludelist":
        case "tableIncludeList": return getOrCreateConfiguration(target).getTableIncludeList();
        case "timeprecisionmode":
        case "timePrecisionMode": return getOrCreateConfiguration(target).getTimePrecisionMode();
        case "tombstonesondelete":
        case "tombstonesOnDelete": return getOrCreateConfiguration(target).isTombstonesOnDelete();
        case "topicnamingstrategy":
        case "topicNamingStrategy": return getOrCreateConfiguration(target).getTopicNamingStrategy();
        case "topicprefix":
        case "topicPrefix": return getOrCreateConfiguration(target).getTopicPrefix();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

