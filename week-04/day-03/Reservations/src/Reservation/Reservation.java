package Reservation;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Reservation implements Reservationy {

  private Random random = new Random();
  private int randomNumber = 0;
  private final int CODE_LENGTH = 8;

  @Override
  public String getDowBooking() {
    String[] days = {"MON", "THU", "WED", "THU", "FRI", "SAT", "SUN"};

    randomNumber = random.nextInt(days.length);

    return days[randomNumber];
  }

  @Override
  public String getCodeBooking() {
    char[] alphanum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    StringBuilder generatedCode = new StringBuilder();

    for (int i = 0; i < this.CODE_LENGTH; i++) {
      randomNumber = random.nextInt(alphanum.length);
      generatedCode.append(alphanum[randomNumber]);
    }
    return generatedCode.toString();
  }

  public int getInt() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      try {
        return scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Wrong input, please provide a number!");
        scanner.nextLine();
      }
    }
  }

  public static void main(String[] args) {
    Reservation reservation = new Reservation();

    System.out.println("~~~~~ Reservation generator ~~~~~");
    System.out.println("Please provide how much reservations would you generate: ");

    int inputNumber = reservation.getInt();

    for (int i = 0; i < inputNumber; i++) {
      System.out.println("Booking# " + reservation.getCodeBooking() + " for " + reservation.getDowBooking());
    }
  }
}
