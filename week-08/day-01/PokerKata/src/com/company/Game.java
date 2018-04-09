package com.company;

public class Game {

  public Player highCard(Player player1, Player player2) {
    Card card1 = new Card();
    Card card2 = new Card();

    for (int i = 0; i < player1.getHand().size() - 1; i++) {
      card1 = card1.biggerCard(player1.getHand().get(i), player1.getHand().get(i + 1));
      card2 = card2.biggerCard(player2.getHand().get(i), player2.getHand().get(i + 1));
    }

    if (card1.valueToInt() > card2.valueToInt()){
      return player1;
    } else
      return player2;
  }
}
