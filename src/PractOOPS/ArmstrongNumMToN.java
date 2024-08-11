package PractOOPS;

import java.util.Scanner;

public class ArmstrongNumMToN 
{
	public void findArmstrongMToN()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("No return type with no argument ");
		System.out.print("Enter the value of n and n1: ");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		System.out.print("\n--------------------------------");
		System.out.print("\nArmstrong number is: ");
		for(int i=n;i<=n1;i++)
		{
			int rem=0,rev=0;
			for(int temp=i;temp!=0;temp=temp/10)
			{
				rem=temp%10;
				rev+=(rem*rem*rem);
			}
			if(rev==i)
			{
				System.out.print(rev+" ");
			}
		}
		System.out.print("\n--------------------------------");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArmstrongNumMToN a = new ArmstrongNumMToN();
		a.findArmstrongMToN();
	}

}
