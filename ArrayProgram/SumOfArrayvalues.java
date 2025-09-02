package ArratProgram;

import java.util.Scanner;

public class SumOfArrayvalues
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values in array ");
		int a[]=new int[5];
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Dispaly the values in array ");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("Sum of all elements values are "+sum);
	}
}
