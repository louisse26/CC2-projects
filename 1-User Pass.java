package account;
import java.util.*;
public class Account {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Username: ");
        String name = sc.nextLine();
        
        System.out.println("Password: ");
        String pw = sc.nextLine();
        
        System.out.println("Verification Password: ");
        String vp = sc.nextLine();
        
            if (pw.equals (vp)){
                System.out.println("Correct Password");
            
            }else{
                System.out.println("Invalid Password");
            
                    
        }
          
        
        
        

    }
    
}