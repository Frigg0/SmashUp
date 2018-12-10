package com.frigg0.smashup.models.deckModel;

public class CardModel {
    private int id;
    private DeckName deckName;
    private String cardName;
    private int power;
    private String effect;
    private CardType cardType;
    private boolean played;

    public CardModel(int id, DeckName deckName, String cardName, int power, String effect, CardType cardType, boolean played) {
        this.id = id;
        this.deckName = deckName;
        this.cardName = cardName;
        this.power = power;
        this.effect = effect;
        this.cardType = cardType;
        this.played = played;
    }

//    public CardModel() {
//    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "CardModel{" +
                "id=" + id +
                ", deckName=" + deckName +
                ", cardName='" + cardName + '\'' +
                ", power=" + power +
                ", effect='" + effect + '\'' +
                ", cardType=" + cardType +
                ", played=" + played +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeckName getDeckName() {
        return deckName;
    }

    public void setDeckName(DeckName deckName) {
        this.deckName = deckName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }
}