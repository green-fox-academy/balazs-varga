public class Exercise_12_Cuboid {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // Surface Area: 600
    // Volume: 1000
    public static void main(String[] args) {

        double cuboidSideA = 10;
        double cuboidSideB = 10;
        double cuboidSideC = 10;

        double surface = 2 * ((cuboidSideA * cuboidSideB) + (cuboidSideB * cuboidSideC) + (cuboidSideA * cuboidSideC));
        double volume = cuboidSideA * cuboidSideB * cuboidSideC;

        System.out.println("Surface Area: " + (int) surface);
        System.out.println("Volume: " + (int) volume);
    }
}
