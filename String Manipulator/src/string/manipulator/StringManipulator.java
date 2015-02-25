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

    System.out.print("Enter the name of your favorite city: ");
    
    String city = keyboard.nextLine();

    keyboard.close();

    System.out.println("Number of characters: " + city.length());

    System.out.println(city.toUpperCase());

    System.out.println(city.toLowerCase());

    System.out.println(city.charAt(0));
    }
    
}
