package PractOOPS;

import java.util.Scanner;

public class PrintTableMToNWithoutReturnTypeWithArg 
{

	public void TableMToNWithoutReturnTypeWithArg(int n,int n1)
	{
		System.out.print("\nTable number is: ");
		for(int i=n;i<=n1;i++)
		{
			for(int temp=1;temp<=n1;temp++)
			{
				System.out.print(i*temp+" ");
			}
			System.out.println();
		}
		System.out.print("\n--------------------------------");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintTableMToNWithoutReturnTypeWithArg a = new PrintTableMToNWithoutReturnTypeWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("No return type with argument ");
		System.out.print("Enter the value of n and n1: ");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.print("\n--------------------------------");
		a.TableMToNWithoutReturnTypeWithArg(n, n1);

	}

}