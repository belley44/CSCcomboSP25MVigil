package exam1;

import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Pick you first number.\n");
		double num = input.nextDouble();

		System.out.println("Pick you second number.\n");
		double num2 = input.nextDouble();

		System.out.printf("The answer is " + divider(num, num2) + " when you divide " + num + " and " + num2);

	}

	public static double divider(double x, double y) {
		if (y == 0) {
			System.out.println("You cannot divide by zero silly!");
			return y;	
		}
		if(y > 0) {
		return (x / y);
	}
		return y;
	}
}
