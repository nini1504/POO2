package singleresponsibility;


import singleresponsibility.correct.BookPrinter;

public class SingleResponsibility {
    
    public SingleResponsibility() {
        doIncorrectImplementation();
        doCorrectImplementation();
    }
    
    
    public void doIncorrectImplementation() {
        /**
         * Considere uma classe que contenha informações sobre um livro.
         * A única função dessa classe deve ser conter dados relacionados a livros e operações relacionadas a livros. 
         */

        /**
         * Ter um método que imprime o nome do autor nessa classe viola o Princípio da Responsabilidade Única
         */

    }
    
    
    public void doCorrectImplementation() {
        singleresponsibility.correct.Book2 book = new singleresponsibility.correct.Book2("Clean Architecture", "Robert Martin", "Science");
        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printAuthor(book);

    }
    
    public static void main(String [] args ) {
        SingleResponsibility sr = new SingleResponsibility();
      
    }
    
    
}
   
