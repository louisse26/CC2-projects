package pkg123;
import java.io.*;
import java.lang.String;
import java.util.*;
public class Main {


    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
       
     
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        
        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();
        
        int [][] owe = new int[rows][columns] ;
        
        for(int i=0; i<rows; i++){ 
                for(int j =0; j<columns; j++){
                    System.out.println("Enter number of row "+ i + " and column " + j + ":");
                    owe[i][j] = sc.nextInt();
                }
                    
        }
        for(int i = 0; i<owe.length; i++){
            System.out.println("\n Row: " +i+ " \t Column: " +i);
            for(int j = 0; j<owe[i].length; j++){
                System.out.print(owe[i][j] + "      \t");
            }
        }
     
        
  
    
    }
}
