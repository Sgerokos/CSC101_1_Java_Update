package TurtleDesign_SG_Star_Update;

import javax.swing.*;
import java.awt.*;

public class TurtleDesign_SG_Star_Update {

	public static void main(String[] args) {
        JFrame frame = new JFrame("Draw SG Star");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawPanel());
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    static class DrawPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set up the graphics object
            Graphics2D g2d = (Graphics2D) g;

            // Draw the letter S
            drawS(g2d);

            // Move the pen to position for letter G
            g2d.translate(100, -50);

            // Draw the letter G
            drawG(g2d);

            // Move the pen to position for star
            g2d.translate(0, 50);
            g2d.rotate(Math.toRadians(20));

            // Draw the star
            drawStar(g2d);
        }

        private void drawS(Graphics2D g) {
            g.setColor(Color.BLUE);
            g.setStroke(new BasicStroke(5));
            g.drawLine(50, 50, 0, 50);
            g.drawLine(0, 50, 0, 25);
            g.drawLine(0, 25, 50, 25);
            g.drawLine(50, 25, 50, 0);
            g.drawLine(50, 0, 0, 0);
        }

        private void drawG(Graphics2D g) {
            g.setColor(Color.RED);
            g.setStroke(new BasicStroke(10));
            g.drawLine(0, 0, 50, 0);
            g.drawLine(50, 0, 50, 50);
            g.drawLine(50, 50, 0, 50);
            g.drawLine(0, 50, 0, 30);
            g.drawLine(0, 30, 15, 30);
        }

        private void drawStar(Graphics2D g) {
            g.setColor(Color.GRAY);
            g.setStroke(new BasicStroke(8));
            for (int i = 0; i < 5; i++) {
                g.drawLine(0, 0, 100, 0);
                g.translate(100, 0);
                g.rotate(Math.toRadians(144));
            }
        }
    }
}