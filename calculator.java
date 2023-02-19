import java.util.*;
public class calculator {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("enter a number 1:");
            int a= s.nextInt();
            int b=s.nextInt();
            System.out.println("press 1 for addition");
            System.out.println("press 2 for subtraction");
            System.out.println("press 3 for multiplication");
            System.out.println("press 4 for division");
            int choice=s.nextInt();
            switch(choice){
                case 1:
                int sum=a+b;
                System.out.println("sum is"+sum);
                break;
                case 2:
                int sub=a-b;
                System.out.println("subtracted value is"+sub);
                break;
                case 3:
                int mul=a*b;
                System.out.println("multiplied value is"+mul);
                break;
                case 4:
                int div=a/b;
                System.out.println("division:"+div);
                break;
                default:
                System.out.println("wrong entry");
                break;
    
    
            }
    
            
        }
        
    }
    
