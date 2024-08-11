package PractOOPS;

import java.util.Scanner;

public class PrintTheTableMToNWithoutReturnTypeAndArg {

	public void PrintTableMToNNoReturnTypeAndArg()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("No return type with no argument ");
		System.out.print("Enter the value of n and n1: ");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.print("\n--------------------------------");
		System.out.print("\nTables: ");
		for(int i=n;i<=n1;i++)
		{
			int fact=0;
			for(int j=1;j<=n1;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		System.out.print("\n--------------------------------");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintTheTableMToNWithoutReturnTypeAndArg p = new PrintTheTableMToNWithoutReturnTypeAndArg();
		p.PrintTableMToNNoReturnTypeAndArg();
	}

}
