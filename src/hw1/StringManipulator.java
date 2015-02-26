package hw1;
import java.util.Scanner;
/**
 * Homework:String Manipulator.
 *
 * @author <a href="mailto:goutam.kundu@mail.citytech.cuny.edu">Goutam Kundu</a>.
 */
public class StringManipulator {

    /**
     * The main method. This is the method that will execute when you start your
     * program.
     * @param args
     */
    public static void main(String[] args) {
        
         /*Write a program that asks the user to enter the name of his or her favorite city. 
         Use a String variable to store the input. The program should display the following:
         The number of characters in the city name
         The name of the city in all uppercase letters
         The name of the city in all lowercase letters
         The first character in the name of the city*/
         System.out.println("Please enter your favorite city: ");
         Scanner sc = new Scanner(System.in);

        String in = sc.nextLine();
        String Upper = in.toUpperCase();
        String Lower = in.toLowerCase();
        int numberofletter = in.length();
        char Firstword = Upper.charAt(0);

        System.out.println(numberofletter);
        System.out.println(Upper);
        System.out.println(Lower);
        System.out.println(Firstword);
    }
}
