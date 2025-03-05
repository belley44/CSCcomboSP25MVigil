package arrayFun;

import java.util.Arrays;
import java.util.Random;

public class ArrayFun {

	public static void main(String[] args) {
		Random rand = new Random();

		int[] arr = new int[10]; // array the length of 10, starts as default of zero

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(30) + 70; // 30 is the amount of values we want, 0-29
											// 70 is what we add to get to the range we want. 70-99
		}
//		System.out.println(Arrays.toString(arr));

		int seventies = 0;
		int eighties = 0;
		int nineties = 0;

		for (int i : arr) { // : means in
			if (i >= 90) {
				nineties++;
			} else if (i >= 80) {
				eighties++;
			} else {
				seventies++;

			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.printf("Seventies: %d%n Eighties: %d%n Nineties: %d%n" , seventies, eighties, nineties);
	}

}
