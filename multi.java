import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{ 
	    System.out.println ("Enter the value to multiply:");
	    Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
            System.out.println("your output is");
	     for (int i=1;i<=10;i++)
	     {
	         System.out.println (a+" x "+ i +" = "+a*i);
	     }
	}
}
