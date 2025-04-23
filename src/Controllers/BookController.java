package Controllers;

import Models.Book;

public class BookController {

    public void sortByNameWithInsercion(Book[] books) {
        int n = books.length;
    
        for (int i = 1; i < n; i++) {
            Book aux = books[i];
            int pos = i;
    
            while (pos > 0 && books[pos - 1].getName().compareToIgnoreCase(aux.getName()) < 0) {
                books[pos] = books[pos - 1];
                pos--;
            }
            books[pos] = aux;
        }
    }

    public Book buscarPorNombre(Book[] books, String name) {
        int bajo = 0;
        int alto = books.length - 1;
    
        while (bajo <= alto) {
            int central = bajo + (alto - bajo) / 2;
            String nombreCentral = books[central].getName();
    
            int comparacion = nombreCentral.compareToIgnoreCase(name);
            if (comparacion == 0) {
                return books[central];
            }
    
            if (comparacion < 0) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
    
        return null;
    }
}