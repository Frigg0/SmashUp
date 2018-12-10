package com.frigg0.smashup.models.decks;

import com.frigg0.smashup.models.deckModel.CardModel;
import com.frigg0.smashup.models.deckModel.CardType;
import com.frigg0.smashup.models.deckModel.DeckName;

public class DeckUtils {

    public static CardModel generateNewCard(int id, DeckName deckName, String cardName, int power, String effect,
                                     CardType cardType, boolean played){
        return new CardModel(id, deckName, cardName, power, effect, cardType, played);
    }
}
