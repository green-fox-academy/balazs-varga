import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {

    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)

    Random randomNumber = new Random();
    int squareSize = 3;
    for (int i = 0; i < 100; i++) {
      int randomXPosition = randomNumber.nextInt(WIDTH);
      int randomYPosition = randomNumber.nextInt(HEIGHT);
      int randomColor = randomNumber.nextInt(106) + 150;
      graphics.setColor(new Color(randomColor,randomColor, randomColor));
      graphics.fillRect(randomXPosition, randomYPosition, squareSize, squareSize);
    }
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      this.setBackground(Color.black);
      mainDraw(graphics);
    }
  }
}