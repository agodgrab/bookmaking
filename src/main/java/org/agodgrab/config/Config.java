package org.agodgrab.config;

import com.typesafe.config.ConfigFactory;

public enum Config {

    INSTANCE(ConfigFactory.load());

    Config(com.typesafe.config.Config conf) {
        this.database=conf.getString("config.database");
        this.host=conf.getString("config.host");
        this.port=conf.getInt("config.port");
    }

    private String database;
    private String host;
    private int port;


    public String getDatabase() {
        return database;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

}
