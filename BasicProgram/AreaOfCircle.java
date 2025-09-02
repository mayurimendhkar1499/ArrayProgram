package BasicProgram;

import java.util.Scanner;

public class AreaOfCircle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius ");
		int radius=sc.nextInt();
		int area;
		area=(int)(3.14*radius*radius);
		System.out.println("Area of circle "+area);
	}
}
