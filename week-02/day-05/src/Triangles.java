import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    drawBaseTriangle(graphics);
    drawInnerHorizontalLinesInTriangle(graphics);
    drawInnerDiagonalLinesInTriangle(graphics);
  }

  public static void drawBaseTriangle(Graphics graphics) {
    int xStartPosition = 0;
    int yStartPosition = HEIGHT - 50;
    int xEndPosition = WIDTH;
    int yEndPosition = yStartPosition;

    graphics.drawLine(xStartPosition, yStartPosition, xEndPosition, yEndPosition);

    xEndPosition = WIDTH / 2;
    yEndPosition = 50;

    graphics.drawLine(xStartPosition, yStartPosition, xEndPosition, yEndPosition);

    xStartPosition = WIDTH;

    graphics.drawLine(xStartPosition, yStartPosition, xEndPosition, yEndPosition);
  }

  public static void drawInnerHorizontalLinesInTriangle(Graphics graphics) {
    int xStartPosition = 10;
    int yStartPosition = HEIGHT - 65;
    int xEndPosition = WIDTH - 10;
    int yEndPosition = yStartPosition;
    int xStartOffset = 0;
    int yStartOffset = 0;
    int xEndOffset = 0;
    int yEndOffset = 0;

    for (int i = 0; i < 16; i++) {
      graphics.drawLine(xStartPosition + xStartOffset, yStartPosition + yStartOffset, xEndPosition + xEndOffset, yEndPosition + yEndOffset);
      xStartOffset += 10;
      xEndOffset -=10;
      yStartOffset -= 15;
      yEndOffset = yStartOffset;
    }
  }

  public static void drawInnerDiagonalLinesInTriangle(Graphics graphics) {
    int xStartPosition = 20;
    int yStartPosition = HEIGHT - 50;
    int xEndPosition = WIDTH / 2 + 10;
    int yEndPosition = 67;
    int xStartOffset = 0;
    int xEndOffset = 0;
    int yEndOffset = 0;

    for (int i = 0; i < 16; i++) {
      graphics.drawLine(xStartPosition + xStartOffset, yStartPosition, xEndPosition + xEndOffset, yEndPosition + yEndOffset);
      xStartOffset += 20;
      xEndOffset += 10;
      yEndOffset += 15;
    }

    xStartPosition = WIDTH - 20;
    xEndPosition = WIDTH / 2 - 10;
    xStartOffset = 0;
    xEndOffset = 0;
    yEndOffset = 0;

    for (int i = 0; i < 16; i++) {
      graphics.drawLine(xStartPosition + xStartOffset, yStartPosition, xEndPosition + xEndOffset, yEndPosition + yEndOffset);
      xStartOffset -= 20;
      xEndOffset -= 10;
      yEndOffset += 15;
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