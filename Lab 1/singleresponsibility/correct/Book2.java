
package singleresponsibility.correct;

/**
 *
 * @author fabiola
 */
public class Book2 {
    
    private String title;
    private String author;
    private String genre;

    public Book2(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    //public void printAuthorName() {System.out.println("Nome do autor -> "+author);}
    
}
