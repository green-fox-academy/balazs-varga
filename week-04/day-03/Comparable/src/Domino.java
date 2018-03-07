
/*
  Check out what is the Comparable interface
  Get your Domino class
  Implement the Comparable interface on the Domino
  why? we want to compare based on the result of Domino.compareTo()
  more info here
  First compare the first value and then the second

        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);

  the order of your dominoes should look like this: [[1,5], [2,4], [4,6], [5,2], [6,7], [7,1]]
  Make your Todo class implement Comparable
  It should compare the completed field first
  Then the description
  Or if you haven't got a separate Todo class, or it doesn't contain fields like description and completed, use your Thing class
*/

public class Domino implements Comparable<Domino> {

  private final int[] values;

  Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  public int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }

  @Override
  public int compareTo(Domino compareDomino) {
    if (this.getValues()[0] == compareDomino.getValues()[0]) {
      return 0;
    } else if (this.getValues()[0] < compareDomino.getValues()[0]) {
      return -1;
    } else return 1;
  }
}