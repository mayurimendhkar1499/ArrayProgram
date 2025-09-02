package BasicProgram;

import java.util.Scanner;

public class MissingNo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int no=sc.nextInt();
		int rev=0, rem , count=0;
		while(no!=0)
		{
			rem=no%10;
			no=no/10;
			rev=rev*10+rem;
			count++;
		}
		no=rev;
		int rem1,rem2;
		System.out.println("Missing values are ");
		while(no!=0)
		{
			rem1=no%10;
			rem1++;
			no=no/10;
			rem2=no%10;
			while(rem2 > rem1)
			{
				System.out.println(rem1);
				rem1++;
			}
			
		}
	}
}
