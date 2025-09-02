package ArratProgram;

import java.util.Scanner;

public class InsertValueAtSpecificPosition 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values in array ");
		for(int i=0; i<a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position ");
		int pos=sc.nextInt();
		System.out.println("Enter the values which u want to insert ");
		int value=sc.nextInt();
		for(int i=a.length-1; i>pos; i--)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=value;
		System.out.println("After inserting value ");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}	
	}
}
