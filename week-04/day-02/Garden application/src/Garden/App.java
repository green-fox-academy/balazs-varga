package Garden;

public class App {

  public static void main(String[] args) {

    Garden garden = new Garden();

    Flower firstFlower = new Flower("yellow");
    garden.addPlants(firstFlower);
    Flower secondFlower = new Flower("blue");
    garden.addPlants(secondFlower);

    Tree firstTree = new Tree("purple");
    garden.addPlants(firstTree);
    Tree secondTree = new Tree("orange");
    garden.addPlants(secondTree);

    garden.isWaterNeeded(garden.plants);

    garden.watering(garden.plants, 40);
    garden.isWaterNeeded(garden.plants);

    garden.watering(garden.plants, 70);
    garden.isWaterNeeded(garden.plants);
  }
}
