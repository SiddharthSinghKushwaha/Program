import java.lang.*;
import java.util.*;
class Amstrong
{
	public static void main(String args[])
	{
	int n,r,s,t;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	n=sc.nextInt();
	t=n;
	for(s=0;n>0;n=n/10)
	{
		r=n%10;
		s=s+r*r*r;
	}
		if(s==t)
		{
			System.out.println("Enter number is a Amstrong no.");
		}
		
		else
			{
				System.out.println("It is not a Amstrong no.");
			}
			sc.close();
}
}
	