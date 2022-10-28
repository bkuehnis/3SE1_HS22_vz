package uebung5.vza.ch.zhaw.heinini2;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// calculate gray-values for all pixels
		for (int i = 0; i < gray.length; i++) {
			for (int j = 0; j < gray[0].length; j++) {
				int pixel = bild[i][j];
				
				int red = pixel >> 16;
				int green = (pixel & 0x00FF00) >> 8;
				int blue = pixel & 0x0000FF;
				
				int average = (red+green+blue)/3;
				red = average<<16;
				green = average<<8;
				int ausgabe = red|green|average;
				
				gray[i][j]= ausgabe;
				
			}
		}
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
