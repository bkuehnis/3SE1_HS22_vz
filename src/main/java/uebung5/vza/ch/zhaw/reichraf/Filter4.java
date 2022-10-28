package uebung5.vza.ch.zhaw.reichraf;

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
		
		int red= bild[h][w]>>16;
		int green = (bild[h][w] & 0x00FF00) >>8;
		int blue = bild[h][w] & 0x0000FF;
		
		int durchschnitt = (red + green + blue)/3;
		
		int red2 = durchschnitt<<16;
		int green2 = durchschnitt<<8;
		int blue2 = durchschnitt;
		
		int grau = red2|green2|blue2;
				gray[h][w] = grau;
			}
		}
		
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
