
public class Prac {
    public static void main(String [] args) {
        for (int A=7; A>=1; A--)
    {
        for (int B=1; B<=(A * 2) -1; B++)
        {
            System.out.print("^");
        }
            System.out.println();
        for (int C=7; C>=A; C--)
        {
            System.out.print(" ");
            }
        }
        for (int a=0; a<=7; a++)
    {
        for (int b=7; b>a; b--)
        {
            System.out.print(" ");
        }
        for (int c=1; c<=(a * 2) -1; c++)
        {
            System.out.print("$");
        }
            System.out.println();
        }
        for (int a=7-1; a>=1; a--)
        {
        for (int b=7-1; b>=a; b--)
        {
            System.out.print(" ");
        }
        for (int c=1; c<=(a * 2) -1; c++)
        {
            System.out.print("^");
        }
        System.out.println();
     }
     for (int a = 1; a <= 7; a++)
    {
        for (int b=7; b>a; b--)
        {
            System.out.print(" ");
        }
        for (int c=1; c<=(a * 2) -1; c++)
        {
            System.out.print("$");
        }
            System.out.println();
        }
        System.out.println("~Wonderful time~~~");
    }
}