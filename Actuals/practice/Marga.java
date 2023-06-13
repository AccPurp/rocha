/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;


import java.util.ArrayList;
import java.util.Scanner;


class studentnum {

    static Scanner read = new Scanner(System.in);
    static ArrayList subject = new ArrayList();
    static ArrayList unit = new ArrayList();
    static ArrayList grade = new ArrayList();
    static int subjectCount;
   

    public static void main(String[] args) {
        System.out.print("Enter student count: ");
        int student = read.nextInt();
        System.out.println(student);
        read.nextLine();

        System.out.println("Name of Student");
        String studentName = read.nextLine();
            

            System.out.print("Number of subject(s): ");
        subjectCount = read.nextInt
            ();
            read.nextLine();

            for (int j = 0; j <= subjectCount - 1; ++j) {
                System.out.print("Name of subject: ");
                subject.add(read.nextLine());

                System.out.print("Number of unit(s): ");
                unit.add(read.nextInt());

                System.out.print("Grades obtained: ");
                grade.add(read.nextInt());
                read.nextLine();
                System.out.println("");

            }
            System.out.println("Name of student:" +  studentName);
     
            System.out.println("Subject\t\t\t\tUnits\t\t\tGrades Obtained");
            for (int loop = 0; loop < subjectCount; ++loop) {
                System.out.println("  " + subject.get(loop) + "\t\t\t\t  " + unit.get(loop) + "\t\t\t\t" + grade.get(loop));
            }
            System.out.println("");
    }
}


/*
InputStreamReader ir = new InputStreamReader (System.in);
BufferedReader br = new BufferedReader (ir);
int studentnum;
int subjectnum;
System.out.println("Enter number of students");
studentnum=Integer.parseInt(br.readLine());
int x[] = new int [studentnum];
String studentnames[]=new String[studentnum];
String name;
int z;
for (int y=0;y<x.length;y++)

{
System.out.println("Enter the name of student");
name=br.readLine();
studentnames[y]=name;

}
for (int y=0;y<x.length;y++)

{
z=y+1;
System.out.print("Student #:" +z);

System.out.println(studentnames[y]);
*/