package bottlesOfBeer;

import java.util.Scanner;

public class Bottleofbeers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number!");
		
		
	int beerNum = input.nextInt();

     String word = "bottles";
     
     
     while(beerNum > 0) {
    	 if(beerNum == 1) {
    		 word = "bottle";
    		 
    	 }
    	 
    	 System.out.println(beerNum + " " + word + " of beer on the wall, " + beerNum + " " + word + "of beer.");
    	 beerNum--;
    	 
    	 if(beerNum > 0) {
    		 System.out.println("Take one down, pass it around, " + beerNum + " " + (beerNum == 1 ? "bottle" : "bottles" ) + "of beer on the wall.");
    	 }
    	 else {
    		 System.out.println("Take one down, pass it around, no more bottles of beer on the wall.");
    	 }
     }
    	 
		
		
		
	}

}
