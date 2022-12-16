package uebung12.vzb.ch.zhaw.celikezg;

import java.util.Arrays;
import java.util.Scanner;

public class Labyrinth {
	
	static char [][] feld = {{' ',' ',' ','X',' '},
            		  {' ','X',' ',' ',' '},
            		  {' ',' ','X','X','X'},
            		  {' ','X',' ',' ',' '},
            		  {' ',' ',' ','X',' '}};
	
	static int startX;
	static int startY;
	static int zielX;
	static int zielY;
	
	public static void main(String[] args) {
		printSpielfeld();
		
		// user input
		Scanner keyScan = new Scanner(System.in);
		System.out.print("Start Zeile  (0-4): ");
		startX = keyScan.nextInt();
		System.out.print("Start Spalte (0-4): ");
		startY = keyScan.nextInt();
		System.out.print("Ziel Zeile   (0-4): ");
		zielX = keyScan.nextInt();
		System.out.print("Ziel Spalte  (0-4): ");
		zielY = keyScan.nextInt();
		keyScan.close();
		
		findPath(startX,startY,"Weg: ");
	}
	
	static void printSpielfeld() {
	    for (int i=0; i<feld[0].length; i++) {
	        for (int j=0; j<feld.length; j++) {
	            System.out.print("|"+feld[i][j]);
	        }
	        System.out.println("|");
	    }
	    System.out.println("");
	}

	static void findPath(int posX, int posY, String pfad) {
		feld[posX][posY] = '.';         // Position als besucht markieren
		pfad += "("+posX+","+posY+")";  // Pfad ergänzen
		
		if (posX == zielX && posY == zielY) // Ziel erreicht?
			System.out.println(pfad);
		else { // Ziel noch nicht erreicht
			if (posX > 0 && feld[posX-1][posY] == ' ') // Prüfen, ob oben frei
				findPath(posX-1,posY,pfad); 					   // Rekursiver Aufruf
			if (posX < feld.length-1 && feld[posX+1][posY] == ' ') // Prüfen, ob unten frei
				findPath(posX+1,posY,pfad);													 // Rekursiver Aufruf
			if (posY > 0 && feld[posX][posY-1] == ' ') // Prüfen, ob links frei
				findPath(posX,posY-1,pfad);							 // Rekursiver Aufruf
			if (posY < feld[0].length-1 && feld[posX][posY+1] == ' ') // Prüfen, ob rechts frei
				findPath(posX,posY+1,pfad);															// Rekursiver Aufruf
		}
	}
}
