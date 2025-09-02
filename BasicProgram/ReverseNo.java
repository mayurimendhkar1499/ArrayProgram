package BasicProgram;

import java.util.Scanner;

public class ReverseNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int no=sc.nextInt();
		int rev=0, rem;
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse is "+rev);
	}
}
