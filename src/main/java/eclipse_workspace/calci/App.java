package eclipse_workspace.calci;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	double num1;
        double num2;
        double ans = 0;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        calculator obj = new calculator();
        switch(op) {
           case '+': ans = obj.add(num1,num2);
              break;
           case '-': ans = obj.sub(num1 , num2);
              break;
           case '*': ans = obj.mul(num1, num2);
              break;
           case '/': ans = obj.div(num1 , num2);
              break;
           default:  System.out.printf("Error! Enter correct operator");
              return;
        }
      //  System.out.print("\nThe result is given as follows:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
     
    }
}
