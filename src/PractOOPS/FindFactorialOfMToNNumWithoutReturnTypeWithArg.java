package PractOOPS;

import java.util.Scanner;

public class FindFactorialOfMToNNumWithoutReturnTypeWithArg 
{
	public void findFactMToNNoReturnTypeWithArg(int n,int n1)
	{
		System.out.print("\nFactorial number is: ");
		for(int i=n;i<=n1;i++)
		{
			int fact=1;
			for(int temp=1;temp<=i;temp++)
			{
					fact*=temp;
			}
				System.out.print(fact+" ");
		}
		System.out.print("\n--------------------------------");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FindFactorialOfMToNNumWithoutReturnTypeWithArg a = new FindFactorialOfMToNNumWithoutReturnTypeWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("No return type with argument ");
		System.out.print("Enter the value of n and n1: ");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.print("\n--------------------------------");
		a.findFactMToNNoReturnTypeWithArg(n, n1);

	}

}
