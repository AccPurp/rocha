package practice;

import java.util.Scanner;
public class GradingProgram {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
				
		System.out.println("							Welcome to Student Grade Verifier\n");
		int ans;
		do
		{
		System.out.print("What term grade you want to verify (Enter 1 if Prelim, 2 if Midterm and 3 if Final)? ");
		int term = input.nextInt();
		
		switch(term)
		{
		case 1:
			PrelimTerm();
			break;
		case 2:
			MidTerm();
			break;
		case 3:
			FinalTerm();
			break;
		default:
			System.out.println("Wrong input!!!");
        }
		System.out.print("Do you want another verification (Enter 1 if yes or 2 if no)?");
		ans=input.nextInt();
		}while(ans==1);
	}
	
	
	public static void PrelimTerm()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many laboratory activities have you performed? ");
		int lab_activities = input.nextInt();
		double total_lab_activities=sum(lab_activities);
		System.out.println("Total Laboratory Activities: "+total_lab_activities);
		
		System.out.print("How many evaluation or short quiz did you take? ");
		int evaluation = input.nextInt();
		double total_evaluation=sum(evaluation);
		System.out.println("Total Evaluation: "+total_evaluation);
		
		System.out.print("Enter your quiz score: ");
		int quiz = input.nextInt();
		
		System.out.print("Enter your exam score: ");
		int exam = input.nextInt();
		
		System.out.println("Your Grade is: "+((((total_lab_activities/(lab_activities*15))*20+(total_evaluation/45)*20+quiz+(exam/40)*30))*.625+37.5));
	}
	
	public static void MidTerm()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many laboratory activities have you performed? ");
		int lab_activities = input.nextInt();
		double total_lab_activities=sum(lab_activities);
		System.out.println("Total Laboratory Activities: "+total_lab_activities);
		
		System.out.print("How many evaluation or short quiz did you take? ");
		int evaluation = input.nextInt();
		double total_evaluation=sum(evaluation);
		System.out.println("Total Evaluation: "+total_evaluation);
		
		System.out.print("How many programming project have you completed? ");
		int prog_proj = input.nextInt();
		double total_pp=sum(prog_proj);
		System.out.println("Total Programming Project: "+total_pp);
				
		System.out.print("Enter your exam score: ");
		int exam = input.nextInt();
		
		System.out.println("Your Grade is: "+((((total_lab_activities/(lab_activities*15))*20+(total_evaluation/34)*20+(total_pp/40)*30+(exam/60)*30))*.625+37.5));
	}
	
	public static void FinalTerm()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many laboratory activities have you performed? ");
		int lab_activities = input.nextInt();
		double total_lab_activities=sum(lab_activities);
        System.out.println("Total Laboratory Activities: "+total_lab_activities);
			
		System.out.print("How many programming project have you completed? ");
		int prog_proj = input.nextInt();
		double total_pp=sum(prog_proj);
		System.out.println("Total Programming Project: "+total_pp);
				
		System.out.print("Enter your quiz score: ");
		int quiz = input.nextInt();
		
		System.out.print("Enter your exam score: ");
		int exam = input.nextInt();
		
		System.out.println("Your Grade is: "+(((total_lab_activities/(lab_activities*15))*20+total_pp+quiz+exam)*.625+37.5));
	}
	
public static double sum(int number)
{
	Scanner input = new Scanner(System.in);
	double total=0;
	
	System.out.print("Enter your scores: ");
	for(int n=1; n<=number; n++)
		{
		double score = input.nextDouble();
		total=total+score;
		}
	return total;
}
}
