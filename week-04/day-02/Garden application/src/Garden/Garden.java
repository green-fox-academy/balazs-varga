package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private double waterAmount;
  List<Plant> plants;

  public Garden() {
    this.waterAmount = 0;
    plants = new ArrayList<>();
  }

  public void watering(List<Plant> plants, double waterAmount) {
    double waterNeedCount = 0;

    wateringMessage(waterAmount);

    for (Plant plant : plants) {
      if (plant instanceof Flower) {
        if (plant.getWaterLevel() < Flower.getWaterLimit()) {
          waterNeedCount++;
        }
      } else if (plant instanceof Tree) {
        if (plant.getWaterLevel() < Tree.getWaterLimit()) {
          waterNeedCount++;
        }
      }
    }

    double waterForPlants = waterAmount / waterNeedCount;

    for (Plant plant : plants) {
      if (plant instanceof Flower) {
        if (plant.getWaterLevel() < Flower.getWaterLimit()) {
          ((Flower) plant).setCurrentWaterAmount(waterForPlants * 0.75);
        }
      } else if (plant instanceof Tree) {
        if (plant.getWaterLevel() < Tree.getWaterLimit()) {
          ((Tree) plant).setCurrentWaterAmount(waterForPlants * 0.4);
        }
      }
    }
  }

  private void wateringMessage(double waterAmount) {
    System.out.println();
    this.waterAmount = waterAmount;
    System.out.println("Watering with " + waterAmount);
  }

  public void isWaterNeeded(List<Plant> plants) {
    for (Plant plant : plants) {
      if (plant instanceof Flower) {
        ((Flower) plant).isWaterNeeded();
      } else if (plant instanceof Tree) {
        ((Tree) plant).isWaterNeeded();
      }
    }
  }

  public void addPlants(Plant plant) {
    plants.add(plant);
  }
}

