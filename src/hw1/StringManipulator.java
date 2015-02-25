package hw1;

import java.util.Scanner;

/**
 * Homework:String Manipulator.
 *
 * @author <a href="mailto:Evan.Chin@mail.citytech.cuny.edu">Evan Chin</a>.
 */
public class StringManipulator {

    /**
     * The main method. This is the method that will execute when you start your
     * program.
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

        String city;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite city?");
        city = scanner.nextLine();

        String upper = city.toUpperCase();
        String lower = city.toLowerCase();
        char letter = city.charAt(2);
        int stringSize = city.length();
        System.out.println(city + " has " + stringSize + " letters.");
        System.out.println(city.toUpperCase());
        System.out.println(city.toLowerCase());
        System.out.println(city.charAt(0));

    }
}
