package circleCalculation;


import java.util.Scanner;


public class CircleCalculation {

	
	public static void main(String[] args)
{
		
		
		
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter the radius: ");
		 int rad = input.nextInt();
		 
		 
		double calculateDiameter = 2 * rad;
		 
		 double calculateArea = Math.PI * rad * rad;
		
		 double calculateCircumference = 2 * Math.PI * rad; 
		
		 System.out.println("The diameter is: " + calculateDiameter);
		 
		System.out.println("The area is: " + calculateArea);
		
		System.out.println("The circumference is: " + calculateCircumference);
		
		 
		 
		
		 
		 
		 
		 
		 
		 
		 
		
    
	 
	
     
     
	}

}
