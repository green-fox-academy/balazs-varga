public class AppendA {

    // - Create an array variable named `nimals`
    //   with the following content: `["kuty", "macsk", "cic"]`
    // - Add all elements an `"a"` at the end

  public static void main(String[] args) {
    String[] nimals = {"kuty", "macsk", "cic"};

    for (int i = 0; i < nimals.length; i++) {
      nimals[i] += 'a';
    }

    for (int i = 0; i < nimals.length; i++) {
      System.out.println(nimals[i]);
    }
  }
}
