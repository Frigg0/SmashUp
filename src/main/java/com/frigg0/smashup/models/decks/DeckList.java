package com.frigg0.smashup.models.decks;

import com.frigg0.smashup.models.deckModel.CardModel;

import java.util.List;

public class DeckList {
    private String deckName;
    private List<CardModel> deckList;

    public DeckList(String deckName, List<CardModel> deckList) {
        this.deckName = deckName;
        this.deckList = deckList;
    }

    @Override
    public String toString() {
        return "DeckList{" +
                "deckName='" + deckName + '\'' +
                ", deckList=" + deckList +
                '}';
    }

    public DeckList() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public List<CardModel> getDeckList() {
        return deckList;
    }

    public void setDeckList(List<CardModel> deckList) {
        this.deckList = deckList;
    }
}
