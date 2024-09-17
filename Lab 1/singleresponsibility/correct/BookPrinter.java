package singleresponsibility.correct;

public class BookPrinter {
    public void printAuthor(Book2 book){
        System.out.println("Nome do autor -> "+book.getAuthor());
    }
}
