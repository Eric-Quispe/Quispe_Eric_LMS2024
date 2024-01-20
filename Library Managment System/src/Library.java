import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Library
/**
 * Eric Quispe
 * Course:202410 Software Development I CEN-3024C-26663
 * Date: 1/18/24
 * Library class will manage the collection of books
 */

{
    public List<Book> bookCollection = new ArrayList<>();// this list hold object Books

    // Method to add a book to the collection
    public void addBook(Book book)
    {
        bookCollection.add(book);
    }


    /* Method to remove a book from the collection by ID which is assigned in the LMS class
     *  removeBook method also has a feature to let the user know that a book wasn't found based on the ID
     * uses a for loop to look through the collect of current books and will remove any book that matches the ID.
     */
    public void removeBook(int bookId)
    {
        Book foundBook = null;
        for (Book book : bookCollection) {
            if (book.getId() == bookId) {
                foundBook = book;
                break;
            }
        }
        if (foundBook != null) {
            bookCollection.remove(foundBook);
        } else {
            System.out.println("Book ID " + bookId + " not found.");
        }
    }

    /**
     * compareBook method checks by ID what on the file to prevent any duplicates from being added into the collection.
     * it assumes the method should be true, but if false meaning a duplicate that information will be used LMS class to
     * prevent the addition of that book.
     */

    public boolean compareBooks(int bookId)
    {
        for (Book book : bookCollection) {
            if (book.getId() == bookId) {
                return true; // Book with this ID already exists
            }
        }
        return false; // No book with this ID exists
    }

    // Method to list all books in the collection ( prints out the information)
    public  String  listAllBooks()
    {
        StringBuilder printBookCollection = new StringBuilder();
        for (Book book : bookCollection)
        {
            printBookCollection.append("ID: ")
                    .append(book.getId())
                    .append(". Title: ")
                    .append(book.getTitle())
                    .append(", Author: ")
                    .append(book.getAuthor())
                    .append("\n"); // New line for separating entries
        }
        return printBookCollection.toString();
    }

}