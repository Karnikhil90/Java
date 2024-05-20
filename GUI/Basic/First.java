package GUI.Basic;

/**
 * First
 * 
 * @date 18 - 05 - 2024
 * @author Nikhil Karmakar
 *         This is a basic stuff for leaning only
 */

// imports
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;

public class First {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton click = new JButton();
        click.frame.setTitle("My First Frame");
        frame.setDefaultCloseOperation(3); // * "JFrame.EXIT_ON_CLOSE" or 3 both are same thing
        frame.setSize(420, 420);
        ImageIcon logo = new ImageIcon("/image/icons/whatsapp.ico");
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(new Color(0x85C1E9));

        frame.setVisible(true);
    }
}