package calculator;


import java.util.Scanner;
/********************************************************************************************************
 * This is a simple calculator app. It will add, subtract, mulitply or divide two numbers. The first    *
 * number will be operated on by the second.                                                            *
 *                                                                                                      *
 * There will be a method for each operation.                                                           *
 *                                                                                                      *
 * @author Magnus                                                                                       *
 *                                                                                                      *
 ********************************************************************************************************/

public class Calculator {

	public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.println("Welcome to the calculator!");
         System.out.println("Enter what operation you would like to perform.");
         System.out.println("Addition (add), Subtraction (sub), \n Multiplication" + " (mult), and Division (div).");
         
         String operation = input.next(); 
         
         System.out.println("Enter the two whole numbers:");
         int num1 = input.nextInt();
         int num2 = input.nextInt();
         
         //switch on operation to find out which method to use
         switch(operation) {
         case "add": //  this is an instance where "add" was selected
              add(num1, num2);
              break;
         case "sub":
        	  sub(num1, num2);
        	  break;
         case "mult":
        	   mult(num1, num2);
        	   break;
         case "div":
        	   div(num1, num2);
        	   break;
         default:
        	 System.out.println("invalid entry");
        	 
         
         }
         
	}

	private static void div(int num1, int num2) {
		if(num2 == 0)
		{
			System.out.println("You cannot divide by zero silly!");
			return;
		}
		System.out.printf("%d divided by %d = %d", num1, num2, num1/num2);
	}

	private static void mult(int num1, int num2) {
		
		System.out.printf("%d multiplied by %d = %d", num1, num2, num1 * num2);
		
		
	}

	private static void sub(int num1, int num2) {
		
		System.out.printf("%d subtracted by %d = %d", num1, num2, num1 - num2);
		
		
	}

	private static void add(int num1, int num2) {
		
		System.out.printf("%d added by %d = %d", num1, num2, num1 + num2);
		
	}

}
