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
        /*
         Write a program that asks the user to enter the name of his or her favorite city. 
         Use a String variable to store the input. The program should display the following:
         The number of characters in the city name
         The name of the city in all uppercase letters
         The name of the city in all lowercase letters
         The first character in the name of the city
         */

        String city;
        // Ask the user's favorite city.
        try ( //  Create a Scanner object for keyboard input.
                Scanner keyboard = new Scanner(System.in)) {
            // Ask the user's favorite city.
            System.out.println("Enter the name of your city: ");
            city = keyboard.nextLine();
            // close stream
        }

        // Show the number of characters.
        System.out.println("Number of characters: " + city.length());

        //Show the city name in uppercase characters.
        System.out.println(city.toUpperCase());

            // Show the city name in lowercase characters.
        System.out.println(city.toLowerCase());

        // Show the first character in the city name.
        System.out.println(city.charAt(0));
    }
}
