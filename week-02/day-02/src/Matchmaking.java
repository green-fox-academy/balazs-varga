import java.util.*;

public class Matchmaking{
  public static void main(String... args){
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Bözsi","Kat","Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Béla","Todd","Neef","Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> listOfGirls, ArrayList<String> listOfBoys) {
    int sizeOfSmallerList = 0;
    int index = 0;

    if(listOfGirls.size() < listOfBoys.size()) {
      sizeOfSmallerList = listOfGirls.size();
    } else {
      sizeOfSmallerList = listOfBoys.size();
    }

    for (int i = 0; i < sizeOfSmallerList; i++) {
        listOfBoys.add(i + index, listOfGirls.get(i));
        index++;
      }

    return listOfBoys;
  }
}