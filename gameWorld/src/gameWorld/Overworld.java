package gameWorld;

import java.util.*;

public class Overworld 
{
	//public static String name;
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);//input scanner for the users input.
		Scanner name = new Scanner(System.in);// name variable
		System.out.println("Hello there are you a girl or a boy?\n\n1:Boy\n2:Girl");
		
		int a = s.nextInt();// are used to get the users input
		
		switch (a)//switches are used for processing the users choice
		{
		case 1: 
			System.out.println("you are a boy");
			break;
		case 2: 
			System.out.println("you are a girl");
			break;
		}
		
		System.out.println("ok whats your name?");
		//System.out.println(name.nextLine());
	
		String player = name.nextLine();//gets the players name
		
		System.out.println("hi " +player);
		
		System.out.println("ok\n\n1:home\n2:town\n3:quit");
		
		int b = s.nextInt();
		
		switch (b)
		{
		case 1:
			System.out.println("welcome home " + player);
			System.exit(b);
			
		case 2: 
			System.out.println("Welcome to town " + player);
			
		case 3:
			System.out.println("goodbye " + player);
		}
		
		
		

	}

}
