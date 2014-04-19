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
		System.out.println();
	
		
		int a = s.nextInt();// are used to get the users input
		
		switch (a)//switches are used for processing the users choice
		{
		case 1: 
			System.out.println("you are a boy");
			break;//must have breaks or it will proced to the next case
		case 2: 
			System.out.println("you are a girl");
			break;
		}
		
		
		System.out.println();
		System.out.println("ok whats your name?");
		//System.out.println(name.nextLine());
	
		String player = name.nextLine();//gets the players name
		
		System.out.println("hi " +player);
		System.out.println();
		
		
		System.out.println("ok where do you want to go \n\n1:home\n2:town\n3:quit");
		System.out.println();
		
		
		
		int b = s.nextInt();
		
		switch (b)
		{
		case 1:
			System.out.println("welcome home " + player);
			System.exit(b);
			
		case 2: 
			System.out.println("Welcome to town " + player);
			break;
			
		case 3:
			System.out.println("goodbye " + player);
			System.exit(b);
		}
		
		System.out.println();
		System.out.println("so " + player + " you are now in town where do you want to go?");
		System.out.println("1: to the bar\n2: to the movies");
		
		int c = s.nextInt();
		
		switch(b)
		{
		case 1:
			System.out.println(player + " you are now at the bar.");
			break;
		case 2:
			System.out.println(player + " you are going to see a movie.");
		}

	}

}
