package practice;

import java.util.Scanner;

public class Methods2
{
	static double x;
    static Scanner Bibecodes = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int p;
		do
		{
			System.out.println("Metric/Imperial System Converter");
			System.out.print("Convert units from : \n1 - meter to yard \n2 - yard to meter \n3 - inch  to foot \n4 - foot to inch\nPlease choose: ");
			int n = Bibecodes.nextInt();
			switch(n)
			{
			case 1 :
	            meter();
				break;
			case 2 :
				System.out.println("Yard to meter converter");
				System.out.print("Enter the value: ");
		        x = Bibecodes.nextDouble();
	            System.out.println("Result : "+m()+" m");
				break;
			case 3 :
	            foot();
				break;
			case 4 :
				System.out.println("Foot to inch converter");
				System.out.print("Enter the value: ");
		        x = Bibecodes.nextDouble();
	            System.out.println("Result : "+inch()+" inch/es");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			System.out.print("\nDo you want to try again?\n1. Yes\n2. No\n Response : ");
			 p =Bibecodes.nextInt();
			System.out.print("\n");		
		}
		while(p==1);
		System.out.println("[End of Program]");
	}
	public static void meter()
	{
		System.out.println("Meter to yard Converter");
		System.out.print("Enter the value: ");
        x = Bibecodes.nextDouble();
		final double m = 1.0936;
		System.out.println("Result : "+(x/m)+" yards");
	}
	public static double m()
	{
		final double m = 1.0936;
		return x*m;
	}
	public static void foot()
	{
		System.out.println("Inch to foot Converter");
		System.out.print("Enter the value: ");
        x = Bibecodes.nextDouble();
		final double f = 12;
		System.out.println("Result : "+(x/f)+" foot");
	}
	public static double inch()
	{
		final double f = 12;
		return (x*f);
	}
}