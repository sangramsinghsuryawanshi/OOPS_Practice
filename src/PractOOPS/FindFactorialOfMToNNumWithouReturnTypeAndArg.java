package PractOOPS;

import java.util.Scanner;

public class FindFactorialOfMToNNumWithouReturnTypeAndArg 
{

	public void findFactorialMToNNoReturnTypeAndArg()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("No return type with no argument ");
		System.out.print("Enter the value of n and n1: ");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.print("\n--------------------------------");
		System.out.print("\nFactorial number is: ");
		for(int i=n;i<=n1;i++)
		{
			int fact=1;
			for(int j=1;j<=i;j++)
			{
				fact*=j;
			}
				System.out.print(fact+" ");
		}
		System.out.print("\n--------------------------------");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FindFactorialOfMToNNumWithouReturnTypeAndArg p = new FindFactorialOfMToNNumWithouReturnTypeAndArg();
		p.findFactorialMToNNoReturnTypeAndArg();
	}

}
