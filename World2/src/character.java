
public class character {
	
	generateRoom method = new generateRoom();
	private int currentRow;
	private int currentColumn;
	private String name;
	
	private int columnLimit; 
	private int rowLimit;

	public character()
	{
		currentRow = 0;
		currentColumn = 0;
		name = "";
	}
	
	public character(int columnLimit, int rowLimit, int currentRow, int currentColumn, String name)
	{
		this.columnLimit = columnLimit;
		this.rowLimit = rowLimit;
		this.currentColumn = currentColumn;
		this.currentRow = currentRow;
		this.name = name;
	}
	
	public int getColumnLimit()
	{
		return columnLimit;
	}
	
	public int getRowLimit()
	{
		return rowLimit;
	}
	
	public int getCurrentRow() {
		return currentRow;
	}


	public int getCurrentColumn() {
		return currentColumn;
	}
	
	
	public String getName()
	{
		return name;
	}

	//actions for player
	public void goNorth()
	{
		if(currentRow == 1)
		{
			System.out.println("There is a wall in front of you.");
		}
		
		if(currentRow == rowLimit && currentColumn == columnLimit)
		{
			System.out.println("There is a wall in front of you.");
		}
		
		if(currentRow != 1)
		{	
			currentRow--;
		}
	}
	
	public void goSouth()
	{
		if(currentRow == rowLimit)
		{
			System.out.println("There is a wall in front of you.");
		}
		
		if(currentRow == rowLimit && currentColumn == columnLimit)
		{
			System.out.println("There is a wall in front of you.");
		}
		
		if(currentRow != rowLimit)
		{
			currentRow++;
		}
		
	}
	
	public void goEast()
	{
		if( currentColumn == columnLimit)
		{
			System.out.println("There is a wall in front of you");
		}
		
		if( currentColumn != columnLimit)
		{
			currentColumn++;
		}
	}
	
	public void goWest()
	{
		if( currentColumn == 1)
		{
			System.out.println("There is a wall in front of you");
		}
		if( currentColumn != 1)
		{
			currentColumn--;
		}
	}

}
