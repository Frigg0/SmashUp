package com.frigg0.smashup.services.draw;

import com.frigg0.smashup.models.deckModel.CardModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class DrawCard {

    public CardModel drawCard(List<CardModel> deckList){
        // Retrieve the random number for the card to pick and test if already draw
        int n = getRandom(deckList);

        // Stock card draw to return
        CardModel cardModel = getCardInDeck(deckList, n);

        // Remove the card draw from the deck
        deckList.remove(n);

        System.out.println(cardModel.toString());

        return cardModel;
    }

    // Method generating a random number for drawing a card
    private int getRandom(List<CardModel> deckList){
        Random random = new Random();
        int n = deckList.size();

        return random.nextInt(n);
    }

    // Retrieve a card from deck at target index
    private CardModel getCardInDeck(List<CardModel> deckList, int index){
        return deckList.get(index);
    }
}
