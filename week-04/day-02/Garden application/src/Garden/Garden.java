package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private double waterAmount;
  List<Plants> plants;

  public Garden() {
    this.waterAmount = 0;
    plants = new ArrayList<>();
  }

  public void watering(List<Plants> plants, double waterAmount) {
    double waterNeedCount = 0;

    wateringMessage(waterAmount);

    for (Plants plant : plants) {
      if (plant instanceof Flower) {
        if (plant.getWaterLevel() < 5) {
          waterNeedCount++;
        }
      } else if (plant instanceof Tree) {
        if (plant.getWaterLevel() < 10) {
          waterNeedCount++;
        }
      }
    }

    double waterForPlants = waterAmount / waterNeedCount;

    for (Plants plant : plants) {
      if (plant instanceof Flower) {
        if (plant.getWaterLevel() < 5) {
          ((Flower) plant).setCurrentWaterAmount(waterForPlants * 0.75);
        }
      } else if (plant instanceof Tree) {
        if (plant.getWaterLevel() < 10) {
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

  public void isWaterNeeded(List<Plants> plants) {
    for (Plants plant : plants) {
      if (plant instanceof Flower) {
        ((Flower) plant).isWaterNeeded();
      } else if (plant instanceof Tree) {
        ((Tree) plant).isWaterNeeded();
      }
    }
  }

  public void addPlants(Plants plant) {
    plants.add(plant);
  }
}

