package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(BandRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Band("Metallica", "Rock")));
      log.info("Preloading " + repository.save(new Band("Polyphia", "Progressive metal")));
    };
  }
}
