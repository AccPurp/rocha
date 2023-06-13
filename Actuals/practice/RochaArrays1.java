package practice;

import java.util.Scanner; 

public class RochaArrays1 
{

	public static void main(String[] args) 
    {
		Scanner Bibecodes = new Scanner(System.in);

		System.out.println("Please enter your 1, 5, or 10 peso Bills.");

		int peso,
        N=19,
        A=0,
        B=0,
        C=0;
		int []value= new int[21];
		for (peso=0;peso<= N; peso++){
			System.out.print("["+peso+"]=: ");
			value[peso] = Bibecodes.nextInt();}
		for (peso=0;peso<= N; peso++){
			if (value[peso]==1) A++;
			}
		for (peso=0;peso<= N; peso++){
			if (value[peso]==5) B++;
			}
		for (peso=0;peso<= N; peso++){
			if (value[peso]==10) C++;
		}
		System.out.println("Your total sums up to "+A+" amount of peso bills");
		System.out.println("Your total sums up to "+B+" amount of peso bills");
        System.out.println("Your total sums up to "+C+" amount of peso bills");
	    }
            {
         System.out.println("End of Program");
        
    }

}
