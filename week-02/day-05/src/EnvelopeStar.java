import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    drawFirstHalfOfFigure(graphics);
    drawSecondHalfOfFigure(graphics);
  }

  public static void drawFirstHalfOfFigure(Graphics graphics) {
    graphics.setColor(Color.green);
    int xStartPosition = 10;
    int yStartPosition = HEIGHT / 2;
    int xEndPosition = WIDTH / 2;
    int yEndPosition = yStartPosition - 10;
    int xOffset = 0;
    int yOffset = 0;

    for (int i = 0; i < 16; i++) {
      graphics.drawLine(xStartPosition + xOffset, yStartPosition, xEndPosition, yEndPosition + yOffset);
      xOffset += 10;
      yOffset -= 10;
    }

    yEndPosition = yStartPosition + 10;
    xOffset = 0;
    yOffset = 0;

    for (int i = 0; i < 15; i++) {
      graphics.drawLine(xStartPosition + xOffset, yStartPosition, xEndPosition, yEndPosition + yOffset);
      xOffset += 10;
      yOffset += 10;
    }
  }

  public static void drawSecondHalfOfFigure(Graphics graphics) {
    int xStartPosition = WIDTH - 10;
    int yStartPosition = HEIGHT / 2;
    int xEndPosition = WIDTH / 2;
    int yEndPosition = yStartPosition - 10;
    int xOffset = 0;
    int yOffset = 0;

    for (int i = 0; i < 15; i++) {
      graphics.drawLine(xStartPosition + xOffset, yStartPosition, xEndPosition, yEndPosition + yOffset);
      xOffset -= 10;
      yOffset -= 10;
    }

    yEndPosition = yStartPosition + 10;
    xOffset = 0;
    yOffset = 0;

    for (int i = 0; i < 16; i++) {
      graphics.drawLine(xStartPosition + xOffset, yStartPosition, xEndPosition, yEndPosition + yOffset);
      xOffset -= 10;
      yOffset += 10;
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