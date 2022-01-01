import java.util.*;
public class BirthdayCake {

	public static void main(String[] args) {
		int i,k;
		System.out.println("\n\n\t\t\tWELCOME TO ONLINE BIRTHDAY PARTY\n");
		System.out.println("\nBig Chocolate Cake is ready\n");
		//candle
		System.out.println("\t\t\t     |");
		System.out.println("\t\t\t    | |");
		
		//first for loop 
		
		for(i=1; i<=4; i++)
		{
			System.out.print("\t\t\t");
			if(i==1 || i==4)
			{
				for(k=1; k<=4; k++)
					System.out.print("--");
				System.out.print("--");
			}
			else
			{
				
				for(k=1; k<=4; k++)
				{
					if(k==1 || k==4)
						System.out.print("|");
					else
						System.out.print("    ");
				}
			}
			System.out.println();
		}
		//2nd for loop
		
		for(i=1; i<=6; i++)
		{
			System.out.print("\t\t");
			if(i==1 || i==6)
			{
				for(k=1; k<=12; k++)
					System.out.print("--");
				System.out.print("--");
			}
			else
			{
				
				for(k=1; k<=8; k++)
				{
					if(k==1 || k==8)
						System.out.print("|");
					else
						System.out.print("    ");
				}
			}
			System.out.println();
		}
		//3rd for loop
		for(i=1; i<=8; i++)
		{
			System.out.print("\t");
			if(i==1 || i==8)
			{
				for(k=1; k<=20; k++)
					System.out.print("--");
				System.out.print("--");
			}
			else if(i==6)
				System.out.print("| \t HAPPY BIRTHDAY \t\t |");
			else if(i==7)
				System.out.print("| \t Be Exception\t\t\t |");
			else
			{
				for(k=1; k<=12; k++)
				{
					if(k==1 || k==12)
						System.out.print("|");
					else
						System.out.print("    ");
				}
			}
			System.out.println();
		}
		/*
		Scanner ob= new Scanner(System.in);
		System.out.print("\n\t\t\tDid the Birthday guy is ready to blow the candle(Y/N) ");
		String sp= ob.nextLine();
		if(sp.compareToIgnoreCase("y")== 0)
		{
			for(i=1; i<=4; i++)
			{
				System.out.print("\t\t\t");
				if(i==1 || i==4)
				{
					for(k=1; k<=4; k++)
						System.out.print("--");
					System.out.print("--");
				}
				else
				{
					
					for(k=1; k<=4; k++)
					{
						if(k==1 || k==4)
							System.out.print("|");
						else
							System.out.print("    ");
					}
				}
				System.out.println();
			}
			//2nd for loop
			
			for(i=1; i<=6; i++)
			{
				System.out.print("\t\t");
				if(i==1 || i==6)
				{
					for(k=1; k<=12; k++)
						System.out.print("--");
					System.out.print("--");
				}
				else
				{
					
					for(k=1; k<=8; k++)
					{
						if(k==1 || k==8)
							System.out.print("|");
						else
							System.out.print("    ");
					}
				}
				System.out.println();
			}
			//3rd for loop
			for(i=1; i<=8; i++)
			{
				System.out.print("\t");
				if(i==1 || i==8)
				{
					for(k=1; k<=20; k++)
						System.out.print("--");
					System.out.print("--");
				}
				else if(i==6)
					System.out.print("| \t HAPPY BIRTHDAY \t\t |");
				else if(i==7)
					System.out.print("| \t all \t\t\t |");
				else
				{
					for(k=1; k<=12; k++)
					{
						if(k==1 || k==12)
							System.out.print("|");
						else
							System.out.print("    ");
					}
				}
				System.out.println();
		}
			System.out.print("\n\t Lets!the birthday guy eats upper chocolate part of Cake: Are you ready? yes/no) ");
			String ss= ob.next();
			if(ss.compareTo("y") == 0) {
				//3rd for loop
				for(i=1; i<=8; i++)
				{
					System.out.print("\t");
					if(i==1 || i==8)
					{
						for(k=1; k<=20; k++)
							System.out.print("--");
						System.out.print("--");
					}
					else if(i==6)
						System.out.print("| \t HAPPY BIRTHDAY \t\t |");
					else if(i==7)
						System.out.print("| \t Siddharth \t\t |");
					else
					{
						for(k=1; k<=12; k++)
						{
							if(k==1 || k==12)
								System.out.print("|");
							else
								System.out.print("    ");
						}
					}
					System.out.println();
			}
			}
			System.out.println("\n \t\tI told you to eat only upper part but you eat 2 part at a time\n\t\t Last part I will eat");
			System.out.println("\n \t\tDid you want to eat the last part Siddharth? ");
			String out1= ob.next();
			String out= ob.nextLine();
			if(out.length() >1)
				System.out.println("\n\t\t\t\t\t\tNo cake to display. \n \t\tYou both are not Human\n\t\t You have eaten all the cake");
			
			System.out.println("\n");
			System.out.println("\n\t\t\tTHIS EVENT IS OVER NOW!\n\t\t Thank you for being with me\n\n \t\t Let Move to next event");
		ob.close();
		}*/
	}
}