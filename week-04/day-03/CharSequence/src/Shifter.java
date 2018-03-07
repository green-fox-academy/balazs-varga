public class Shifter implements CharSequence {

  private String string;
  private int offset;

  public Shifter(String string, int offset) {
    this.string = string;
    this.offset = offset;
  }

  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index + 2);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
