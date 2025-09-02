package practice;

import java.util.Scanner;

public class PerfectNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1; i<no; i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==no)
		{
			System.out.println("No is perfect ");
		}
		else
		{
			System.out.println("No is not perfect");
		}
	}

}
