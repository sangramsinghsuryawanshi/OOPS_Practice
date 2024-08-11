package PractOOPS;

import java.util.Scanner;

public class Star 
{
	public void satrPattern(int n1)
	{
		for(int i=1;i<=n1;i++)
		{
			for(int k=n1;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==j || i==n1 || i==4)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		for(int i=2;i<=n1;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=n1;j>=i;j--)
			{
				if(j==n1 || i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Star s = new Star();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int n = sc.nextInt();
		System.out.println("\n-------------------------");
		s.satrPattern(n);	
	}

}
