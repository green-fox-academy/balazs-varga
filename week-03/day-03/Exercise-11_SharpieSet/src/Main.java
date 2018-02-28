import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Sharpie> sharpieList = new ArrayList<>();

    Sharpie firstSharpie = new Sharpie("blue", 4);
    Sharpie secondSharpie = new Sharpie("black", 6);
    Sharpie thirdSharpie = new Sharpie("yellow", 2);

    sharpieList.add(firstSharpie);
    sharpieList.add(secondSharpie);
    sharpieList.add(thirdSharpie);

    for (int i = 0; i < 100; i++) {
      firstSharpie.use();
    }

    System.out.println("The size of the sharpies is " + sharpieList.size());

    System.out.println("The number of sharpies who has more than 0 ink amount: " + SharpieSet.countUsable(sharpieList));

    SharpieSet.removeTrash(sharpieList);

    System.out.println("The size of the sharpies after the removal is " + sharpieList.size());
  }
}
