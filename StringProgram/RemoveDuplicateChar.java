package StringProgram;

import java.util.Scanner;

public class RemoveDuplicateChar
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int count=0;
		//Ascending 
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]>ch[j])
				{
					char temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println("After remove duplicate ");
		for(int i=0; i<ch.length-1; i++)
		{
			if(ch[i]==ch[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(ch[i]);
			}
		}
		System.out.println(ch[ch.length-1]);
	}
}
