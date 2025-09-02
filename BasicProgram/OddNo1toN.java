package BasicProgram;

import java.util.Scanner;

public class OddNo1toN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit ");
		int no=sc.nextInt();
		System.out.println("Odd no list are ");
		for(int i=1; i<=no; i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
