package scrabble;
import java.util.Scanner;
public class Scrabble {

	public static void main(String[] args) {
		String tiles = "quijibo";
		String word = "jobo";
		 
		
		boolean canMakeWord = canSpell(tiles, word);
		if(canMakeWord) {
			System.out.println("yes you can make the word!");
		
		} 
		else {
			System.out.println("you cannot make the word :(.");
			
		}
		
	}
	
	public static boolean canSpell(String tiles, String word) {
	 
		
		
		for(int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			
			boolean found = false;
			
			
			for(int j = 0; j < tiles.length(); j++) {
				char letter2 = tiles.charAt(j);
				if(letter2 == letter) {
					found = true;
					
					
				}
			
			} // fix tiles here
			if(!found) {
				return false;
			}
//			else {
//				tiles = tiles.substring(0, foundIndex) + tiles.substring(foundIndex + 1)
			}
			
		}
		
		return true;
		
		
		
	}

}
