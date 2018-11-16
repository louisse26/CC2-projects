package oddeven;
import java.util.*;
public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);       
                  
        int a []={3,9,15,20,65,23,18,4,2,14,21};
        
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();
        
        for(int c=10; c<a.length; c++){
            System.out.println("Elements: 3,9,15,20,65,23,18,4,2,14,21\n");
        }
        for(int i=0; i<a.length; i++){
            if(a[i] %2==0){
                even.add(a[i]);
            }else{
                odd.add(a[i]);
            }
        }
        System.out.println("Odd\tEven");
        
        for(int b=0; b<a.length; b++){
            if(b<odd.size() && b>=even.size()){
                System.out.println("\t" + odd.get(b));
            }else if(b>=odd.size() && b<even.size()){
                System.out.println(even.get(b));
            }else if(b<odd.size() && b<even.size()){
                System.out.println(odd.get(b) + "\t" + even.get(b));    
            }
            
            
        }

    }
    
}
