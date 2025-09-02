package BasicProgram;

import java.util.Scanner;

public class FindFirstAndLast
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int no=sc.nextInt();
		int first,last;
		last=no%10;
		while(no>10)
		{
			no=no/10;
		}
		first=no;
		System.out.println("First is "+first);
		System.out.println("Last is "+last);
	}
}
