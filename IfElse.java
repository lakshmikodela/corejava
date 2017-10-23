package core;

public class IfElse {

	public static void main(String[] args)
	{
		int markes=85;
		if(markes<50)
		{
			System.out.println("fail");
			
		}
		else if(markes>=50 && markes<=60)
		{
			System.out.println("D grade");
		}
		else if(markes>=60 && markes<=70)
		{
			System.out.println("C grade");
		}
		else if(markes>=70 && markes<=80)
		{
			System.out.println("B grade");
		}
		else if(markes>=80 && markes<=90)
		{
			System.out.println("A grade");
		}
		else if(markes>=90 && markes<=100)
		{
			System.out.println("A+ grade");
		}
		else
		{
			System.out.println("INVALIED");
		}
	}

}
