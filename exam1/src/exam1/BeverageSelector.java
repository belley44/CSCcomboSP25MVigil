package exam1;

import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = " ";
		System.out.print("Pick a number 1 - 3 to choose a beverage!");
		int userInput = input.nextInt();
		if (userInput == 1) {
			answer = "water";
		}

		if (userInput == 2) {
			answer = "coke";
		}

		if (userInput == 3) {
			answer = "coffee";
		}
		System.out.println("You have picked " + answer + "!");
	}

}
