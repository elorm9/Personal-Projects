import java.util.*;
public class generateRoom {
	
	Random generator = new Random();
	
	//default dimensions of the world is 10x10
	private int random;
	private int row;
	private int column;
	private int roomNum = 1;	
	Room [][]Rooms;
	
	//random room number for the escape room
	private int escapeRoomNum;
	
	public void makeRooms(int uRow, int uColumn)
	{
		Rooms = new Room[uColumn][uRow];
		
		escapeRoomNum = generator.nextInt(uRow*uColumn);
		this.row = uRow;
		this.column = uColumn;
		for(int i = 1; i <= uColumn; i++)
		{
			for(int j = 1; j <= uRow; j++)
			{
				random = generator.nextInt(2);
				if( roomNum == escapeRoomNum)
				{
					Rooms[i-1][j-1] = new Room(j, i, roomNum, true, false);
					roomNum++;
					continue;
				}
				
				if( roomNum != escapeRoomNum)
				{
					if( random == 1)
					{
						Rooms[i-1][j-1] = new Room(j, i, roomNum, false, true);
						roomNum++;
						continue;
					}
					else
					{
						Rooms[i-1][j-1] = new Room(j, i, roomNum, false, false);
						roomNum++;
					}
				}
			}
		}
	}
	

	public String generateRoomToString()
	{
		String str = "Number of rooms: ";
		str += row*column;
		return str;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getColumn(){
		return column;
	}
	
	public boolean checkIfPlayerReachedEscapeRoom(character player)
	{
		if( Rooms[player.getCurrentColumn()-1][player.getCurrentRow()-1].getRoomNum() == escapeRoomNum)
			return true;
		else return false;
	}
	
	public String getMovementPossibilities(character player)
	{
		if(player.getCurrentColumn() == player.getColumnLimit() && player.getCurrentRow() == player.getRowLimit())
		{
			return "LEFT, UP";
		}
		
		if(player.getCurrentRow() == 1 && player.getCurrentColumn() == 1)
		{
			return "DOWN,RIGHT";
		}
		
		if(player.getCurrentRow() == 1 && player.getCurrentColumn() == player.getColumnLimit())
		{
			return "DOWN,LEFT";
		}
		
		if(player.getCurrentRow() == player.getRowLimit() && player.getCurrentColumn() == 1)
		{
			return "UP,RIGHT";
		}
		
		
		if(player.getCurrentRow() == player.getRowLimit() && player.getCurrentColumn() == 1)
		{
			return "UP,LEFT";
		}
		
		if(player.getCurrentColumn() == player.getRowLimit())
		{
			return "LEFT, UP, DOWN";
		}
		
		if(player.getCurrentRow() == player.getRowLimit())
		{
			return "LEFT, UP, RIGHT";
		}
		
		if(player.getCurrentRow() == player.getRowLimit())
		{
			return "LEFT, DOWN, RIGHT";
		}
		
		if(player.getCurrentColumn() == 1)
		{
			return "RIGHT, UP, DOWN";
		}
		
		
		if(player.getCurrentRow() == 1)
		{
			return "LEFT, DOWN, RIGHT";
		}
		
		return "UP, DOWN, LEFT, RIGHT";
	}
	
}
