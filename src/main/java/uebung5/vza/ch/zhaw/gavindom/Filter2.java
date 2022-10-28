package uebung5.vza.ch.zhaw.gavindom;

import ch.zhaw.lib.ZhawImgLib;

public class Filter2 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] lessColors = new int[bild.length][bild[0].length];
		
		// TODO: reduce number of different colors
		
		
		for (int h = 0; h < bild.length; h++) {
		for (int w = 0; w < bild[0].length; w++) {
			
			// Die Farben auslesen
			int red = bild[h][w] >> 16;
			int green = (bild[h][w] & 0x00FF00) >> 8;
			int blue = bild[h][w] & 0x0000FF;

			// Schieben um 5 hin und zurück
			red = (red >> 5) << 5;
			green = (green >> 5) << 5;
			blue = (blue >> 5) << 5;

			// Die Fraben wieder zusammenfügen
			lessColors[h][w] = (red << 16) | (green << 8) | blue;
	}
	}

	ZhawImgLib.writeImage("lessColors.jpg", lessColors);
			ZhawImgLib.showImage("lessColors.jpg");
		

		}
		}
		
	

	
	
