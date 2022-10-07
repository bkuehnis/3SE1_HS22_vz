package vzb.ch.zhaw.weberm08.uebung2;

import java.util.Scanner;

public class MaxOfFour {
	
	public static void main(String[] args) {
		 Scanner keyScan = new Scanner(System.in);
		 System.out.println("Bitte vier Zahlen eingeben:");
		 int a1 = keyScan.nextInt();
		 int a2 = keyScan.nextInt();
		 int a3 = keyScan.nextInt();
		 int a4 = keyScan.nextInt();
		 
		 int arr[] = {a1, a2, a3, a4};
		 bubbleSort(arr);
		 
		 System.out.println("Die grösste eingegebene Zahl ist "+ arr[3]);
		 
		 }
	//Methode bubbleSort kopiert von https://www.javatpoint.com/bubble-sort-in-java
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
	}
}
