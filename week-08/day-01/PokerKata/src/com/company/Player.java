package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {

  private List<Card> hand;

  public Player() {
    this.hand = new ArrayList<>();
  }

  public void newHand(Card card1, Card card2, Card card3, Card card4, Card card5) {
    hand.add(card1);
    hand.add(card2);
    hand.add(card3);
    hand.add(card4);
    hand.add(card5);
  }

  public List<Card> getHand() {
    return hand;
  }
}
