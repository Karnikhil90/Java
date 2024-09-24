package Grafix.TwoD.SimpleBOX;

import javax.swing.*; // Importing the Swing library for creating GUI components
import java.awt.*; // Importing AWT for graphics and layout management

// Class extending JFrame to create the main window
public class SimpleBoxGUI extends JFrame {

    // Constructor to set up the GUI components
    public SimpleBoxGUI() {
        // Set the title of the window
        setTitle("2D Box Example");

        // Set the size of the window (width, height)
        setSize(400, 300);

        // Exit the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a custom JPanel to draw the box
        add(new BoxPanel());
    }

    // Custom JPanel class to handle the drawing of the box
    private class BoxPanel extends JPanel {
        // This method is called whenever the panel needs to be repainted
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // Call the superclass method to ensure proper painting
            // Draw a rectangle (x, y, width, height)
            g.setColor(Color.BLUE); // Set the color to blue
            g.fillRect(50, 50, 200, 100); // Draw the filled rectangle
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create an instance of the SimpleBoxGUI class
        SimpleBoxGUI gui = new SimpleBoxGUI();

        // Make the window visible
        gui.setVisible(true);
    }
}
