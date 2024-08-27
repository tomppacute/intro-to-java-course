package com.cbfacademy.Library;

// import java.util.*;

// import com.cbfacademy.Library.Book;
// import com.cbfacademy.Library.LibrarySystem;

public class App {
    public static void main( String[] args ) {
        LibrarySystem library = new LibrarySystem();
        library.addBook(new Book("Green Eggs & Ham","Dr. Seuss","123456789"));
        library.addBook(new Book("'Til We Have Faces", "C.S. Lewis", "987654321"));
        library.listAvailableBooks();
    }
}


