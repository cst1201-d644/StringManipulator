package hw1;

import java.util.Scanner;

/**
 * Homework:String Manipulator.
 *
 * @author <a href="mailto:youremail@mail.citytech.cuny.edu">Your Name</a>.
 */
public class StringManipulator {

    /**
     * The main method. This is the method that will execute when you start your
     * program.
     * @param args
     */
    public static void main(String[] args) { 
        /*
         Write a program that asks the user to enter the name of his or her favorite city. 
         Use a String variable to store the input. The program should display the following:
         The number of characters in the city name
         The name of the city in all uppercase letters
         The name of the city in all lowercase letters
         The first character in the name of the city
         */
             System.out.println("Please enter your favorite city: ");

Scanner scan = new Scanner(System.in);

String input = scan.nextLine();
String upper = input.toUpperCase();// all uppercase
String lower = input.toLowerCase();// all Lowercase
int size = input.length();// Number of characters
char inital = upper.charAt(0);// First Character



System.out.println(size);
System.out.println(upper);
System.out.println(lower);
System.out.println(inital);
    }
}
