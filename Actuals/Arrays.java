import java.util.Scanner; 

public class Arrays {

	public static void main(String[] args) {
		System.out.println("Welcome to my world");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The Name of the Student: ");
		String name = scan.nextLine();
		System.out.println("Note: The limit of the subject is 8");
		System.out.println("Enter the name of the Subject");
		String nameArrray[]= new String[8];
		int list,range=7;
		for (list=0;list<= range; list++){
			System.out.print("["+list+"]Enter the name of the subject: ");
			nameArrray[list] = scan.nextLine();}
		System.out.println("Enter the unit per subjcet");
		int unitArrray[]= new int[8];
		for (list=0;list<= range; list++){
			System.out.print("["+list+"]Enter the number of unit: ");
			unitArrray[list] = scan.nextInt();}
		System.out.println("Enter the grade per subjcet");
		double gradeArrray[]= new double[8];
		for (list=0;list<= range; list++){
			System.out.print("["+list+"]Enter the number of grade: ");
			gradeArrray[list] = scan.nextDouble();}
		System.out.println("Name of the student : "+ name+"\n");
		System.out.println("\tSubject\t\tUnit\t\tGrade\n");
		System.out.println("\t"+nameArrray[0]+"\t\t"+unitArrray[0]+"\t\t"+gradeArrray[0]+"\n");
		System.out.println("\t"+nameArrray[1]+"\t\t"+unitArrray[1]+"\t\t"+gradeArrray[1]+"\n");
		System.out.println("\t"+nameArrray[2]+"\t\t"+unitArrray[2]+"\t\t"+gradeArrray[2]+"\n");
		System.out.println("\t"+nameArrray[3]+"\t\t"+unitArrray[3]+"\t\t"+gradeArrray[3]+"\n");
		System.out.println("\t"+nameArrray[4]+"\t\t"+unitArrray[4]+"\t\t"+gradeArrray[4]+"\n");
		System.out.println("\t"+nameArrray[5]+"\t\t"+unitArrray[5]+"\t\t"+gradeArrray[5]+"\n");
		System.out.println("\t"+nameArrray[6]+"\t\t"+unitArrray[6]+"\t\t"+gradeArrray[6]+"\n");
		System.out.println("\t"+nameArrray[7]+"\t\t"+unitArrray[7]+"\t\t"+gradeArrray[7]+"\n");
		double unitgrade0= unitArrray[0]*gradeArrray[0];
		double unitgrade1= unitArrray[1]*gradeArrray[1];
		double unitgrade2= unitArrray[2]*gradeArrray[2];
		double unitgrade3= unitArrray[3]*gradeArrray[3];
		double unitgrade4= unitArrray[4]*gradeArrray[4];
		double unitgrade5= unitArrray[5]*gradeArrray[5];
		double unitgrade6= unitArrray[6]*gradeArrray[6];
		double unitgrade7= unitArrray[7]*gradeArrray[7];
		double unittotal = (unitArrray[0]+unitArrray[1]+unitArrray[2]+unitArrray[3]+unitArrray[4]+unitArrray[5]+unitArrray[6]+unitArrray[7]);
		double average= (unitgrade0+unitgrade1+unitgrade2+unitgrade3+unitgrade4+unitgrade5+unitgrade6+unitgrade7)/unittotal;
		System.out.println("Total number of unit is : "+unittotal);
		System.out.println("GWA : "+ average);	
	}

}