package practice;

import java.util.Scanner; 
public class methods_Rocha 
    {
	static double w, h, l;
	public static void main(String[] args) 
        {
		System.out.println("((Calorie Burner Calculator))");
		Cal();}
	public static void Cal(){
		Scanner Bibecodes = new Scanner(System.in);
		System.out.println("Please select an exercise of your choosing");
		System.out.print("1). Jumping Rope \n2). Walking\n3). House Cleaning\n4). Running\n5). Swimming\nChoose a activity: ");
		int n=Bibecodes.nextInt();
			switch (n){
			case 1:
				System.out.println("[[Jumping Rope]]");
				System.out.print("Enter your weight in kgs: ");
				    w=Bibecodes.nextDouble();
				    System.out.print("Enter your time in hourss: ");
			    	h=Bibecodes.nextDouble();
			        	l=rope(w,h);
			            	System.out.println("Weight: "+w+"\nHour: "+h+"\nCalories burned: "+l);
				        NextEx();
				    break;
			case 2:
				System.out.println("[[Walking]]");
				System.out.print("Enter your weight in kgs: ");
				    w=Bibecodes.nextDouble();
			    	System.out.print("Enter your time in hours: ");
				    h=Bibecodes.nextDouble();
				        l=walk(w,h);
			    	        System.out.println("Weight: "+w+"\nHour: "+h+"\nCalories burned: "+l);
			        	NextEx();
			    	break;
			case 3:
				System.out.println("[[House Cleaning]]");
				System.out.print("Enter your weight in kgs: ");
			    	w=Bibecodes.nextDouble();
			    	System.out.print("Enter your time in hours: ");
			    	h=Bibecodes.nextDouble();
				        l=clean(w,h);
			            	System.out.println("Weight: "+w+"\nHour: "+h+"\nCalories burned: "+l);
			        	NextEx();
			    	break;
			case 4:
				System.out.println("[[Running]]");
				System.out.print("Enter your weight in kgs: ");
		        	w=Bibecodes.nextDouble();
			    	System.out.print("Enter your time in hours: ");
			    	h=Bibecodes.nextDouble();
			        	l=run(w,h);
			            	System.out.println("Weight: "+w+"\nHour: "+h+"\nCalories burned: "+l);
			         	NextEx();
				    break;
			case 5:
				System.out.println("[[Swimming]]");
				System.out.print("Enter your weight in kgs: ");
			    	w=Bibecodes.nextDouble();
		    		System.out.print("Enter your time in hours: ");
			    	h=Bibecodes.nextDouble();
		        		l=swim(w,h);
			            	System.out.println("Weight: "+w+"\nHour: "+h+"\nCalories burned: "+l);
				        NextEx();
				    break;
			default:
				System.out.println("Invalid input. Please restart the Program");
				        NextEx();
			    	break;
		}
			
	}
	    private static double rope(double wPar, double hPar) {
	    	final double lPar= 3.8;
		return (wPar*hPar*lPar);
	}
	    private static double walk(double wPar2, double hPar2) {
	    	final double lPar= 2.4;
		return (wPar2*hPar2*lPar);
	}
    	private static double clean(double wPar3, double hPar3) {
    		final double lPar= 1.6;
		return ((wPar3*hPar3*lPar));
	}
    	private static double run(double wPar4, double hPar4) {
    		final double lPar= 2.5;
		return ((wPar4*hPar4*lPar));
	}
    	private static double swim(double wPar5, double hPar5) {
	    	final double lPar= 3.8;
		return (wPar5*hPar5*lPar);
	}
	 public static void NextEx()
        {
	        Scanner Bibecodes2 = new Scanner(System.in);
	        System.out.print("Would you like to proceed onwards to your next exercise?\n1.) Yes\n2.) No \n");
	        String condition = Bibecodes2.nextLine();      
	            if(condition.equals("1")){
	             Cal();
	            }
	            else if(condition.equals("2")){
	                System.out.println("Thank you!\n\n\n[End of Program]");
	                System.exit(0);
	            }
	}
}