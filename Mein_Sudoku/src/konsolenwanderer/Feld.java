package konsolenwanderer;

public class Feld
{
	private char[][] field;
	
	
	//Konstruktor:
	Feld()
	{
		field = new char[20][100];
	}
	
	//Getters & Setters (automatisch):
	
		public char[][] getField() {
			return field;
		}

		public void setField(char[][] field) {
			this.field = field;
		}
	
	
	
		public void buildFeld()
	{	//Erst links und rechts Abgrenzung bauen:
		for(int i = 0; i < field.length; i++)
		{	//Jetzt wird in jeder Zeile die erste und letzte Zelle mit '#' bef�llt
			field[i][0] = '#';
			field[i][99] = '#';
			for(int t = 1; t < (field.length -1); t++)
			{//In den restlichen Zeilen wird (ausser in Zeile 1 und 2) noch ein Leerzeichen ' ' eingef�gt
				field[i][t] = ' ';
			}
		}
		
		//Begrenzung oben:
		for(int i = 0; i < field[0].length; i++)
		{
			if(i > 0 && i < (field[0].length -1 ))         //WARUM -1 ; es geht genauso gut ohne !!!!
			{
				field[0][i] = '#';
			}
		}
		 
		//Begrenzung unten:
		for(int i = 0; i < field[19].length; i++)
		{
			if(i > 0 && i < (field[19].length -1 ))			//WARUM -1 ; es geht genauso gut ohne !!!!
			{
				field[19][i] = '#';
			}
		}
		
		
	}
	

	//Print Methode: (wird gleich am Anfang gemacht)
	public void printFeld()
	{
		for(int i = 0; i < field.length; i++)
		{
			for(int j = 0; j < field[i].length; j++)
			{
				System.out.print(field[i][j]);    //Kein Zeilenumbruch !!!
			}
			System.out.println();   // Sorgt f�r den Zeilenumbruch !!!
		}
	}
	
}
