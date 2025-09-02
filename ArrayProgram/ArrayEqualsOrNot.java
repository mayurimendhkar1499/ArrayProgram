package ArratProgram;

import java.util.Scanner;

public class ArrayEqualsOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values in 1st array ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[size];
		System.out.println("Enter tha values in 2nd array ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		boolean flag=true;
		if(a.length == b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i]!=b[i])
				{
					flag=false;
				}
			}
		}
		else
		{
			flag=false;
		}
		if(flag)
		{
			System.out.println("Array are equals ");
		}
		else
		{
			System.out.println("Array are not equals ");
		}
	}
}
