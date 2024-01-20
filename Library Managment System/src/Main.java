import javax.swing.*;
/**
 * Eric Quispe
 * Course:202410 Software Development I CEN-3024C-16046
 * Date: 1/18/24
 * Main used to run the application
 */
public class Main
{
    public static void main(String[] args)
    {
        // Create and display the frame
        SwingUtilities.invokeLater(() -> {
            MainFrameGUI frame = new MainFrameGUI();
            frame.setVisible(true);
        });

    }// end of main



}// end of class