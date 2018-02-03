package com.pluralsight;

public class Main {

    /*
    https://programmingbydoing.com/
    Finding a value in an arraylist - Assignment #182
     */

    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        numbers.getNumbers();

        //Prompt the user for a number which can be compared against those in the array list
        System.out.println("Enter a number between 1 and 50");
        numbers.getUserNum();

        //Compare the user's number against those in the array list and display your findings
        numbers.compareNum();

    }
}
