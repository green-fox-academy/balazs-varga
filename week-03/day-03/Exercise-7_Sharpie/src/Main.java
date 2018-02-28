public class Main {
  public static void main(String[] args) {

    Sharpie sharpiObj = new Sharpie("green", 45.1f);

    sharpiObj.use();
    sharpiObj.use();
    sharpiObj.use();
    sharpiObj.use();

    System.out.println(sharpiObj.getInkAmount());
  }
}
