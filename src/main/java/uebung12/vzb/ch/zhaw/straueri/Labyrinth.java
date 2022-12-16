package uebung12.vzb.ch.zhaw.straueri;

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
		feld[posX][posY] = '.'; // als besucht markieren
		
		pfad += "("+posX+","+posY+")";
	    if (posX == zielX && posY == zielY) { 
	    	System.out.println("\n"+pfad); // am Ziel
	    } else {
	        if (posX > 0 && feld[posX-1][posY]==' ') {
	        	findPath(posX-1,posY,pfad);
	        }
	        if (posX < 4 && feld[posX+1][posY]==' ') {
	        	findPath(posX+1,posY,pfad);
	        }
	        if (posY > 0 && feld[posX][posY-1]==' ') {
	        	findPath(posX,posY-1,pfad);
	        }
	        if (posY < 4 && feld[posX][posY+1]==' ') {
	        	findPath(posX,posY+1,pfad);
	        }
	    }
	}
}
