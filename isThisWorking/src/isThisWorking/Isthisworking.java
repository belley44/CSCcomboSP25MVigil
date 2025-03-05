package isThisWorking;
import java.util.Scanner;


public class Isthisworking {

	public static void main(String[] args) {
	

	
	
		 //method to get number from user
		   public static int getUserNumber() {
			   Scanner scanner = new Scanner(System.in);
			   System.out.print("Enter a number: ");
			   int number = scanner.nextInt();
			   return number;
			   
					  
		   }
		   
		   //method to display the right angle triangle
		   public void displayPattern(int number) {
			   for (int i = 1; i <= number; i++) {
				   System.out.print(i + " ");
				   
			   }
			   System.out.println();
			   
		   }

	   public static void main6(String[] args) {
		   RightAngleLoop rightAngleLoop = new RightAngleLoop();
		   int number;
		try {
			number = RightAngleLoop.getUserNumber();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   rightAngleLoop.displayPattern(number);
		   
	   
		
		
			
			}
		    
}
	 
			
					
		
	


