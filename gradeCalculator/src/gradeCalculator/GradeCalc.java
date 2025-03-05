package gradeCalculator;

import java.util.Scanner;


public class GradeCalc {

	public static void main(String[] args) {
		
		
		double Scanner;
		int numGrade = 0;
		String letterGrade = "";
		
		 Scanner input =  new Scanner(System.in);
	     System.out.println("What is your grade?");
	     numGrade = (int) input.nextDouble();
	    
		if(numGrade >= 0 && numGrade <= 60)
		letterGrade = "F";
		
		if(numGrade >= 60 && numGrade <= 67)
		letterGrade = "D";
		
		if(numGrade >= 67 && numGrade<= 69)
		letterGrade = "D+";
		
		if(numGrade >= 69 && numGrade <= 72)
		letterGrade = "C-";
		
		if(numGrade >= 72 && numGrade <= 77)
		letterGrade = "C";
		
		if(numGrade >= 77 && numGrade <= 79)
		letterGrade = "C+";
		
		if(numGrade >= 79 && numGrade <= 82)
		letterGrade = "B-";
		
		if(numGrade >= 82 && numGrade <= 87)
		letterGrade = "B";
		
		if(numGrade >= 87 && numGrade <= 89)
		letterGrade = "B+";
		
		if(numGrade >= 89 && numGrade <= 92)
		letterGrade = "A-";
		
		if(numGrade >= 92 && numGrade <= Double.POSITIVE_INFINITY)
		letterGrade = "A";
		
		
		 System.out.println("Your grade is: " + letterGrade);
			
		 
 		
		
				
		
		
    
     

  
		
		
	}

}
