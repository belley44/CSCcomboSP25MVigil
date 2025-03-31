package exam1;

import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Pick two numbers to see if their sum is 10!");

		int num = input.nextInt();
		int num2 = input.nextInt();

		if (makes10(num, num2)) { // updated if statement to make output more coherent
			System.out.println(num + " plus " + num2 + " makes ten!");

		} else {
		}
	}

//		System.out.println(makes10(num, num2)); // initial line i made

	public static boolean makes10(int x, int y) {
		return (x + y == 10);
	}

}
