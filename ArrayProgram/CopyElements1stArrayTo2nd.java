package ArratProgram;

import java.util.Scanner;

public class CopyElements1stArrayTo2nd 
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
		int b[]=new int[a.length];
		for(int i=0; i<b.length; i++)
		{
			b[i]=a[i];
		}
		System.out.println("After copying elements ");
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}
}
