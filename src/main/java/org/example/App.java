package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 
{
    public static void main( String[] args )
        throws IOException
    {
        System.out.println("Please enter your name below: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.println("Hello, " +name +", nice to meet you!");
    }
}
