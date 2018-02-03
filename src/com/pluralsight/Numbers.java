package com.pluralsight;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Numbers {

    //Create a variable to store the user's number for comparison
    private int userNum;

    //Create an array list to store integers
    private ArrayList<Integer> numbers = new ArrayList<>();


    public void getNumbers() {
        //Initialize a random number generator
        Random r = new Random();

        //Fill the array with 10 random numbers up to 50 and print them out
        for (int index = 0; index < 10; index++) {
            int number = r.nextInt(50);
            numbers.add(number);
            System.out.println(number);
        }
    }

    public void getUserNum() {
        Scanner keyboard = new Scanner(System.in);
        do{
            try {
                int userNum = keyboard.nextInt();
                if (userNum > 0) {
                    this.userNum = userNum;
                    break;
                } else {
                    System.out.println("Must be a number between 1 and 50. Try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Must be a number between 1 and 50. Try again");
                keyboard.next();
            }
        } while (true);
    }

    public void compareNum() {
        //Compare the user's number against those in the array list and display your findings
        int index = 0;
        char pass = 'N';
        while(index < numbers.size()){
            if(numbers.get(index).equals(userNum)){
                System.out.println("The number " + userNum + " is in the array list");
                pass = 'Y';
                break;
            }
            else{
                index++;
            }
        }
        if (!(pass == 'Y')){
            System.out.println("Sorry. Your number was not in the array");
        }
    }

}
