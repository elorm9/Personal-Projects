
import java.util.*;

public class client {
	

	public static void main(String args[])
	{
		int row = 0;
		int column = 0;
		//variable for input
		String input = "";
		
		//constructions
		Random generator = new Random();
		Scanner sc = new Scanner(System.in);
		
		//methods from other classes
		generateRoom method = new generateRoom();
		map method2 = new map();
		SpecialRoom method3 = new SpecialRoom();
		
		//place the character in random coordinates
		int startingRow = 0;
		int startingColumn = 0;

		
		//ask the player's name and record it
		System.out.println("What is your name?");
		String name = sc.next();
		
		System.out.println("How big should the world be? Enter a number that is greater than or equal to 2");
		while(row == 0)
		{
			input = sc.next();
		     for (int i = 0; i < input.length(); i++) {
		    	 
		            if (!Character.isDigit(input.charAt(i)))
		               input = "0";
		               	
		        }
			row = Integer.parseInt(input);
			
			if(row == 0 || row == 1)
			{
				System.out.println("Please enter a correct response. The world must be 2x2 or greater.");
				row = 0;
			}
		}
		
		column = row;
		
		//create the world
		method.makeRooms(column, row);
	
		
		while(startingRow == 0)
		{
			startingRow = generator.nextInt(row);
		}
		
		while(startingColumn == 0)
		{
			startingColumn = generator.nextInt(column);
		}
		
		//construct a character object for the player
		character player = new character(row, column, startingRow, startingColumn, name);
		
		while( method.checkIfPlayerReachedEscapeRoom(player) != true)
		{
			System.out.println(method2.calculateMap(row,column,player, method.Rooms[player.getCurrentColumn()-1][player.getCurrentRow()-1]));
			method3.specialRoomActivate(method.Rooms[player.getCurrentColumn()-1][player.getCurrentRow()-1], player);
			System.out.println("\n" + method.Rooms[player.getCurrentColumn()-1][player.getCurrentRow()-1].roomToString());
			//Where would you like to move?
			System.out.println("\nWhere would you like to move? Your choices are:" + method.getMovementPossibilities(player));
			input = sc.next().toUpperCase();
			
			if(input.equals("UP"))
			{
				player.goNorth();
			}
			
			if(input.equals("DOWN"))
			{
				player.goSouth();
			}
			
			if(input.equals("LEFT"))
			{
				player.goWest();
			}
			
			if(input.equals("RIGHT"))
			{
				player.goEast();
			}

		}
		System.out.println(method2.calculateMap(row,column,player, method.Rooms[player.getCurrentColumn()-1][player.getCurrentRow()-1]));
		System.out.println("You have reached the escape room!");
		
	}
	
	
}
