package StringProgram;

import java.util.Scanner;

public class RemoveAllWhiteSpacesFromString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string ");
		String str=sc.nextLine();
		System.out.println("Before removing the white spaces ----> " +str);
		str=str.replaceAll("\\s", "");
		System.out.println("After removing the white spaces -----> " +str);
	}
}
