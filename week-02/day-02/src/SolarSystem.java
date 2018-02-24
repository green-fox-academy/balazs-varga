import java.util.*;

public class SolarSystem{
  public static void main(String... args){
    ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

    // Saturn is missing from the planetList
    // Insert it into the correct position
    // Create a method called putSaturn() which has list parameter and returns the correct list.

    System.out.println(putSaturn(planetList));
    // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune", "Saturn"
  }

  public static ArrayList<String> putSaturn(ArrayList<String> planets) {
    for (int i = 0; i < planets.size(); i++) {
      if (planets.get(i).equals("Jupiter")) {
        planets.add(i + 1, "Saturn");
      }
    }
    return planets;
  }
}