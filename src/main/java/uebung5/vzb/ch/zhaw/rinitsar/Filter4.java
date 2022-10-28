package uebung5.vzb.ch.zhaw.rinitsar;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				int pixel = bild[h][w];
				
			// Werte aussortieren
			int red = pixel >> 16;
			int green = (pixel & 0x00FF00) >> 8;
			int blue = pixel & 0x0000FF;
			
			int grau = (red + green + blue)/3; //Durchschnitt red, green, blue wird zu grau
			
			
			pixel = (grau << 16) | (grau << 8) | grau; // Graue Werte zurückverschieben
			
			gray[h][w] = pixel;
			}
		}
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
