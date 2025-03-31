package arrayReversal;
import java.util.Scanner;
public class ArrayReversal {

	public static void main(String[] args) {
		

		public class ReverseOrder {
		        Scanner scanner = new Scanner(System.in);
		        int[] numbers = new int[100];
		        int count = 0;

		 System.out.println("Enter positive integers (enter a negative number to end):");
		

		        while (count < 100) {
		            int num = scanner.nextInt();
		            if (num < 0) {
		                break;
		            }
		            numbers[count] = num;
		            count++;
		        }

		        System.out.println("Numbers in reverse order:");
		        for (int i = count - 1; i >= 0; i--) {
		            System.out.println(numbers[i]);
		        }

		        scanner.close();
		    }
	}
}
		