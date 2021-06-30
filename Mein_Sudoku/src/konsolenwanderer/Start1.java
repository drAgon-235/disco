package konsolenwanderer;

import java.util.Scanner;

public class Start1
{

	public static void main(String[] args) 
	{
		Feld fieldGame = new Feld();
		fieldGame.buildFeld();
		fieldGame.printFeld();
		
		Player player1 = new Player(fieldGame);
		
		String decision;
		int temp = 0;
		
		Scanner lese = new Scanner(System.in);
		
		
		//Eine Schleife, die solange wiederholt wird, bis man "q" eingibt
		while(temp == 0)
		{//Jetzt bauen wir eine Switch-Methode, die uns auffordert, etwas einzugeben:
			System.out.println("Bewegungsm�glichkeiten: (g= gehen, r= rechts drehen, l= links drehen, q= beenden) aus: ");
			decision = lese.next();
			
			switch(decision)
			{
			case "g": player1.goForward(fieldGame); break;
			case "l": player1.rotateLeft(fieldGame); break;
			case "r": player1.rotateRight(fieldGame); break;
			case "q": temp = 1; System.out.println("Spiel beendet !"); break;
			default: System.out.println("Falsche Taste gedr�ckt !!!"); break;
			}	
		}
		
	}

}
