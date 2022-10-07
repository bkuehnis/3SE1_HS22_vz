package vza.ch.zhaw.ahmaddav.uebung2;

import java.util.Random;
import java.util.Scanner;


public class SW02_Uebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner keyScan = new Scanner(System.in);	
Random rn = new Random();
int zahl = rn.nextInt(101);


System.out.println("Rate eine Zahl zwischen 0-100");
int answer = keyScan.nextInt();

int count = 1;

while (answer != zahl) {
	if (answer<zahl) {
		System.out.println("Zu klein");
		answer = keyScan.nextInt();
		count++;
		
	}	if (answer>zahl) {
		System.out.println("Zu gross");
		answer = keyScan.nextInt();
		count++;
		
		} if (answer == zahl) {
			System.out.println("Richtig. Du hast " +count+ " Versuche benötigt.");
		}
	}
	
	 
	

		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}


