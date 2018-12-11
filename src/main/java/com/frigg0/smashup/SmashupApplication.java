package com.frigg0.smashup;

import com.frigg0.smashup.services.constructDecks.Cowboys;
import com.frigg0.smashup.services.deckService.DeckService;
import com.frigg0.smashup.services.mixDeckUp.MixDeckUp;
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
        MixDeckUp mixDeckUp = new MixDeckUp();
        DeckService deckService = new DeckService();

//        System.out.println(cowboys.constructCowboys());
//        System.out.println(mixDeckUp.mixDeckUp(cowboys.constructCowboys(), cowboys.constructCowboys()));
        System.out.println(deckService.drawCard());
    }
}
