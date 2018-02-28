public class Main {
  public static void main(String[] args) {

    Farm farm = new Farm();

    for (int i = 0; i < 5; i++) {
      farm.addAnimal();
    }

    System.out.println("Size of the farm: " + farm.getAnimalList().size());

    for (int i = 0; i < 5; i++) {
      farm.breed();
    }

    System.out.println("Size of the farm after breed: " + farm.getAnimalList().size());

    farm.breed();
    System.out.println("Size of the farm after additional breed: " + farm.getAnimalList().size());

    for (int i = 0; i < 4; i++) {
      farm.slaughter();
    }

    System.out.println("Size of the farm after 4 slaughters: " + farm.getAnimalList().size());
  }
}
