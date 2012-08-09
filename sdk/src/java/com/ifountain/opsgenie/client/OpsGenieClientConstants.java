package com.ifountain.opsgenie.client;

/**
 * @author Sezgin Kucukkaraaslan
 * @version 5/28/12 3:01 PM
 */
public interface OpsGenieClientConstants {
    public static final String OPSGENIE_API_URI = "https://api.opsgenie.com";

    public interface ScriptProxy {
        String BINDING_CONF = "conf";
        String BINDING_PARAMS = "params";
        String BINDING_OPSGENIE_CLIENT = "opsgenie";
        String BINDING_LOGGER = "logger";
        String INPUT_STREAM = "stream";
        String FILE_NAME = "fileName";
        String SUCCESS = "success";
    }

    public interface API {
        public static final String ID = "id";
        public static final String CUSTOMER_KEY = "customerKey";
        public static final String MESSAGE = "message";
        public static final String DESCRIPTION = "description";
        public static final String SOURCE = "source";
        public static final String NAME = "name";
        public static final String ENTITY = "entity";
        public static final String ALIAS = "alias";
        public static final String TAGS = "tags";
        public static final String DETAILS = "details";
        public static final String ACTIONS = "actions";
        public static final String RECIPIENTS = "recipients";
        public static final String STATUS = "status";
        public static final String CREATED_AT = "createdAt";
        public static final String ALERT_ID = "alertId";
        public static final String NOTE = "note";
        public static final String ATTACHMENT = "attachment";
        public static final String INDEX_FILE = "indexFile";
        public static final String HELP = "help";
        public static final String USER = "user";
    }
}