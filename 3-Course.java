package course;
import java.util.*;
public class Course {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO UC!");
        System.out.println(" Choose Course: \n"
                + "[1] Information Technology\n"
                + "[2] Computer Science");
        String course = sc.nextLine();
        
        
        if(course.equals("1") || course.equals("IT")||course.equals("it")){
            System.out.println(" Major in: \n"
                    + "[1] Network and Security\n"
                    + "[2] Web Development\n"
                    + "[3] Enterprise Resource Planning");
            String major = sc.nextLine();
            
            if(major.equals("1")|| major.equals("Network and Security")){
                System.out.println("You choose Information Technology. Major in Network and Security");
                        
                
            }
            else if(major.equals("2")|| major.equalsIgnoreCase("Web Development")){
                System.out.println("You choose Information Technology. Major in Web Development");

                
            }
            else if(major.equalsIgnoreCase("3")|| major.equals("Enterprise Resourse Planning")){
                System.out.println("You choose Information Technology. Major in Enterprise Resourse Planning");
            
            }
        }
        else if(course.equals("2")|| course.equals("CS")|| course.equals("cs")){
            System.out.println("Major in: \n"
                    + "[1] Mobile Development\n"
                    + "[2] Digital Arts\n"
                    + "[3] Animation");
            String major = sc.nextLine();
            
            if(major.equals("1")||major.equals("Mobile Development")){
                System.out.println(" You choose Computer Science. Major in Mobile Development");
                
            }
            if(major.equals("2")||major.equals("Digital Arts")){
                System.out.println(" You choose Computer Science. Major in Digital Arts");
            }
            if(major.equals("3")||major.equals("Mobile Development")){
                System.out.println(" You choose Computer Science. Major in Mobile Development");
            }
        }  
            else{
                System.out.println("Invalid Input");
            }
        }
        
        
        
        
        

    }
    

