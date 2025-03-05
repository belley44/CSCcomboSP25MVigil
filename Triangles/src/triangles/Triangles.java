package triangles;

import java.util.Scanner;

public class Triangles { 

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); // input scanner
		
				boolean runAgain = true; // create a boolean flag to control the loop
				
				while(runAgain) {
					int size = getValidSize(in);
					System.out.print("Enter the character to fill the triangle: "); // create method to get character
					char fillChar = in.next().charAt(0); // to get user to input character
					System.out.println(fillChar);
					
					// draw the triangle
					drawTriangle(size, fillChar);
					
					// ask user if they want to run again
					System.out.print("Do you want to draw another triangle? (yes/no): ");
					String response = in.next().toLowerCase();
					if(response.equals("no")) {
						runAgain = false; // using the boolean
						
					}
					
					System.out.print("Thank you for using the program!");
					in.close();
					
		}
				
			
				
		
	}
	// method to draw the triangle 	
	
	private static void drawTriangle(int size, char fillChar) {
		for(int i = 1; i <= size; i++) { // loop to control the rows
			// print spaces for alignment
			for(int j = 0; j < i + 1; j++) { // loop to control spaces
				System.out.print(fillChar); // to make sure the character inputed is used
					
			}
			System.out.println();
		}
	}
	
	// method to get size between 1 and 50
	private static int getValidSize(Scanner in) {
		int size; 
		while(true) { // while loop to make sure size is valid
			System.out.print("Enter the size of the triangle (1-50): ");
			size = in.nextInt(); // user input for size
			if(size >= 1 && size <= 50) {
				break;
				
			} else {
				System.out.print("Invalid size. Enter a size between 1 and 50.");
			}
		}
		return size;
		
	}
	

{
	System.out.println();
} 
}
	

