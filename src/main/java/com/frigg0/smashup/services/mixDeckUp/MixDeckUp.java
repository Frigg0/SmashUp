package com.frigg0.smashup.services.mixDeckUp;

import com.frigg0.smashup.models.deckModel.CardModel;
import com.frigg0.smashup.models.decks.DeckList;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class MixDeckUp {

    // Take two initial deck to get the play deck
    public List<CardModel> mixDeckUp(DeckList deckList1, DeckList deckList2){
        List<CardModel> updatedDecklist2 = changeID(deckList2);

        return Stream.concat(deckList1.getDeckList().stream(), updatedDecklist2.stream()).collect(Collectors.toList());
    }

    // Change ID for second deck
    private List<CardModel> changeID(DeckList deckList2){
        List<CardModel> list = deckList2.getDeckList();

        for(CardModel cardModel : list){
            int id = cardModel.getId() + 20;
            cardModel.setId(id);
        }

        return list;
    }
}
