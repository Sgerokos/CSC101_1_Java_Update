package DotDrawing_Update;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DotDrawing_Update {

	// Define constants
	private static final int NUM_DOTS = 10;
	private static final int CIRCLE_RADIUS = 50;
	private static final int SQUARE_WIDTH = 100;
	private static final int SQUARE_HEIGHT = 100;

	// Define functions
	private static double distance(int x1, int y1, int x2, int y2) {
	    // Calculate the distance between two points
	    try {
	        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	    } catch (ArithmeticException e) {
	        return Double.POSITIVE_INFINITY;
	    }
	}

	private static void drawCircleDot(Graphics g, int x, int y) {
	    // Draw a dot within the circle
	    g.setColor(Color.BLACK);
	    g.fillOval(x, y, 6, 6);
	}

	private static void drawCircle(Graphics g, int x, int y, int radius) {
	    // Draw a circle at the given position and radius
	    g.setColor(Color.BLACK);
	    g.drawOval(x - radius, y - radius, radius * 2, radius * 2);
	}

	private static void drawSquare(Graphics g, int x, int y, int width, int height) {
	    // Draw a square at the given position and dimensions
	    g.setColor(Color.BLACK);
	    g.drawRect(x, y, width, height);
	}

	private static void drawDotsInCircle(Graphics g) {
	    // Draw the specified number of dots within the circle
	    Random random = new Random();
	    int i = 0;
	    while (i < NUM_DOTS) {
	        int x = random.nextInt(101);
	        int y = random.nextInt(101) - 50;
	        if (distance(x, y, 50, 0) <= CIRCLE_RADIUS) {
	            drawCircleDot(g, x, y);
	            i++;
	        }
	    }
	}

	private static void drawDotsInSquare(Graphics g) {
	    // Draw the specified number of dots within the square
	    Random random = new Random();
	    for (int i = 0; i < NUM_DOTS; i++) {
	        int x = random.nextInt(101) - 125;
	        int y = random.nextInt(101) - 50;
	        drawCircleDot(g, x, y);
	    }
	}

	public static void main(String[] args) {
	    // Create a new JFrame and set its properties
	    JFrame frame = new JFrame("Dot Drawing");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(400, 300);
	    frame.setLocationRelativeTo(null);

	    // Create a JPanel to draw the shapes and dots
	    JPanel panel = new JPanel() {
	        @Override
	        public void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            drawSquare(g, 50, 100, SQUARE_WIDTH, SQUARE_HEIGHT);
	            drawCircle(g, 200, 100, CIRCLE_RADIUS);
	            drawDotsInCircle(g);
	            drawDotsInSquare(g);
	        }
	    };

	    // Add the panel to the frame and show it
	    frame.add(panel);
	    frame.setVisible(true);
	}
}