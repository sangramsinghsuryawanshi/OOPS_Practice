package PractOOPS;

import java.util.Scanner;

public class PrimeNumMToNWithoutReturnArg 
{
	public void findPrimeMToN()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("No return type with no argument ");
		System.out.print("Enter the value of n and n1: ");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.print("\n--------------------------------");
		System.out.print("\nPrime number is: ");
		for(int i=n;i<=n1;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.print(i+" ");
			}
		}
		System.out.print("\n--------------------------------");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrimeNumMToNWithoutReturnArg p = new PrimeNumMToNWithoutReturnArg();
		p.findPrimeMToN();
	}

}
