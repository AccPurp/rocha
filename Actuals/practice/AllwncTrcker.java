//Justine Fernando A. Rocha
package practice;

import java.util.Scanner;
public class AllwncTrcker {
	public static void main(String[] args)
	{
		Scanner Bibecodes = new Scanner(System.in);
				
		System.out.println("Welcome to x Family Allowance Gain n Loss Tracker");
		int redo;
        do {
            System.out.println("Please choose the profile you wish to use\n 1. Sibling 1(Eldest)\n 2. Sibling 2\n 3. Sibling 3(Youngest)");
            int sib = Bibecodes.nextInt();

            switch(sib)
            {

                case 1:
                    Sib1();
                break;

                case 2:
                    Sib2();
                break;

                case 3:
                    Sib3();
                break;

                default:
                    System.out.println(" Invalid Input(X) ");
            }
        System.out.println("Would you like to try again?\n1. Yes\n2. No");
            redo=Bibecodes.nextInt();
        }while(redo==1);

    }

    public static void Sib1()
    {

        Scanner Bibecodes = new Scanner(System.in);

        System.out.println("Enter your current Allowance");
        int alw = Bibecodes.nextInt();
        System.out.println("Enter bills paid in total");
        int bll = Bibecodes.nextInt();
        System.out.println("Enter personal expenses in total");
        int per = Bibecodes.nextInt();
        System.out.println("Enter salary gain from part time job (if applicable)");
        int sal = Bibecodes.nextInt();
        System.out.println("How much did you put into savings?");
        int sav = Bibecodes.nextInt();
    
        int total_expenses = Loss(alw,bll,per);
        int total_gain = sal+sav;
        int leftover_money = Left(alw,sal,sav,total_expenses);
    
        System.out.println("Your total Loss, including family fund, is "+total_expenses);
    
         System.out.println("Your total Gain is "+total_gain);
    
             System.out.println("Your total money left is now "+leftover_money);
    
                 System.out.println("Thank you for trusting our services!");



    }



public static void Sib2()
{

    Scanner Bibecodes = new Scanner(System.in);

    System.out.println("Enter your current Allowance");
    int alw = Bibecodes.nextInt();
    System.out.println("Enter bills paid in total");
    int bll = Bibecodes.nextInt();
    System.out.println("Enter personal expenses in total");
    int per = Bibecodes.nextInt();
    System.out.println("Enter salary gain from part time job (if applicable)");
    int sal = Bibecodes.nextInt();
    System.out.println("How much did you put into savings?");
    int sav = Bibecodes.nextInt();

    int total_expenses = Loss(alw,bll,per);
    int total_gain = sal+sav;
    int leftover_money = Left(alw,sal,sav,total_expenses);

    System.out.println("Your total Loss, including family fund, is "+total_expenses);

     System.out.println("Your total Gain is "+total_gain);

         System.out.println("Your total money left is now "+leftover_money);

             System.out.println("Thank you for trusting our services!");


}



public static void Sib3()
{

    Scanner Bibecodes = new Scanner(System.in);

    System.out.println("Enter your current Allowance");
    int alw = Bibecodes.nextInt();
    System.out.println("Enter bills paid in total");
    int bll = Bibecodes.nextInt();
    System.out.println("Enter personal expenses in total");
    int per = Bibecodes.nextInt();
    System.out.println("Enter salary gain from part time job (if applicable)");
    int sal = Bibecodes.nextInt();
    System.out.println("How much did you put into savings?");
    int sav = Bibecodes.nextInt();

    int total_expenses = Loss(alw,bll,per);
    int total_gain = (sal+sav);
    int leftover_money = Left(alw,sal,sav,total_expenses);

    System.out.println("Your total Loss, including family fund, is "+total_expenses);

     System.out.println("Your total Gain is "+total_gain);

         System.out.println("Your total money left is now "+leftover_money);

             System.out.println("Thank you for trusting our services!");


    }

    public static int Loss (int alw_par, int bll_par, int per_par)
    {
        final int fam_fund = 30;
        int subtotalLoss;

        subtotalLoss = (bll_par+per_par+fam_fund);

        return(alw_par - (alw_par-subtotalLoss));

    }

    public static int Left (int alw_par, int sal_par, int sav_par, int total_expenses_par) 
    {
        int money_gain = (alw_par+sal_par+sav_par);

        return(money_gain-total_expenses_par);
    }

}

