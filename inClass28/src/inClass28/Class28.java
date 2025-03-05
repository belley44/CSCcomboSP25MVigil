package inClass28;

/***********************************************************************************************
/*This is a nested while loop, the outside loop count 1-5 and generates the initialized output, *																		
 * 	running as long as the user says. The inside loop counts until it reaches the              *
 * random number that was found in the outside loop. 	                                       *															
 * 		                                                                                       *																		
 * 			                                                                                   *																	
 * @param args		                                                                           *															
 * @author Magnus	                                                                           *															
 * *********************************************************************************************
 */

import java.util.Random;
import java.util.Scanner;

public class Class28 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner in = new Scanner(System.in);

		int sum = 0; // Initializer
		int nestedCount = 0; // Initializer

		int count = 0; // Initializer
		int quantity = 5; // Initializer

		System.out.print("Enter the number of times to run the loop: ");
		quantity = in.nextInt();

		while (count < quantity) { // loop 1 condition
			count++; // changer
			System.out.println("Outer loop count is: " + count);
			int value = rand.nextInt(100 - 5) + 5;
			System.out.println("Random number is: " + value);
			nestedCount = 0;
			
		while (nestedCount < value) { // loop 2 condition
			nestedCount++; // changer
			System.out.print(nestedCount + " ");
				}
		
			System.out.println();
			sum = sum + value; // finding sum by adding sum of all the random numbers

		} // end of while
		System.out.println("Total is: " + sum);
	} // end of main
} // end of class
