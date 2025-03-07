package siSession;

import java.util.Scanner;

public class IsItZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pick two numbers to see if they total to zero!");
		
		int num = input.nextInt(); // choosing the two numbers
		int num2 = input.nextInt();
//		
//		if(num - num2 == 0) {
//			return true;
//		} else if(!((num - num2) == 0)) {
//		return false;
				
		System.out.println(zerochecker(num, num2)); // sees if the two numbers will equal zero
													// using the zerochecker method of x - y = 0
													// calling zerochecker into the print
		
//		System.out.print(num);
//		System.out.print(num2);
//		System.out.println(num + num2);
		
		
	}
	
	public static boolean zerochecker(int x, int y) {
		return(x - y == 0); 
	}
	
	
}


