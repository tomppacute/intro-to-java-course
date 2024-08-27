package com.cbfacademy.Library;

import java.util.*;

public class LibrarySystem {

    private List <Book> availableBooks = new ArrayList<>();
    
    public void addBook(Book book){
        availableBooks.add(book);


    }

    public void listAvailableBooks(){
        System.out.println("Available Books are :");
        for (Book book: availableBooks) {
            System.out.println(book);
        }

    }
   
} 
