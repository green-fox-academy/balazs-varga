public class Counter {

  private int field;
  private int initField;

  public Counter() {
    this.field = 0;
    this.initField = 0;
  }

  public Counter(int field) {
    this.field = field;
    this.initField = field;
  }

  public void add(int number) {
    this.field += number;
  }

  public void add() {
    this.field++;
  }

  public int get() {
    return field;
  }

  public void reset() {
    this.field = initField;
  }
}
