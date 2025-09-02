package StringProgram;

import java.util.Scanner;

public class SpecificWordReverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
	}
}
