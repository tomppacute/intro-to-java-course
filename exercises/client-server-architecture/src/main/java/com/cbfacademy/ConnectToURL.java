package com.cbfacademy;
import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;
import java.net.MalformedURLException;

public class ConnectToURL {
    public static void main(String[] args) throws Exception{
        try {
            URL myURL = new URL("https://codingblackfemales.com/");
            URLConnection myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            String contentType = myURLConnection.getContentType();
            System.out.println(contentType);
            
        } 
        catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
