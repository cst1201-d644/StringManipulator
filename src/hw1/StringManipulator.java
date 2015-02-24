package hw1;

/**
 * Homework:String Manipulator.
 *
 * @author <a href="mailto:winnie.wu@mail.citytech.cuny.edu">Winnie Wu</a>.
 */
import java.util.Scanner;

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
        
        
        System.out.println("Please enter the name of your favorite city: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int stringSize = input.length();
        String upper = input.toUpperCase();
        String lower = input.toLowerCase();
        char letter = input.charAt(0);

        System.out.println(input + " has " + stringSize + " characters.");
        System.out.println(input + " in all uppercase letters: " + upper);
        System.out.println(input + " in all lowercase letters: " + lower);
        System.out.println("The first character in " + input + " is " + letter + ".");
        
        
        
        
    }
}
