
package ArratProgram;

import java.util.Scanner;

public class MergeTwoIn3rdArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st ");
		int size=sc.nextInt();
		System.out.println("Enter the values in 1st array ");
		int a[]=new int[size];
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int [size];
		System.out.println("Enter the values in 2nd array ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		int c[]=new int[a.length+b.length];
		for(int i=0; i<a.length; i++)
		{
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{
			c[a.length+i]=b[i];
		}
		System.out.println("After merge ");
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
	}
}
