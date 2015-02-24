package hw1;
import java.util.Scanner;
/**
 * Homework:String Manipulator.
 *
 * @author <a href="mailto:Jianlang.lin@mail.citytech.cuny.edu">Jianlang lin</a>.
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
        String input;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("enter the name of your favorite city:");
        input=keyboard.nextLine();
        int leng=input.length();
        String upper=input.toUpperCase();
        String lower=input.toLowerCase();
        char letter=input.charAt(0);
        System.out.println(leng);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(letter);
        
        
        
        
        
        
                
    }
}
