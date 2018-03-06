package Garden;

import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {

    Garden garden = new Garden();

    List<Plants> plants = new ArrayList<>();

    Flower firstFlower = new Flower("yellow");
    plants.add(firstFlower);
    Flower secondFlower = new Flower("blue");
    plants.add(secondFlower);

    Tree firstTree = new Tree("purple");
    plants.add(firstTree);
    Tree secondTree = new Tree("orange");
    plants.add(secondTree);

    garden.isWaterNeeded(plants);

    garden.watering(plants, 40);
    garden.isWaterNeeded(plants);

    garden.watering(plants, 70);
    garden.isWaterNeeded(plants);
  }
}
