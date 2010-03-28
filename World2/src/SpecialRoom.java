import java.util.Scanner;
import java.util.*;

public class SpecialRoom {
	
	private int random;
	private String input;
	Scanner sc = new Scanner(System.in);
	private boolean buttonPushed = false;
	Random generator = new Random();

	
	boolean specialRoom1 = false;
	boolean specialRoom2 = false;
	boolean specialRoom3 = false;
	boolean specialRoom4 = false;
	boolean specialRoom5 = false;
	boolean specialRoom6 = false;
	
	
	
	public void specialRoomActivate(Room r, character p)
	{
		if( specialRoom1 == true && specialRoom2 == true && specialRoom3 == true && specialRoom4 == true && specialRoom5 == true && specialRoom6 == true)
		{
			specialRoom1 = false;
			specialRoom2 = false;
			specialRoom3 = false;
			specialRoom4 = false;
			specialRoom5 = false;
			specialRoom6 = false;
		}
		if( r.getSpecialRoom() == true)
		{
			random = generator.nextInt(5);
			
			if(random == 0 && specialRoom1 == false)
			{
				specialRoom1(p);
				specialRoom1 = true;
			}
			if(random == 1 && specialRoom2 == false)
			{
				specialRoom2(p);
				specialRoom2 = true;
			}
			
			if(random == 2 && specialRoom3 == false)
			{
				specialRoom3(p);
				specialRoom3 = true;
			}
			
			if(random == 5 && specialRoom6 == false)
			{
				specialRoom6(p);
				specialRoom6 = true;
			}
			
		}
	}
	
	private void specialRoom1(character p)
	{	
		System.out.println("\nYou are in a special room!");
		System.out.println("All the doors around you are locked. You see a lever in front of you. Will you pull it? (YES/NO)");
		input = sc.next().toUpperCase();
			
		if(input.equals("YES"))
		{
			System.out.print("You pull the lever...");
			random = generator.nextInt(3);
			if(random == 0)
			{
				System.out.print("\nThe front door opens up and you enter the next room...");
				p.goNorth();
			}
				
			if(random == 1)
			{
				System.out.print("\nThe left door opens up and you enter the next room...");
				p.goWest();
			}
				
			if(random == 2)
			{
				System.out.print("\nThe left door opens up and you enter the next room...");
				p.goEast();
			}
				
			if(random == 3)
			{
				System.out.print("\nThe door behind you opens up and you enter the next room...");
				p.goSouth();
			}
				
			while(!input.equals("YES"))
			{
				System.out.println("You decide not to pull the lever. As you sit in the poorly lit room, you start pondering about pulling the lever..");
				input = sc.next().toUpperCase();
				
				if(input.equals("YES"))
				{
					System.out.print("You pull the lever...");
					random = generator.nextInt(3);
					if(random == 0)
					{
						System.out.print("\nThe front door opens up and you enter the next room...");
						p.goNorth();
					}
						
					if(random == 1)
					{
						System.out.print("\nThe left door opens up and you enter the next room...");
						p.goWest();
					}
						
					if(random == 2)
					{
						System.out.print("\nThe left door opens up and you enter the next room...");
						p.goEast();
					}
					
					if(random == 3)
					{
						System.out.print("\nThe door behind you opens up and you enter the next room...");
						p.goSouth();
					}
						
				}
			}
		}
	}
	
	private void specialRoom2(character p)
	{
		System.out.println("\nYou are in a special room!");
		System.out.println("You see a button with a sign that says 'DON'T PUSH' next to it. Will you push the button? (YES/NO): ");
		input = sc.next().toUpperCase();
		
		if(input.equals("YES"))
		{
			System.out.println("You push the button. All you hear is a creaking sound. Aside from that, nothing else happens.");
			
			if(buttonPushed == false)
			{
				buttonPushed = true;
			}
			else
			{
				buttonPushed = false;
			}
		}
		
		if(input.equals("NO"))
		{
			System.out.println("You decide not to push the button. You are free to go on to the next room");
		}
	}
	
	private void specialRoom3(character p)
	{
		if(buttonPushed == true)
		{
			System.out.println("\nYou are in a special room!");
			System.out.println("Because you pushed the button in a previous room, you must solve the following math equation!");
			System.out.println("Solve for x, 9x-18 = 3x :");
			input = sc.next();
			while( !input.equals("3"))
			{
				System.out.println("Nope, wrong answer. Try again or take an Algebra class!");
				System.out.println("Solve for x, 9x-18 = 3x :");
				input = sc.next();
			}
			System.out.println("Correct!");
		}
		
		if( buttonPushed == false)
		{
			System.out.println("\nYou are in a special room!");
			System.out.println("What does 1+1 equal?");
			input = sc.next();
			while( !input.equals("2"))
			{
				System.out.println("Nope, wrong answer. Try again... in preschool");
				System.out.println("What's 1+1? :");
				input = sc.next();
			}
			System.out.println("Correct!");
		}
	}
	
	
	private void specialRoom6(character p)
	{
		System.out.println("\nYou have entered a special room!");
		System.out.println("You see a sign on the wall");
		System.out.println(" ================== ");
		System.out.println("| Please give me an |");
		System.out.println("| 'A' on this       |");
		System.out.println("| assigment!        |");
		System.out.println(" ================== ");
	}
	
	
}
