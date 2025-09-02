package StringProgram;

import java.util.Scanner;

public class VowelCountInString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int count=0;
		boolean flag=false;
		for(int i=0; i<ch.length; i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ||
			ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
			{
				count++;
				flag=true;
			}
		}
		
		if(flag)
		{
			System.out.println("Vowel count is "+count);
		}
		else
		{
			System.out.println("Vowel not found ");

		}
	}
}
