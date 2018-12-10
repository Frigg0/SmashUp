package com.frigg0.smashup.services.constructDecks;

import com.frigg0.smashup.models.deckModel.CardModel;
import com.frigg0.smashup.models.deckModel.CardType;
import com.frigg0.smashup.models.deckModel.DeckName;
import com.frigg0.smashup.models.decks.DeckList;
import com.frigg0.smashup.models.decks.DeckUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Cowboys {
    public DeckList constructCowboys(){
        DeckList deckList = new DeckList();
        List<CardModel> list = new ArrayList<>();

        list.add(DeckUtils.generateNewCard(1, DeckName.Cowboys, "Sherrif", 5, "Special: Before this base scores, this minion may duel another player's minion here. Destroy the losing minion.", CardType.Minion, false));
        list.add(DeckUtils.generateNewCard(2, DeckName.Cowboys, "Pinkerton", 4, "Ongoing: When one of your minions here is in a duel, place a +1 powr counter on it.", CardType.Minion, false));
        list.add(DeckUtils.generateNewCard(3, DeckName.Cowboys, "Pinkerton", 4, "Ongoing: When one of your minions here is in a duel, place a +1 powr counter on it.", CardType.Minion, false));
        list.add(DeckUtils.generateNewCard(4, DeckName.Cowboys, "Gunfighter", 3, "This minion may duel another player's minion here. Destroy the losing minion.", CardType.Minion, false));
        list.add(DeckUtils.generateNewCard(5, DeckName.Cowboys, "Gunfighter", 3, "This minion may duel another player's minion here. Destroy the losing minion.", CardType.Minion, false));
        list.add(DeckUtils.generateNewCard(6, DeckName.Cowboys, "Gunfighter", 3, "This minion may duel another player's minion here. Destroy the losing minion.", CardType.Minion, false));
        list.add(DeckUtils.generateNewCard(7, DeckName.Cowboys, "Deputy", 2, "Special: On your turn or during a duel involving your minion, you may discard this card from your hand to give a minion +2 power until the end of the turn", CardType.Minion, false));
        list.add(DeckUtils.generateNewCard(8, DeckName.Cowboys, "Deputy", 2, "Special: On your turn or during a duel involving your minion, you may discard this card from your hand to give a minion +2 power until the end of the turn", CardType.Minion, false));
        list.add(DeckUtils.generateNewCard(9, DeckName.Cowboys, "Deputy", 2, "Special: On your turn or during a duel involving your minion, you may discard this card from your hand to give a minion +2 power until the end of the turn", CardType.Minion, false));
        list.add(DeckUtils.generateNewCard(10, DeckName.Cowboys, "Deputy", 2, "Special: On your turn or during a duel involving your minion, you may discard this card from your hand to give a minion +2 power until the end of the turn", CardType.Minion, false));
        list.add(DeckUtils.generateNewCard(11, DeckName.Cowboys, "High Noon", 0, "One of your minions duels another player's minion at the same base. Destroy the losing minion. If your minion wins, you may play an extra minion there.", CardType.Action, false));
        list.add(DeckUtils.generateNewCard(12, DeckName.Cowboys, "High Noon", 0, "One of your minions duels another player's minion at the same base. Destroy the losing minion. If your minion wins, you may play an extra minion there.", CardType.Action, false));
        list.add(DeckUtils.generateNewCard(13, DeckName.Cowboys, "Stagecoach", 0, "Move or transger up to two of your cardes on the same base to another base.", CardType.Action, false));
        list.add(DeckUtils.generateNewCard(14, DeckName.Cowboys, "Gold Strike", 0, "Play on a base. Ongoing: After you play a minion here, draw a card.", CardType.Action, false));
        list.add(DeckUtils.generateNewCard(15, DeckName.Cowboys, "Run 'Em Off", 0, "One of your minions duels another player's minion at the same base. The winning minion gains +3 power until the end of the turn, and its controller moves the losing minion to another base.", CardType.Action, false));
        list.add(DeckUtils.generateNewCard(16, DeckName.Cowboys, "Quick Draw", 0, "Choose one of your minions. If it is in a duel, it gains +4 power until the end of the turn, otherwise +2 power.", CardType.Action, false));
        list.add(DeckUtils.generateNewCard(17, DeckName.Cowboys, "Quick Draw", 0, "Choose one of your minions. If it is in a duel, it gains +4 power until the end of the turn, otherwise +2 power.", CardType.Action, false));
        list.add(DeckUtils.generateNewCard(18, DeckName.Cowboys, "Form a Posse", 0, "Each of your minions gains +1 power & cannot be destroyed, moved, or rethrned to the hand until the end of the turn.", CardType.Action, false));
        list.add(DeckUtils.generateNewCard(19, DeckName.Cowboys, "Dynamite Surprise", 0, "Special: Before a base scores where you have a minion and are not winning, destroy a minion of power 4 or less there. Spaciel: If another player's card reveals or looks at a card in your hand or deck, destroy one of their minions of power 4 or less.", CardType.Action, false));
        list.add(DeckUtils.generateNewCard(20, DeckName.Cowboys, "Gold in Them Thar Hills", 0, "Look at the top three cards of your deck. Reveal and draw one of them; you may play it as an extra card. Return the rest in any order.", CardType.Action, false));

        deckList.setDeckName("Cowboys");
        deckList.setDeckList(list);

        return deckList;
    }
}
