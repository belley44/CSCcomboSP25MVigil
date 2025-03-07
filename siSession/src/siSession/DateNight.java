package siSession;
import java.util.Scanner;
public class DateNight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		String letter = input.next();
//		
//		String a = "movie";
//		String b = "park";
//		String c = "boardgame";
//		String d = "concert";
//		System.out.print("Pick a letter to find out your suprise date:  !" + letter);
		String answer = " ";
		System.out.print("Pick a number 1 - 4 for a suprise date idea!");
			int userInput = input.nextInt();
			if(userInput == 1) {
				answer = "movie"; 
			}
			if(userInput == 2) {
				answer = "park";
			}
			if(userInput == 3) {
				answer = "boardgame";
			}
			if(userInput == 4) {
				answer = "concert";
				
			}
			System.out.print("You have selected !" + answer);
		
			
	
			
				
			
	
//	public static void dateNight(String a, String b, String c, String d) {
//		return
//		
	}
	

	

}
