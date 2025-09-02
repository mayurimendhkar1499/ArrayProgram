package ArratProgram;

import java.util.Scanner;

public class EvenOddValuesInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values in array ");
		int a[]=new int[5];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Even values are ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd values are ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
