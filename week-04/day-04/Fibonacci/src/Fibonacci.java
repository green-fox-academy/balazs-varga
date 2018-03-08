public class Fibonacci {

  public int fibonacci (int sequenceNumber) {
    if (sequenceNumber == 0 || sequenceNumber == 1) {
      return sequenceNumber;
    } else {
      return fibonacci(sequenceNumber - 1) + fibonacci(sequenceNumber - 2);
    }
  }
}
