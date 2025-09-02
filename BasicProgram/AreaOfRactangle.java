package BasicProgram;

import java.util.Scanner;

public class AreaOfRactangle
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and width ");
		int length=sc.nextInt();
		int width=sc.nextInt();
		int area;
		area=length*width;
		System.out.println("Area of ractangle is "+area);
	}
}
