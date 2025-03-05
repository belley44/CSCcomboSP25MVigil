package loopsies;
/**********************************************************************************
 * This is an app to demonstrate the different kinds of loops and how to use them.* 
 * There will be a few while loops, a few for loops,                              *
 * and we will cover enhanced for loops when the time is right!                   *
 * @author Magnus                                                                 *
 * @date 2-17-25                                                                  *
 *                                                   *
 */

public class Loopsies {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		int x = 3;//initializer where we initialize 'x' to be used // first thing to happen
        while(x > 0) {//condition // second through the end thing to happen
        	System.out.println(x); // third thing to happen
        	x = x - 1;//right-associated, and this is the changer // fourth thing to happen
        }//end of body 
        System.out.println("BLAST OFF!!"); // after loop
        
        
        int n = 3;
        while(n != 1) {
        	System.out.println(n);
        	if(n % 2 == 0)// if n is even
        	{
        		n = n / 2;
        	
        	}else // its odd
        		
        		n = 3 * n + 1;
        	
        }
	}
        int i = 2;
        {
        while(i <= 8) {
        	if(i == 8)
        	{ 
        		System.out.print(i);
        		break;
        		
        	}
        	System.out.print(i + ", ");
        	i += 2;// is the same as i = i + 2
        }
//        System.out.println();
//        
//        i = 1;
//        int j = 1;
//        while(i <=10)
//        {
//        	j = 1;
//        	while(j <= 10)
//        	{
//        		System.out.printf("%4d", j * i);
//        		j++;
//        		
//        	}
//        	i++;
//        	System.out.println();
//        }
  
        }
        {
        for(int i1 = 0; i <= 10; i++)// is the rows
        {
        	for(int j = 1; j <= 10; j++)// is the columns
        	{	
        		System.out.printf("%4d", j * i);
        	}
        
        System.out.println();
        
        
}}}
