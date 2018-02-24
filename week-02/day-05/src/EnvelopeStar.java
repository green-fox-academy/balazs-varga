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
    int lineSpace = 10;
    int lineNumber = 16;
    int xStartPosition = 10;
    int yStartPosition = HEIGHT / 2;
    int xEndPosition = WIDTH / 2;
    int yEndPosition = yStartPosition - lineSpace;
    int xOffset = 0;
    int yOffset = 0;

    for (int i = 0; i < lineNumber; i++) {
      graphics.drawLine(xStartPosition + xOffset, yStartPosition, xEndPosition, yEndPosition + yOffset);
      xOffset += lineSpace;
      yOffset -= lineSpace;
    }

    yEndPosition = yStartPosition + lineSpace;
    xOffset = 0;
    yOffset = 0;

    for (int i = 0; i < lineNumber - 1; i++) {
      graphics.drawLine(xStartPosition + xOffset, yStartPosition, xEndPosition, yEndPosition + yOffset);
      xOffset += lineSpace;
      yOffset += lineSpace;
    }
  }

  public static void drawSecondHalfOfFigure(Graphics graphics) {
    int lineNumber = 16;
    int lineSpace = 10;
    int xStartPosition = WIDTH - 10;
    int yStartPosition = HEIGHT / 2;
    int xEndPosition = WIDTH / 2;
    int yEndPosition = yStartPosition - lineSpace;
    int xOffset = 0;
    int yOffset = 0;

    for (int i = 0; i < lineNumber - 1; i++) {
      graphics.drawLine(xStartPosition + xOffset, yStartPosition, xEndPosition, yEndPosition + yOffset);
      xOffset -= lineSpace;
      yOffset -= lineSpace;
    }

    yEndPosition = yStartPosition + lineSpace;
    xOffset = 0;
    yOffset = 0;

    for (int i = 0; i < lineNumber; i++) {
      graphics.drawLine(xStartPosition + xOffset, yStartPosition, xEndPosition, yEndPosition + yOffset);
      xOffset -= lineSpace;
      yOffset += lineSpace;
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