
package fibonacci2;
import java.util.*;
public class Fibonacci2 {

  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= num; i++) {
        System.out.print("f(" + i + ")\t");
            System.out.print("");
            
        }
        System.out.println("");
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(fibbonacci(j) + "\t ");

            }
            System.out.println("");
        }

    }

    public static int fibbonacci(int input) {
        if (input == 0) {
            return 0;
        }
        if (input == 1) {
            return 1;
        } else {
            return fibbonacci(input - 1) + fibbonacci(input - 2);
        }

    }
    }

    

