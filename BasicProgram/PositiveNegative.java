package BasicProgram;

import java.util.Scanner;

public class PositiveNegative 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int no=sc.nextInt();
		if(no>0)
		{
			System.out.println("Number is positive ");
		}
		else if(no<0)
		{
			System.out.println("Numebr is negative ");
		}
		else
		{
			System.out.println("Number is Zero ");
		}
	}
}
