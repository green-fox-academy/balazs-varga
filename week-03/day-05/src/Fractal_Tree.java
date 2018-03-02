import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Fractal_Tree {

  public static void mainDraw(Graphics graphics) {
    drawTree(graphics, WIDTH / 2, HEIGHT - 100, -90, 11);
  }

  public static void drawTree(Graphics graphics, int x1, int y1, double angle, double depth) {
    graphics.setColor(Color.yellow);
    if (depth == 3) return;
    int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 9.0);
    int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 9.0);
    graphics.drawLine(x1, y1, x2, y2);
    drawTree(graphics, x2, y2, angle - 23, depth - 1);
    drawTree(graphics, x2, y2, angle --, depth - 1);
    drawTree(graphics, x2, y2, angle + 23, depth - 1);
  }

  //    Don't touch the code below
  static int WIDTH = 1000;
  static int HEIGHT = 1000;

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
      this.setBackground(new Color(45, 46, 89));
      mainDraw(graphics);
    }
  }
}