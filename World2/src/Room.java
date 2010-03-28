import java.util.*;
public class Room {
	
	Random generator = new Random();
	private int roomRow;
	private int roomColumn;
	private int roomNum;
	private boolean escapeRoom;
	private boolean specialRoom;
	
	public Room()
	{
		roomRow = 0;
		roomColumn = 0;
		escapeRoom = false;
		roomNum = 0;
	}
	public Room(int roomRow, int roomColumn, int roomNum, boolean escapeRoom, boolean specialRoom)
	{
		this.roomRow = roomRow;
		this.roomColumn = roomColumn;
		this.roomNum = roomNum;
		this.escapeRoom = escapeRoom;
		this.specialRoom = specialRoom;
	}
	
	public String roomToString()
	{
		return "You are currently in Row: " + roomRow + ", Column: " + roomColumn + ", at Room Number: " + roomNum;
	}
	
	public int getRow()
	{
		return roomRow;
	}
	
	public int getRoomNum()
	{
		return roomNum;
	}
	
	public int getColumn()
	{
		return roomColumn;
	}
	
	public boolean getSpecialRoom()
	{
		return specialRoom;
	}
	

}
