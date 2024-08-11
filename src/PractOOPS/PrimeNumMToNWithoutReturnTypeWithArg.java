package PractOOPS;

import java.util.Scanner;

public class PrimeNumMToNWithoutReturnTypeWithArg 
{
	public void findPrimeMToNNoReturnTypeWithArg(int n,int n1)
	{
		System.out.print("\nPrime number is: ");
		for(int i=n;i<=n1;i++)
		{
			int c=0;
			for(int temp=1;temp<=i;temp++)
			{
				if(i%temp==0)
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
		PrimeNumMToNWithoutReturnTypeWithArg a = new PrimeNumMToNWithoutReturnTypeWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("No return type with argument ");
		System.out.print("Enter the value of n and n1: ");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.print("\n--------------------------------");
		a.findPrimeMToNNoReturnTypeWithArg(n, n1);

	}

}
