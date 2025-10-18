package com.Kapoor.journalApp.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class DbFactory {
    @Bean
    public PlatformTransactionManager nothing(MongoDatabaseFactory dbFactory){
        return new MongoTransactionManager(dbFactory);
    }
}
