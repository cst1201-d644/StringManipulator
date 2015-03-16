package hw1;

/**
 * Homework:String Manipulator.
 *
 * @author <a href="mailto:youremail@mail.citytech.cuny.edu">Your Name</a>.
 */
public class StringManipulator {

    /**
     * The main method. This is the method that will execute when you start your
     * program.
     */
    public static void main(String[] args) {
         System.out.print("Enter the name of your favorite city: ");
   String city = keyboard.nextLine();
    keyboard.close();
  
    System.out.println("Number of characters: " + city.length());

    System.out.println(city.toUpperCase());

    System.out.println(city.toLowerCase());

    System.out.println(city.charAt(0)); 
    }
}
