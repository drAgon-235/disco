package konsolenwanderer;

public class Player
{	
	//Attribute:
	private char[] playerSign;
	private int currentRow;
	private int currentColumn;
	private int counter;

	//Konstruktor:
	Player(Feld field)
	{
		playerSign = new char[4];
		playerSign[0] = '^';
		playerSign[1] = '>';
		playerSign[2] = 'v';
		playerSign[3] = '<';
		currentRow = 3;
		currentColumn = 3;
		counter = 0;
		field.getField()[currentRow][currentColumn] = playerSign[counter];
	}
	
	//Rotation Right:
	public void rotateRight(Feld field)
	{
		if(counter == 0)
		{
			counter = 1;
		}
		else if(counter == 1)
		{
			counter = 2;
		}
		else if(counter == 2)
		{
			counter = 3;
		}
		else if(counter == 3)
		{
			counter = 0;
		}
		else
		{
			System.out.println("Fehler bei der Drehung nach rechts !!!");
		}
		
		field.getField()[currentRow][currentColumn] = playerSign[counter];
		field.printFeld();
		
	}
	
	
	//Rotation Left:
	public void rotateLeft(Feld field)
	{
		if(counter == 0)
		{
			counter = 3;
		}
		else if(counter == 1)
		{
			counter = 0;
		}
		else if(counter == 2)
		{
			counter = 1;
		}
		else if(counter == 3)
		{
			counter = 2;
		}
		else
		{
			System.out.println("Fehler bei der Drehung nach links !!!");
		}
			
		field.getField()[currentRow][currentColumn] = playerSign[counter];
		field.printFeld();
			
	}

	//Bewegung vorwärts in jede Richtung:
	public void goForward(Feld field)
	{
		field.getField()[currentRow][currentColumn] = ' ';    //Hier wird Position quasi "gelöscht" (Leerzeichen)
		
		//Wenn Pfeil nach oben zeigt
		if(counter == 0 && field.getField()[currentRow - 1][currentColumn] != '#')	
		{	//Verschiebungum eine Zeile höher : [currentRow - 1] 
			field.getField()[currentRow - 1][currentColumn] = playerSign[counter];
			//tatsächliche Neue Position:
			currentRow -= 1;
		}
		//Wenn Pfeil nach rechts zeigt
		else if(counter == 1 && field.getField()[currentRow][currentColumn + 1] != '#')	
		{	//Verschiebungum eine Spalte nach rechts : [currentColumn + 1] 
			field.getField()[currentRow][currentColumn + 1] = playerSign[counter];  
			//tatsächliche Neue Position:
			currentColumn += 1;
		}
		else if(counter == 2 && field.getField()[currentRow + 1][currentColumn] != '#')	
		{	 				//&&... verhindert, dass der Pfeil auf die Mauer "geschrieben" wird
			field.getField()[currentRow + 1][currentColumn] = playerSign[counter];
			currentRow += 1;
		}
		else if(counter == 3 && field.getField()[currentRow][currentColumn - 1] != '#')	
		{	 
			field.getField()[currentRow][currentColumn - 1] = playerSign[counter];
			currentColumn -= 1;
		}
		else
		{
			System.out.println("Nächster Schritt nicht möglich");
			field.getField()[currentRow][currentColumn] = playerSign[counter];
		}
		
		
		
		//Nachdem sollen diese änderungen auch angezeigt werden:
		field.printFeld();
		
	}
	
	
}
