package exam1;

import java.util.Scanner;

public class TenMaker {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Pick two numbers to see if their sum is 10!");

		int num = input.nextInt();
		int num2 = input.nextInt();

		System.out.println(makes100(num, num2));
	}

	public static boolean makes100(int x, int y) {
		return (x + y == 10);
	}

}
