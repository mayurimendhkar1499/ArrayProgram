package BasicProgram;

import java.util.Scanner;

public class CountNo 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no ");
		int no=sc.nextInt();
		int count=0;
		while(no!=0)
		{
			no=no/10;
			++count;
		}
		System.out.println("Count is "+count);
	}
}
 