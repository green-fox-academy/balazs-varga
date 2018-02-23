import com.sun.glass.events.WheelEvent;
import sun.font.GlyphLayout;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {

    int xStartPosition = 5;
    int yStartPosition = HEIGHT / 5;
    int xEndPosition = 20;
    int yEndPosition = HEIGHT - 30;
    int xOffset = 0;
    int yOffset = 0;

    graphics.setColor(Color.green);

    for (int i = 0; i < 16; i++) {
      graphics.drawLine(xStartPosition, yStartPosition + yOffset, xEndPosition + xOffset, yEndPosition);
      yOffset += 15;
      xOffset += 15;
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