/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

/**
 *
 * @author class
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int testScore1 = 90;
        int testScore2 = 99;
        int testScore3 = 80;

        //Display next test scores, one per line
        System.out.println("The test score 1 is:" + testScore1);
        System.out.println("The test score 2 is:" + testScore2);
        System.out.println("The test score 3 is:" + testScore3);

        double average = (testScore1 + testScore2 + testScore3) / 3.0;

        System.out.println("The test average is:" + average);
    }

}
