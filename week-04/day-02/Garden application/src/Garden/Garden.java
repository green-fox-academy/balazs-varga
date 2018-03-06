package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  public static void main(String[] args) {

    List<Object> plants = new ArrayList<>();

    Flower firstFlower = new Flower("yellow");
    plants.add(firstFlower);
    Flower secondFlower = new Flower("blue");
    plants.add(secondFlower);

    Tree firstTree = new Tree("purple");
    plants.add(firstTree);
    Tree secondTree = new Tree("orange");
    plants.add(secondTree);
    
  }

}

