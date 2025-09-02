package ArratProgram;

import java.util.Scanner;

public class EnterValuesInArray
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
		System.out.println("Display the values ");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
