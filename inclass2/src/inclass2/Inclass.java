package inclass2;

public class Inclass {
	class SumOfForNumbers {

	public static void main(String[] args) {
	
		int sum = 1;
		for(int i = 1; i <= 10; i++); {
			sum += 1;
		}
		
		System.out.println("The sum of the first ten natural numbers is: " + sum);
		
	}
	}

}

         class SumOfWhileNumbers {
        	 int sum = 0;
        	 int num = 1;
        	 while(num <= 10) {
        		 sum += num;
        		 num ++;
        	 }
        	 {
        		 System.out.println("The sum of the first ten natural numbers is: " + sum);
        		 
        		 
        		 
        	 }
         }
         import java.util.Scanner
         
         class ForFibonnaci {
        	 public static void main(String[] args) {
        		 Scanner scanner = new Scanner(System.in);
        		 
        		 System.out.println("Enter the number of terms: ");
        		 int n = scanner.nextInt();
        		 
        		 int firstTerm = 0, secondTerm = 1;
        		 
        		 System.out.println("Fibonnaci sequence up to " + n + " terms:");
        		 
        		 for(int i = 1; i <= n; i++) {
        			 System.out.println(firstTerm + " ");
        			 
        			 int nextTerm = firstTerm + secondTerm;
        			 firstTerm = secondTerm;
        			 secondTerm = nextTerm;
        		 }
        		 scanner.close();
        		 
        		 }
        		 
        	 }
         import java.util.Scanner
         
         class WHileFibonnaci {
         public static void main(String[] args) {
    		 Scanner scanner = new Scanner(System.in);
    		 
    		 System.out.println("Enter the number of terms: ");
    		 int n = scanner.nextInt();
    		 
    		
    		 
    		 int firstTerm = 0, secondTerm = 1;
    		 int count = 0;
    		 
    		 System.out.println("Fibonnaci sequence up to " + n + " terms:");
    		 
    		 while(count < n) {
    			 System.out.println(firstTerm + " ");
    			 int nextTerm = firstTerm + secondTerm;
    			 firstTerm = secondTerm;
    			 secondTerm = nextTerm;
    			 
    			 count++;
    		 }
    		
    		 scanner.close();
    			 
    		 }
         
         import java.util.Scanner
         
         class RightAngleLoop {
        	 public static void main(String[] args) {
        		 Scanner scanner = new Scanner(System.in);
        	 
        		 System.out.println("Enter a number: ");
        		 int number = scanner.nextInt();
        		 
        		 for(int i = 1; i <= number; i++) {
        			 for(int j = 1; j <= i; j++) {
        				 System.out.print(j + " ");
        			 }
        			 scanner.close();
        		 }
         }
        	 
         }