import java.util.*;
class Add
{
	public static void main(String args[])
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value for a and b");
	a=sc.nextInt();
	b=sc.nextInt();
	c=a+b;
	System.out.println("Sum is=" +c);
	sc.close();
}
}

