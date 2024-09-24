package Grafix.TwoD.SimpleBOX;

import javax.swing.*; // Importing the Swing library for creating GUI components
import java.awt.*; // Importing AWT for graphics and layout management
import java.awt.event.*; // Importing AWT event classes for handling actions

// Class extending JFrame to create the main window
public class ColorCustomizationGUI extends JFrame {

    // Starting position of the rectangle
    private int x = 0;
    private int y = 50; // Fixed y position
    private final int width = 200; // Width of the rectangle
    private final int height = 100; // Height of the rectangle

    private Color boxColor = Color.BLUE; // Default color for the box
    private Color bgColor = Color.BLACK; // Default background color

    // Constructor to set up the GUI components
    public ColorCustomizationGUI() {
        setTitle("Color Customization Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the layout manager
        setLayout(new BorderLayout());
        // Create a panel for color customization buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Button to change the box color
        JButton boxColorButton = new JButton("Change Box Color");
        boxColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boxColor = JColorChooser.showDialog(null, "Choose Box Color", boxColor);
                repaint(); // Repaint to apply the new box color
            }
        });
        buttonPanel.add(boxColorButton);

        // Button to change the background color
        JButton bgColorButton = new JButton("Change Background Color");
        bgColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bgColor = JColorChooser.showDialog(null, "Choose Background Color", bgColor);
                repaint(); // Repaint to apply the new background color
            }
        });
        buttonPanel.add(bgColorButton);

        // Add the button panel to the frame
        add(buttonPanel, BorderLayout.SOUTH);

        // Create a custom drawing panel for the rectangle
        BoxPanel boxPanel = new BoxPanel();
        add(boxPanel, BorderLayout.CENTER);

        // Create a timer to update the position of the rectangle
        Timer timer = new Timer(250, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the position of the rectangle
                x += 5; // Move to the right by 5 pixels
                if (x > getWidth()) { // If it goes beyond the width of the window
                    x = -width; // Reset position to start from the left
                }
                boxPanel.repaint(); // Repaint the box panel to update the display
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
            setBackground(bgColor); // Set the background color
            g.setColor(boxColor); // Set the color of the box
            g.fillRect(x, y, width, height); // Draw the filled rectangle at the updated position
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(600, 300); // Set preferred size of the panel
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Create an instance of the ColorCustomizationGUI class
        ColorCustomizationGUI gui = new ColorCustomizationGUI();

        // Make the window visible
        gui.setVisible(true);
    }
}
