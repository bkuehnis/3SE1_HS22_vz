package uebung5.vzb.ch.zhaw.toddara1;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// TODO: calculate gray-values for all pixels
		
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				int pixel = bild[h][w];

				int r = (pixel>>16)&0xFF;
				int g = (pixel>>8)&0xFF;
				int b = pixel&0xFF;
				int avg = ((r+g+b)/3);
				
				gray[h][w] = avg;
				
			// Ausgabe funktioniert nicht, ich habe versucht den Schnitt der 3 Farben zu berechnen
			// für alle Pixeln
				
				
				//Alternative wäre hier:
				//int red = pixel >> 16;
				//int green = (pixel & 0x00FF00) >> 8;
				//int blue = pixel & 0x0000FF;
				
				//int sum = red + green + blue;
				//if (sum > 400) {
				//	gray[h][w] = 0xFFFFFF;
				//wäre aber schwarz/weiss statt grauwerte
				}
				
				
					
				
			}
		}
		
		
		// show result
//		ZhawImgLib.writeImage("gray.jpg", gray);
//		ZhawImgLib.showImage("gray.jpg");
	}
