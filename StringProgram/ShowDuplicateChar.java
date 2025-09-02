package StringProgram;

import java.util.Scanner;

public class ShowDuplicateChar
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
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
		boolean flag=false;
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1; j<ch.length; j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[i]);
					flag=true;
				}
			}
		}
		if(flag)
		{
			System.out.println("Duplicate char found");
		}
		else
		{
			System.out.println("Duplicate char was not found ");
		}
	}
}
