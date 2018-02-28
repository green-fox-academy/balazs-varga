import java.util.ArrayList;
import java.util.List;

public class Farm {

  private List<Animal> animalList = new ArrayList<>();
  private int freeSpaces = 10;

  public void breed(){
    if(this.freeSpaces > 0) {
      this.animalList.add(new Animal());
    }
    this.freeSpaces--;
  }

  public void addAnimal() {
    this.animalList.add(new Animal());
    this.freeSpaces--;
  }

  public void slaughter() {
    int leastHunger = 0;
    int leastHungerIndex = 0;

    for (int i = 0; i < animalList.size(); i++) {
      int currentHungerValue = animalList.get(i).getHunger();
      if (currentHungerValue < leastHunger) {
        leastHunger = currentHungerValue;
        leastHungerIndex = i;
      }
    }
    animalList.remove(leastHungerIndex);
  }

  public List<Animal> getAnimalList() {
    return animalList;
  }
}
