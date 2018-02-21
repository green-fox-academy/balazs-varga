import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.util.Random;

public class FourRectangles {

  public static void mainDraw(Graphics graphics){

    // draw four different size and color rectangles.
    // avoid code duplication.

    Random randomColor = new Random();
    int xOffset = 0;
    int yOffset = 0;
    int rectangleSizeOffset = 30;

    for (int i = 0; i < 4; i++) {
      graphics.setColor(new Color (randomColor.nextInt(255), randomColor.nextInt(255), randomColor.nextInt(255)));
      graphics.fillRect(50 + xOffset, 50 + yOffset, 100 + rectangleSizeOffset, 50 + rectangleSizeOffset);
      xOffset += 10;
      yOffset += 20;
      rectangleSizeOffset += 30;
    }
  }

  //    Don't touch the code below
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
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}