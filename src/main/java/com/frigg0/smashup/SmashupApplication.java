package com.frigg0.smashup;

import com.frigg0.smashup.services.constructDecks.Cowboys;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmashupApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SmashupApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Cowboys cowboys = new Cowboys();

        System.out.println(cowboys.constructCowboys());
    }
}
