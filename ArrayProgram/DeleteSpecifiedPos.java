package ArratProgram;

import java.util.Scanner;

public class DeleteSpecifiedPos 
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
		System.out.println("Enter the position");
		int pos=sc.nextInt();
		for(int i=pos; i<a.length-1; i++)
		{
			a[i]=a[i+1];
		}
		
		System.out.println("After delete ");
		for(int i=0; i<a.length-1; i++)
		{
			System.out.println(a[i]);
		}
	}
}
