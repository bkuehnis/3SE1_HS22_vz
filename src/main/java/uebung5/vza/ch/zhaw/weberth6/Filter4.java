package uebung5.vza.ch.zhaw.weberth6;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// TODO: calculate gray-values for all pixels
		
		for(int i=0; i<bild.length; i++) {
			 for(int j=0; j<bild[0].length; j++) {
				 int red= bild[i][j] >> 16;
			 	int green= (bild[i][j] & 0x00FF00) >> 8;
			 	int blue= bild[i][j] & 0x0000FF;
			 	
			 	int durchschnitt = (red+green+blue)/3;
			 	bild[i][j] = durchschnitt;
			 	gray[i][j] = bild[i][j];
			 }
		 }
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
