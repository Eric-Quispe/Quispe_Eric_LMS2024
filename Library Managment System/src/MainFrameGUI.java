import javax.swing.*;
import java.awt.*;

/**
 * Eric Quispe
 * Course:202410 Software Development I CEN-3024C-26663
 * Date: 1/18/24
 * This is the GUI interact for user to use, this section is not completed and will continue to
 * grow with the project, but for now its used as a way to visualize the LMS. Background was created by me using Figma
 * most of the button GUI was made using eclipse window design feature.
 */

public class MainFrameGUI extends JFrame {
    /*
    purpose of MainFrameGui is to create the graphic user interface and give functions for the user to use with the
    jButtons. GUI side will change as more details of the project appear.
     */
    public MainFrameGUI() {
        //created objects of other classes to use features
        LibraryManagementSystem LMS = new LibraryManagementSystem();
        Library library = new Library();// created a library from LMS class

        // Set the title of the window
        setTitle("Library Management System");

        // background image size
        setSize(1440, 1000);

        // Prevent the window from being resized
        setResizable(false);

        // Exit  application when the user closes the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setLayout(null);

        // Add buttons
        JButton btnNewButton = new JButton("Add Book to Collection");
        btnNewButton.setBorderPainted(false);
        btnNewButton.setBackground(new Color(65, 214, 202));
        btnNewButton.setForeground(new Color(233, 255, 253));
        btnNewButton.setOpaque(true);
        btnNewButton.setBounds(995, 267, 307, 45);

        btnNewButton.addActionListener(e ->
        {
            LMS.addBook(library);
        });

        getContentPane().add(btnNewButton);

        //Jbutton to remove books

        JButton btnNewButton_1 = new JButton("Remove book from Collection");
        btnNewButton_1.setForeground(new Color(233, 255, 253));
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setBounds(987, 401, 327, 55);
        btnNewButton_1.addActionListener(e ->
        {
            LMS.removeBook(library);

        });
        getContentPane().add(btnNewButton_1);


        //Jbutton to view collection
        JButton btnNewButton_2 = new JButton("View Library's Collection");
        btnNewButton_2.setForeground(new Color(233, 255, 253));
        btnNewButton_2.setBorderPainted(false);
        btnNewButton_2.setBounds(995, 547, 319, 45);
        btnNewButton_2.addActionListener(e ->
        {
            String bookCollection = library.listAllBooks();
            JOptionPane.showMessageDialog(this, bookCollection);
        });
        getContentPane().add(btnNewButton_2);



        // background image
        ImageIcon backgroundImage = new ImageIcon("resources/mainBackground/Desktop.png");

        //  JLabel to hold the background image
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setOpaque(true);
        backgroundLabel.setLocation(0, 0);
        backgroundLabel.setSize(1440,972);
        getContentPane().add(backgroundLabel);

        // Center  window on the screen
        setLocationRelativeTo(null);
    }


}// of GUI class