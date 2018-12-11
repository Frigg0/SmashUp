package com.frigg0.smashup.models.decks;

import com.frigg0.smashup.models.deckModel.CardModel;

import java.util.List;

public class DeckList {
    private int id;
    private String deckName;
    private List<CardModel> deckList;

    public DeckList(int id, String deckName, List<CardModel> deckList) {
        this.id = id;
        this.deckName = deckName;
        this.deckList = deckList;
    }

    @Override
    public String toString() {
        return "DeckList{" +
                "id=" + id +
                ", deckName='" + deckName + '\'' +
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
