
/**
 * Eric Quispe
 * Course:202410 Software Development I CEN-3024C-26663
 * Date: 1/18/24
 * Book class is used to create the books based on what the user enters on the text file.
 * here is where the book is assigned id, Title, and author
 */

public class Book
{
    private int id;
    private String title;
    private String author;

    /*
     Book method is to create object book with that information that is provided
     */
    public  Book(int id, String title, String author)
    {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // These methods just get the information stated ID,Title, or Author
    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

}
