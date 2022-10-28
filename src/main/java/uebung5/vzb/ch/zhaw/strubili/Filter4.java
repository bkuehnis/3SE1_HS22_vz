package uebung5.vzb.ch.zhaw.strubili;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// calculate gray-values for all pixels
		int r = 0;
		int g = 0;
		int b =  0;
		int avg = 0;
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				r = bild [h][w] >> 16;
				g = bild [h][w] >> 8 & 0xFF00FF;
				b = bild [h][w] & 0x0000FF;
				avg = (r+g+b)/3;
				
				gray[h][w] = (avg << 16) | (avg << 8) | avg;
			}
		}
		
		// Bit operatoren, schieben um werte in einer Variabel zu speichern
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
