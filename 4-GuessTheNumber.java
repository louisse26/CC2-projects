
package guessthenumber;
import java.util.*;
public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int number = 0;
        System.out.print("Enter a number: ");
        number = in.nextInt();
        
        while (number > 0 || number < 1001){
        
         
        if (number > 1000){
             System.out.println("Number cannot exceed to 1000");
             System.out.println("Try again");
             number = in.nextInt();
             
             
         }
       
        else {
            int guess = 0;
            while (guess != number) {
                if (number %2 == 0){
                 System.out.println("The number to be guessed is even");
                }
                else {
                 System.out.println("The number to be guessed is odd");
                }
                System.out.println("Guess a number");
                guess = in.nextInt();

                if (guess > number){
                    System.out.println("Lower");

                }
                else if (guess < number){
                    System.out.println("Higher");

                }
                else {
                    System.out.println("Correct");
                    break;

                }
                
            } break;
        }
      }
    }
}
   

    

    
    

