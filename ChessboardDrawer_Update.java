package ChessboardDrawer_Update;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessboardDrawer_Update {
    private static final int BOARD_SIZE = 8;
    private static final int SQUARE_SIZE = 60;
    private static final int SCREEN_SIZE = BOARD_SIZE * SQUARE_SIZE;

    private static void drawSquare(Graphics g, int size, Color color, int x, int y) {
        g.setColor(color);
        g.fillRect(x, y, size, size);
    }

    private static void drawBoard(Graphics g, int size, int boardSize) {
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                // Set the position for the next square
                int x = col * size;
                int y = row * size;

                // Set the color for the square
                Color color;
                if ((row + col) % 2 == 0) {
                    color = Color.WHITE;
                } else {
                    color = Color.BLACK;
                }

                // Draw the square
                drawSquare(g, size, color, x, y);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chessboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawBoard(g, SQUARE_SIZE, BOARD_SIZE);
            }
        };
        panel.setPreferredSize(new Dimension(SCREEN_SIZE, SCREEN_SIZE));

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}