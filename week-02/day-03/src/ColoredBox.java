import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {

    // Draw a box that has different colored lines on each edge.

    graphics.setColor(Color.green);
    graphics.drawLine(20, 50, 300, 50);
    graphics.setColor(Color.blue);
    graphics.drawLine(300, 50, 300, 300);
    graphics.setColor(Color.red);
    graphics.drawLine(300, 300, 20, 300);
    graphics.setColor(Color.black);
    graphics.drawLine(20, 300, 20, 50);
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