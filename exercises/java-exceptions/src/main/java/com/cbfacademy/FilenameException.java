package com.cbfacademy;

public class FilenameException extends Exception {
    //Create a custom (checked) exception class called FilenameException.
    public String message;

    public FilenameException(String message) {
        this.message = message;
    // Logging, etc 
}

}
