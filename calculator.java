import java.util.Scanner;

class calculator
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operation;
    
       System.out.println("enter first number");
       num1 = scanner.nextDouble();

       System.out.println("enter second number");
       num2 = scanner.nextDouble();

       System.out.println("enter operator(+,-,*,/):");
       operation = scanner.next().charAt(0);
     
      Double Result;

       switch (operation)
       {
          case '+':
          Result = num1+num2;
          break;

          case '-':
          Result=num1-num2;
          break;

          case '*':
          Result = num1*num2;
          break;

          case '/':

          if(num2!=0)
          {

          Result= num1/num2;
          }
           
          else
          {
            System.out.println("not divisible");
            return;
          }
             
          break;
       
            default:
                    System.out.println("invalid");
                     return;
       
       }
      System.out.println("Result:" + Result);
      scanner.close();
     }
    }


