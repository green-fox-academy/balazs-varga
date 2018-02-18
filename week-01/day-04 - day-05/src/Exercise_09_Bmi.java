public class Exercise_09_Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double bmi = (int) (100 * (heightInM / (massInKg * massInKg) * 703));

        // Print the Body mass index (BMI) based on these values

        System.out.println("The BMI is " + bmi + "%");

    }
}
