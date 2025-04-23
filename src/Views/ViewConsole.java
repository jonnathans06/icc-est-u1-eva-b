package Views;

import Models.Book;

public class ViewConsole {
    public void imprimirLibros (Book[] books){
        for (int i = 0; i < books.length; i++){
            System.out.println(books[i]);
        }
    }
}
