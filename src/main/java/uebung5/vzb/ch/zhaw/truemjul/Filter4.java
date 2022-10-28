package uebung5.vzb.ch.zhaw.truemjul;

import ch.zhaw.lib.ZhawImgLib;
//kamm immer gleicher Fehler
public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// TODO: calculate gray-values for all pixels
		for (int i=0; i<bild.length; i++) {
			for (int j=0; j<bild[0].length; j++) {
				int pixel = bild[i][j];
				
				int red = pixel >> 16;
				int green = (pixel & 0x00FF00) >> 8;
				int blue = pixel & 0x0000FF;
				
				int sum = red+green+blue;
				sum /= 3;

				red = sum;
				green = sum;
				blue = sum;
				
				pixel = (red << 16) | (green << 8) | blue;
				
				gray[i][j] = pixel;
			}
		}
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
