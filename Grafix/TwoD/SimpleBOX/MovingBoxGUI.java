package Grafix.TwoD.SimpleBOX;

import javax.swing.*; // Importing the Swing library for creating GUI components
import java.awt.*; // Importing AWT for graphics and layout management
import java.awt.event.*; // Importing AWT event classes for handling actions

// Class extending JFrame to create the main window
public class MovingBoxGUI extends JFrame {

    // Starting position of the rectangle
    private int x = 0;
    private int y = 50; // Fixed y position
    private final int width = 200; // Width of the rectangle
    private final int height = 100; // Height of the rectangle

    // Constructor to set up the GUI components
    public MovingBoxGUI() {
        // Set the title of the window
        setTitle("Moving Box Example");

        // Set the size of the window (width, height)
        setSize(400, 300);

        // Exit the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the background color of the content pane to black
        getContentPane().setBackground(Color.BLACK); // Set the background to black

        // Add a custom JPanel to draw the box
        BoxPanel panel = new BoxPanel();
        add(panel);

        // Create a timer to update the position of the rectangle
        Timer timer = new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the position of the rectangle
                x += 5; // Move to the right by 5 pixels
                if (x > getWidth()) { // If it goes beyond the width of the window
                    x = -width; // Reset position to start from the left
                }
                panel.repaint(); // Repaint the panel to update the display
            }
        });
        timer.start(); // Start the timer
    }

    // Custom JPanel class to handle the drawing of the box
    private class BoxPanel extends JPanel {
        // This method is called whenever the panel needs to be repainted
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // Call the superclass method to ensure proper painting
            g.setColor(Color.BLUE); // Set the color to blue
            g.fillRect(x, y, width, height); // Draw the filled rectangle at the updated position
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(400, 300); // Set preferred size of the panel
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create an instance of the MovingBoxGUI class
        MovingBoxGUI gui = new MovingBoxGUI();

        // Make the window visible
        gui.setVisible(true);
    }
}
