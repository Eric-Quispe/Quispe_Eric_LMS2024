import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



/**
 * Eric Quispe
 * Course:202410 Software Development I CEN-3024C-16046
 * Date: 1/18/24
 * LMS class runs the Library Management System functions, sort of like the playground to test application features, so this will be
 * the section that will use feature from the other classes with  logic and to make the other code less messy.
 *
 * side notes for myself:
 * adding books again from file will have ID's will not be in order, may need to change now or wait to
 * see how the database feature will be implemented.

 */

public class LibraryManagementSystem
{

    // addBook method will add a book based off the book.txt file
    public static void addBook(Library library)
    {
        // Read book data from text file and add to the collection
        try (BufferedReader reader = new BufferedReader(new FileReader("resources/books.txt"))) {
            String line;

            while ((line = reader.readLine()) != null)
            {
                String[] bookData = line.split(",");// breaking the strings by looking for "," in the text file
                int id = Integer.parseInt(bookData[0]); // assigning ID
                String title = bookData[1]; // assigning title
                String author = bookData[2]; // assigning author

                // method from library to prevent a duplicate book being added based on ID
                if (!library.compareBooks(id)) {
                    Book book = new Book(id, title, author); // creating a new book
                    library.addBook(book); // adding to the collection

                }

            }// end of while loop
            JOptionPane.showMessageDialog(null,"Books from text find have been added.");


        }
        catch (IOException e) // in the event file was not read
        {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }



    // This method will allow the user to enter a book to remove from the library
    public static void removeBook(Library library)
    {
        boolean isNum= false;

        while(!isNum) // while false
        {
            String userInput = JOptionPane.showInputDialog(null, "Please enter the book's ID to remove from the collection:");
            isNum=numberCheck(userInput);

            if (isNum)// if true
           {
               int bookId = Integer.parseInt(userInput);
               if (!library.compareBooks(bookId))
               {
                   JOptionPane.showMessageDialog(null, "Book was was not found collection.");

               }
               else
               {
                   library.removeBook(bookId);// this will refer to the library method to remove the book
                   JOptionPane.showMessageDialog(null, "Book was removed from the collection.");
               }

           }

        }// end of while loop

    }

    /*
    This NumberCheck is to make sure the user enters a number to be able to compare ID numbers to remove when using the
    remove method.
     */
    public static boolean numberCheck(String test)
    {
        boolean isNum = false;
        try
        {
            Integer.parseInt(test);
            isNum=true;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please enter a valid whole number.");

        }

        return isNum;
    }






}// end of LMS class
