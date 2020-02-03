package org.agodgrab.config;


import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import static org.agodgrab.config.Config.INSTANCE;

@Configuration
public class SimpleMongoConfig {

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongo(), INSTANCE.getDatabase());
    }

    @Bean
    public MongoClient mongo() {
        return new MongoClient(INSTANCE.getHost(), INSTANCE.getPort() );
    }


}
