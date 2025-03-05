package checkInput;

import java.util.Scanner;


public class CheckInput {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String str = "";
    String word = "";
	
    
    
    int intNum;
    
    float realNum = 987654391.987654391f;
    
    
    double biggerRealNum = 987654321.987654321;
    
    
    
    
    
    
    System.out.print("the word goes here\n");
    
    word = input.next();
    word = word.toUpperCase();
    System.out.println("words go here\n\t " + word );
    
    
    
    
    
    System.out.println("the number goes here\n");
    
    intNum = input.nextInt();
    
    System.out.println("numbers go here\t " + intNum );
    
    
    
    
    System.out.print("the real number goes here\n");
    
    realNum = realNum + realNum;
   
    
    System.out.println("real numbers go here\t " + realNum );
    
    
    
    System.out.print("the big number goes here\n");
    
    biggerRealNum = biggerRealNum + biggerRealNum;
    
    
    System.out.printf("big numbers go here\t " + biggerRealNum );
    
    
    

    
    
    
    
    
    
    
    
    
    
    
	}

}
