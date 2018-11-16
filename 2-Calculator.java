package calculator;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1;
        int num2;
        String op;
 
        System.out.println("Enter first number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        
        System.out.println("Enter operation: ");
        op = sc.next();
        
        if (op.equals("+") || op.equals("Addition")){
        
            System.out.println("Sum is " + (num1 + num2));
        }
        else if (op.equals("-") || op.equals("Subtraction") ){
            System.out.println("Difference is " +(num1 - num2));
        }
        else if(op.equals("*")|| op.equals("Multiplication")){
            System.out.println("Product is " + (num1 * num2));
                
        }
        else if(op.equals("/")|| op.equals("Division")){
            System.out.println("Quotient is " + (num1 / num2));
        }
        else if(op.equals("%") || op.equals("Modulo")){
            System.out.println("Remainder is " +(num1 % num2));
        }
        else 
            System.out.println("Invalid Input");
        
        
        
        
        
        
       

    }
    
}
