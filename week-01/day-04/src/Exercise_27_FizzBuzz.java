public class Exercise_27_FizzBuzz {
    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”.

    public static void main(String[] args) {

        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";

        for (int i = 1; i < 101; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(fizzBuzz);
                i++;
            }else if (i % 5 == 0) {
                System.out.println(buzz);
                i++;
            }else if (i % 3 == 0) {
                System.out.println(fizz);
                i++;
            }
            System.out.println(i);
        }
    }
}


