package ArratProgram;

import java.util.Scanner;

public class InsertValueAtSpecificIndexPos 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size in array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values in array ");
		for(int i=0; i<a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the index value ");
		int indexValue=sc.nextInt();
		System.out.println("Enter the value in array ");
		int value=sc.nextInt();
		for(int i=a.length-1; i>indexValue; i--)
		{
			a[i]=a[i-1];
		}
		a[indexValue]=value;
		System.out.println("After inserting value ");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}
