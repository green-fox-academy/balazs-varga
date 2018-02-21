import com.sun.glass.events.WheelEvent;
import sun.font.GlyphLayout;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {

    // Fill the canvas with a checkerboard pattern.

    int patternSize = 40;
    int xPosition = 0;
    int yPosition = 0;

    for (int row = 0; row < HEIGHT / patternSize; row++) {
      for (int column = 0; column <= WIDTH / patternSize; column++) {

        if(row % 2 == column % 2) {
          graphics.setColor(Color.white);
        } else {
          graphics.setColor(Color.black);
        }

        graphics.fillRect(xPosition, yPosition, patternSize, patternSize);
        xPosition += patternSize;

        if(column == WIDTH / patternSize) {
          xPosition = 0;
          yPosition += patternSize;
        }
      }
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
      mainDraw(graphics);
    }
  }
}