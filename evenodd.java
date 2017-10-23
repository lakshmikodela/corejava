package core;
import java.util.Scanner;
public class evenodd 
{
	public static void main(String[] args)
	{
		int a;
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("this number is even");
		}
			else
			{
				System.out.println("this number is odd");
			}
		}
		
	}
	
