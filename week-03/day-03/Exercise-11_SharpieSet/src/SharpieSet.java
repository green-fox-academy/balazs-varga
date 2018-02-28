import java.util.List;

public class SharpieSet {

  List<Sharpie> sharpieList;

  public static int countUsable(List<Sharpie> sharpieList) {
    int counter = 0;
    for(Sharpie sharpie : sharpieList) {
      if (sharpie.getInkAmount() > 0) {
        counter++;
      }
    }
    return counter;
  }

  public static List<Sharpie> removeTrash(List<Sharpie> sharpieList) {
    for (int i = 0; i < sharpieList.size(); i++) {
      if(sharpieList.get(i).getInkAmount() <= 0) {
        sharpieList.remove(i);
      }
    }
    return sharpieList;
  }
}
