package com.frigg0.smashup.services.deckService;

import com.frigg0.smashup.models.deckModel.CardModel;
import com.frigg0.smashup.services.constructDecks.Cowboys;
import com.frigg0.smashup.services.draw.DrawCard;
import com.frigg0.smashup.services.mixDeckUp.MixDeckUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeckService {
    // TODO MAKE PLAYERS SEPARATION
    // TODO retirer les decks pick par les joueurs pour ne pas avoir de doublons
    // TODO Choix dynamique des decks

    @Autowired
    private MixDeckUp mixDeckUp;
    @Autowired
    private Cowboys cowboys;
    @Autowired
    private DrawCard drawCard;

    public CardModel drawCard(){
        List<CardModel> deckList = mixDeckUp.mixDeckUp(cowboys.constructCowboys(), cowboys.constructCowboys());
        System.out.println(deckList.size());

        drawCard.drawCard(deckList);

        System.out.println(deckList.size());

        return drawCard.drawCard(deckList);
    }
}
