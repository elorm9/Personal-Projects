
public class map {
	


	public String calculateMap(int columns, int rows, character player, Room r)
	{
			String str = "";
			str+= "================================================ \nMap:";
			str+="\n------------------------------\n";
			for(int j = 1; j <= columns; j++)
			{
				for(int i = 1; i <= rows; i++)
				{
					if( i == player.getCurrentColumn() && j == player.getCurrentRow())
					{
						str+= "[O]";
						continue;
					}
					
					str+= "[ ]";
				}
				str+="\n";
			}
			str += "------------------------------ \n";
			str+= "Legend:\n O = Your location \n================================================";
			return str;
	}
	
}
