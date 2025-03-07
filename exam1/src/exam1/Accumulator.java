package exam1;

import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("GIVE ME A NUMBER!!!!");
		int num = input.nextInt();

		int total = num;

		while (num > 0) {
			System.out.println("GIVE ME A NUMBER!!!!");
			num = input.nextInt();
			total += num;

		}
		System.out.println(total);
		
	}

}
