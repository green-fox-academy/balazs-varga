import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    int triangleSize = 10;
    int bottomMargin = 50;

    drawBaseTriangle(graphics, bottomMargin);
    drawInnerHorizontalLines(graphics, triangleSize, bottomMargin);
    drawInnerDiagonalLines(graphics, triangleSize, bottomMargin);
  }

  public static void drawBaseTriangle(Graphics graphics, int bottomMargin) {
    int xStartPosition = 0;
    int yStartPosition = HEIGHT - bottomMargin;
    int xEndPosition = WIDTH;
    int yEndPosition = yStartPosition;

    graphics.drawLine(xStartPosition, yStartPosition, xEndPosition, yEndPosition);

    xEndPosition = WIDTH / 2;
    yEndPosition = bottomMargin;

    graphics.drawLine(xStartPosition, yStartPosition, xEndPosition, yEndPosition);

    xStartPosition = WIDTH;

    graphics.drawLine(xStartPosition, yStartPosition, xEndPosition, yEndPosition);
  }

  public static void drawInnerHorizontalLines(Graphics graphics, int triangleSize, int bottomMargin) {
    int lineSpace = 15;
    int numberOfLines = 16;
    bottomMargin += lineSpace;

    int xStartPosition = 10;
    int yPosition = HEIGHT - bottomMargin;
    int xEndPosition = WIDTH - triangleSize;

    int xOffset = 0;
    int yOffset = 0;

    for (int i = 0; i < numberOfLines; i++) {
      graphics.drawLine(xStartPosition + xOffset, yPosition + yOffset, xEndPosition - xOffset, yPosition + yOffset);
      xOffset += triangleSize;
      yOffset -= lineSpace;
    }
  }

  public static void drawInnerDiagonalLines(Graphics graphics, int triangleSize, int bottomMargin) {
    int numberOfLines = 16;
    int xStartPosition = triangleSize * 2;
    int yStartPosition = HEIGHT - bottomMargin;
    int xEndPosition = WIDTH / 2 + triangleSize;
    int yEndPosition = 68;
    int xStartOffset = 0;
    int xEndOffset = 0;
    int yEndOffset = 0;

    for (int i = 0; i < numberOfLines; i++) {
      graphics.drawLine(xStartPosition + xStartOffset, yStartPosition, xEndPosition + xEndOffset, yEndPosition + yEndOffset);
      xStartOffset += 20;
      xEndOffset += 10;
      yEndOffset += 15;
    }

    xStartPosition = WIDTH - triangleSize * 2;
    xEndPosition = WIDTH / 2 - triangleSize;
    xStartOffset = 0;
    xEndOffset = 0;
    yEndOffset = 0;

    for (int i = 0; i < numberOfLines; i++) {
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