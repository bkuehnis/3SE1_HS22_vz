package uebung5.vzb.ch.zhaw.steinol3;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// TODO: calculate gray-values for all pixels
		
		for (int i = 0; i < bild.length; i++) {
			for ( int w = 0; w < bild[0].length; w++) {
				int red = (bild[i][w]) >>16;
				int green = (bild[i][w] & 0x0FF00) >> 8;
				int blue = (bild[i][w] & 0xFF);
				
				int durchschnitt = (red + green + blue) /3;
				
				gray[i][w] = (durchschnitt << 16) | (durchschnitt << 8) |durchschnitt;
					
				
				
			}
		}
		
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
