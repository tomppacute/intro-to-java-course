package com.cbfacademy.strings;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        return word1+word2+word3;
    }

    public static Boolean areEqual(String word1, String word2) {
        return word1.equals(word2);
    }

    public static String format(String item, int quantity, double price) {
        String sentence = "Item: %s. Price: £%.2f. Quantity:%s";
        String result = String.format(sentence,item,price,quantity);
        // System.out.print(result);
        return result;
    }
}
