package ArratProgram;

import java.util.Scanner;

public class EvenOddValueSum
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values in array ");
		int a[]=new int[7];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int esum=0;
		int osum=0;
		System.out.println("Even values are ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				esum=esum+a[i];
			}
		}
		System.out.println("Even values sum are "+esum);
		
		System.out.println("Odd values are ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
				osum=osum+a[i];
			}
		}
		System.out.println("Odd values sum are "+osum);
	}
}
