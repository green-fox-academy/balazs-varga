package Stream;

public class Exercise_10 {

  public static void main(String[] args) {

    // Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
    // it's up to you how you name/create them! Write a Stream Expression to find the foxes with green color!
    // Write a Stream Expression to find the foxes with green color and pallida type!

    Foxes foxes = new Foxes();

    foxes.add(new Fox("Please", "Corsac","Green"));
    foxes.add(new Fox("BadCat", "Pampas", "Brown"));
    foxes.add(new Fox("AsBest", "Corsac","Red"));
    foxes.add(new Fox("Lagopus", "Opal", "Grey"));
    foxes.add(new Fox("Eagle", "Pallida","Green"));

    //Solution with loops

    System.out.println("Foxes with green color:");
    for (int i = 0; i < foxes.getFoxes().size(); i++) {
      if (foxes.getFoxes().get(i).getColor().equals("Green")) {
        System.out.println(foxes.getFoxes().get(i).toString());
      }
    }

    System.out.println();

    System.out.println("Foxes with green color and pallida type:");
    for (int i = 0; i < foxes.getFoxes().size(); i++) {
      if (foxes.getFoxes().get(i).getColor().equals("Green") && foxes.getFoxes().get(i).getType().equals("Pallida")) {
        System.out.println(foxes.getFoxes().get(i).toString());
      }
    }

    System.out.println();

    //Solution with stream

    System.out.println("Foxes with green color:");
    foxes.getFoxes().stream()
            .filter(f -> f.getColor().equals("Green"))
            .forEach(System.out::println);

    System.out.println();

    System.out.println("Foxes with green color and pallida type:");
    foxes.getFoxes().parallelStream()
            .filter(f -> f.getColor().equals("Green") && f.getType().equals("Pallida"))
            .forEach(System.out::println);
  }
}
