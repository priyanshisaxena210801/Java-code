import java.util.*;
public class largest
 {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter three number");
            int a=s.nextInt();
            int b=s.nextInt();
            int c=s.nextInt();
            int max=((a>b)?((a>c)?a:c):((b>c)?b:c));
            System.out.println("largest number"+max);
            
        }
        
    }
    
