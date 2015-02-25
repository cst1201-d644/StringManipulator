package hw1;

/**
 * Homework:String Manipulator.
 *
 * @author <a href="mailto:youremail@mail.citytech.cuny.edu">Your Name</a>.
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
    
    System.out.println("please enter the name of your favorite city:");
    Scanner scanner = new Scanner(System.in);
    String city = scanner.nextLine();    
    int leng = city.length();
    System.out.println("number of character: " + leng);
    String upper = city.toUpperCase();
    System.out.println(upper);
    String lower = city.toLowerCase();
    System.out.println(lower);
    char firstletter = city.charAt(0);
    System.out.println(firstletter);
    }
}
