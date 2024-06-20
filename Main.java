import com.sun.source.tree.Tree;

import java.awt.print.Printable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Books book1 = new Books("On Call", 386, "Jerome Groopman", "2024");
        Books book2 = new Books("Long Island", 422, "Colm Toibin", "2012");
        Books book3 = new Books("Ask Me Again", 216, "Clare Sestanovich", "2009");
        Books book4 = new Books("Parade", 312, "Rachel Cusk", "2022");
        Books book5 = new Books("Cosmic Connections", 577, "Charles Taylor", "2016");

        Set<Books> booksName = new TreeSet<>();
        booksName.add(book1);
        booksName.add(book2);
        booksName.add(book3);
        booksName.add(book4);
        booksName.add(book5);

        System.out.println("Books sorted by their names: ");

        for (Books book : booksName) {
            System.out.println(book);
        }

        Set<Books> booksByPages = new TreeSet<>(Comparator.comparingInt(Books::getPageNumb));
        booksByPages.addAll(booksName);

        System.out.println("Books by their page numbers:");

        for (Books book : booksByPages) {
            System.out.println(book);
        }

    }
}
