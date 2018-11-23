package finalact;

import java.util.Scanner;
public class FinalAct {
    
 
    public static void main(String[] args) {
        
      display();
            
    }
    public static void display(){
        Scanner sc = new Scanner(System.in);  
            String error = "error";
            while(!"good".equals(error)){
                
                    System.out.println("What do you want to get? factorial/fibonacci"); 
                    String choice = sc.nextLine();
        
                    if (choice.equals("factorial")) {
                        error = "good";
                        factorial();
                    } else if (choice.equals("fibonacci")) {
                        error = "good";
                        fibonacci();
                    }else{
                        System.out.println("Invalid Input");
                    }  
            }    
            
    }
    public static void factorial(){
          Scanner sc = new Scanner(System.in);
          System.out.print("Please enter the index for the array: ");
            int ind = sc.nextInt();
           
            int arr[] = new int[ind];
                System.out.println("Please enter the elements for the array: ");
                for(int i = 0; i<ind; i++ ){
                    int elm = sc.nextInt();
                    arr[i] = elm;
                    
                }
            System.out.print("ELEMENTS: \t");
            for(int i =0;i<ind; i++ ){
                    System.out.print(arr[i]+"\t");
            }
            
            System.out.print("\n"
                    + "FACTORIAL:\t");    
            fac(arr);
                  
    }
    
    public static int[] fac(int[] arr){
        
        for(int i = 0; i<arr.length;i++){
                int facto = 1;
                for(int j = 1; j<=arr[i]; j++){
                    facto = facto*j;
                }
                arr[i] =facto;
                System.out.print(arr[i]+"\t");
            }
          
        return arr;
    }
    
    public static void fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter the index for the array: ");
        int ind = sc.nextInt();
        
        int arr[] = new int[ind];
        System.out.println("Please enter the elements for the array: ");
        for(int i = 0;i<ind;i++){   
            int elm = sc.nextInt();
            arr[i] = elm;
        }
        
        System.out.print("INDEX:\t");
        for(int i = 0; i <ind; i++){
            System.out.print("\tF("+i+"): \t");
        }
        System.out.print("\nELEMENTS: ");
        for(int i = 0; i <ind; i++){
            System.out.print("\t"+arr[i]+ "\t");
        }
        System.out.print("\nFIBONACCI:");
        for(int i = 0; i< ind; i++){
            System.out.print("\t"+ fib(arr[i])+"\t");
        }
        
    }
    public static int fib(int n){
        if(n <=1){
            return n;
        }else
            return fib(n-1)+ fib(n-2);
    }
    
    
    
    
}
