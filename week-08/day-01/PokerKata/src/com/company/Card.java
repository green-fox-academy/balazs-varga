package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
  private Object value;
  private String color;
  private List<Object> values = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "J", "Q", "K", "A"));
  private List<Character> colors = new ArrayList<>(Arrays.asList('C', 'D', 'H', 'S'));

  public Card(Object value, String color) {
    this.value = value;
    this.color = color;
  }

  public Card() {
  }

  public List<Object> getValues() {
    return values;
  }

  public List<Character> getColors() {
    return colors;
  }

  public Card biggerCard(Card card1, Card card2) {
    if (card1.valueToInt() > card2.valueToInt()) {
      return card1;
    } else
      return card2;
  }

  public int valueToInt(){
    if (value.equals("J")){
      return 11;
    }
    else if (value.equals("Q")){
      return 12;
    }
    else if (value.equals("K")){
      return 13;
    }
    else if (value.equals("A")){
      return 14;
    } else {
      return (int) value;
    }
  }
}
