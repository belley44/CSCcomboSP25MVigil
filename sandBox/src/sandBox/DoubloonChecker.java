package sandBox;
import java.util.Scanner;
public class DoubloonChecker {
//Access modifier-keyword-return type-method name(arguments)
	public static boolean isDoubloon(String str) { // method to check if a string is a doubloon
		
		
		// convert to lowercase to ignore case sensitivity
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			
			if(currentChar == '\0') {
				continue;
				
		}
           
			int count = 0;
			for(int j = 0; j < str.length(); j++ ) {
				if(str.charAt(j) == currentChar)
					count++;
				
			    }
        
		
		if(count != 2) {
			return false;
		}
		
		for(int k = 0; k < str.length(); k++) {
			if(str.charAt(k) == currentChar) {
				str = str.substring(0, k) + '\0' + str.substring(k + 1);
				}
			}
		}

	return true;
	
}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word to check if it is a doubloon: ");
		String word = input.nextLine();
		
		if(isDoubloon(word)) {
			System.out.println(word + " is a doubloon!");
		} else {
			System.out.println(word + " is not a doubloon.");
			
		}
		
		input.close();
	}
}
