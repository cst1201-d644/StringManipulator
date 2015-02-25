/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string.manipulator;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class StringManipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Get the user's favorite city.
    System.out.print("Enter the name of your favorite city: ");
    
    String city = keyboard.nextLine();

    // close stream
    keyboard.close();
    
    // Display the number of characters.
    System.out.println("Number of characters: " + city.length());

    // Display the city name in uppercase characters.
    System.out.println(city.toUpperCase());

    // Display the city name in lowercase characters.
    System.out.println(city.toLowerCase());

    // Display the first character in the city name.
    System.out.println(city.charAt(0));
    }
    
}
