package com.frigg0.smashup.services.mixDeckUp;

import com.frigg0.smashup.models.deckModel.CardModel;
import com.frigg0.smashup.models.decks.DeckList;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class MixDeckUp {
    public List<CardModel> mixDeckUp(DeckList deckList1, DeckList deckList2){
        List<CardModel> list = new ArrayList<>();

        list = CollectionUtils.mergeArrayIntoCollection(deckList1.getDeckList(), deckList2.getDeckList());
    }
}
