public class calc {
    public static void main(String[] args) {
            if(args.length != 3)
            {
                System.out.println("Usage: java Calculator <operand1> <operator> <operand2>");
                return;
            }
            int operand1=Integer.parseInt(args[0]);
            int operand2=Integer.parseInt(args[2]);
            String operator=args[1];
            switch(operator)
            {
                case "+":
                System.out.println("sum of"+ operand1 +"and" + operand2 +"is:"+(operand1 +operand2));
                break;
                case "-":
                System.out.println("difference between"+operand1+"and"+operand2+"is:"+(operand1-operand2));
                break;
                case "*":
                System.out.println("multiplication between"+operand1+"and"+operand2+"is:"+((operand1)*(operand2)));
                break;
                case "/":
                System.out.println("division between"+operand1+"and"+operand2+"is:"+(operand1/operand2));
                break;
                default:
                System.out.println("wrong entry");
            }
        }
        
    }
