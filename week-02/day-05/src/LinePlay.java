import com.sun.glass.events.WheelEvent;
import sun.font.GlyphLayout;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
  public static void mainDraw(Graphics graphics) {
    drawTheFirstFigure(graphics);
    drawTheSecondFigure(graphics);
  }

  public static void drawTheFirstFigure(Graphics graphics) {
    int xStartPosition = 5;
    int yStartPosition = HEIGHT / 10;
    int xEndPosition = 20;
    int yEndPosition = HEIGHT - 30;
    int xOffset = 0;
    int yOffset = 0;
    int numberOfTheLines = 19;
    graphics.setColor(Color.green);

    for (int i = 0; i < numberOfTheLines; i++) {
      graphics.drawLine(xStartPosition, yStartPosition + yOffset, xEndPosition + xOffset, yEndPosition);
      yOffset += 15;
      xOffset += 15;
    }
  }

  public static void drawTheSecondFigure(Graphics graphics) {
    int xStartPosition = WIDTH / 10;
    int yStartPosition = 5;
    int xEndPosition = WIDTH - 10;
    int yEndPosition = 20;
    int xOffset = 0;
    int yOffset = 0;
    int numberOfTheLines = 19;
    graphics.setColor(Color.magenta);

    for (int i = 0; i < numberOfTheLines; i++) {
      graphics.drawLine(xStartPosition + yOffset, yStartPosition , xEndPosition, yEndPosition + xOffset);
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