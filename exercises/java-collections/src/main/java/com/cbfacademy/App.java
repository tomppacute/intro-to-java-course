package com.cbfacademy;

import java.util.*;

import com.cbfacademy.Library.Book;
import com.cbfacademy.Library.LibrarySystem;

public class App {
    public static void main( String[] args ) {
        LibrarySystem library = new LibrarySystem();
        library.addBook(new Book("Green Eggs & Ham","Dr. Seuss","123456789"));
        library.listAvailableBooks();
    }
}


