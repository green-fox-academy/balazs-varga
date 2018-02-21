import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {

    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Fill the canvas with lines from the edges, every 20 px, to the center.

    drawLinesToCenter(graphics, 10, 50);
  }

  public static void drawLinesToCenter(Graphics graphics, int x, int y) {
    graphics.drawLine(x , y, WIDTH / 2, HEIGHT / 2);

    int yPosition = 0;
    int xPosition = 0;
    for (int i = 0; i <= WIDTH / 20; i++) {
      graphics.drawLine(xPosition, yPosition, WIDTH / 2, HEIGHT / 2);
      xPosition = WIDTH;
      graphics.drawLine(xPosition, yPosition, WIDTH / 2, HEIGHT / 2);
      xPosition = 0;
      yPosition += 20;
    }

    yPosition = 0;
    xPosition = 0;
    for (int i = 0; i < HEIGHT / 20; i++) {
      graphics.drawLine(xPosition, yPosition, WIDTH / 2, HEIGHT / 2);
      yPosition = HEIGHT;
      graphics.drawLine(xPosition, yPosition, WIDTH / 2, HEIGHT / 2);
      yPosition = 0;
      xPosition += 20;
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