package checkWinner;

public class CheckWinner {

	public static void main(String[] args) {
		char[] arr = { '0', '1', '2', '3', '4', '5', '6', '7', '8' };

		System.out.println(checkWinner(arr));

	}// end main

	public static int checkWinner(char[] arr) {

		String line = "";

		for (int i = 0; i < 8; i++) {
			switch (i) {
			case 0:
				line = "" + arr[0] + arr[1] + arr[2];
				break;
			case 1:
				line = "" + arr[3] + arr[4] + arr[5];
				break;
			case 2:
				line = "" + arr[6] + arr[7] + arr[8];
				break;
			case 3:
				line = "" + arr[0] + arr[3] + arr[6];
				break;
			case 4:
				line = "" + arr[1] + arr[4] + arr[7];
				break;
			case 5:
				line = "" + arr[2] + arr[5] + arr[8];
				break;
			case 6:
				line = "" + arr[0] + arr[4] + arr[8];
				break;
			case 7:
				line = "" + arr[2] + arr[4] + arr[6];
				break;

			} //end of switch

			line = line.toLowerCase();
			

			if (line.equals( "xxx")) {
				return 1;
			}
			if (line.equals( "ooo")) {
				return 2;
			}

		} // end of for loop
		return 0;

	}// end checkWinner

}// end class
