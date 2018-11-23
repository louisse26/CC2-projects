package finalactivity;

import java.util.Scanner;

public class Final {

    public static void main(String[] args) {
           display();
    }
    public static void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What operation would you like? Fibonacci/Factorial");
        while (true) {
            System.out.println("Enter choice: ");
            String cho = sc.next();
            if (cho.equals("Factorial")) {
                factorial();
            } else if (cho.equals("Fibonacci")) {
                fibonacci();
            } else {
                System.out.println("Invalid Input!");
            }
        }
    }
    
    public static void fibonacci() {
         Scanner sc = new Scanner(System.in);
        System.out.print("Input lenght of array");
        int res = sc.nextInt();
        int number[] = new int[res];
        int c = 0;
        for (int j = 0; j < res; j++) {
            System.out.print("Input element for index  " + j + " :");
            int k = sc.nextInt();;
            number[c] = k;
            c++;
        }
        for (int l = 0; l < number.length; l++) {
            System.out.print("f(" + number[l] + ")\t");
        }
        System.out.println("");
        for (int o = 0; o < number.length; o++) {
            System.out.print("" + fib(number[o]) + "\t");
        }
        System.exit(0);
    }

    public static int fib(int x) {
        if (x <= 1) {
            return x;
        } else {
            return fib(x - 1) + fib(x - 2);
        }
    }

    public static void factorial(){
         Scanner sc = new Scanner(System.in);
        System.out.print("Input length of array");
        int factUser = sc.nextInt();
        int num[] = new int[factUser];
        int tc = 0;
        for (int i = 0; i < factUser; i++) {
            System.out.print("Input element for index " + i + " :");
            int u = sc.nextInt();
            num[tc] = u;
            tc++;
        }
        for (int y = 0; y < num.length; y++) {
            System.out.print("f(" + num[y] + ")\t");
        }
        System.out.println("");
        for (int b = 0; b < num.length; b++) {
            System.out.print("" + fact(num[b]) + "\t");
        }
        System.exit(0);
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * fact(n - 1));
        }
    }
        
}