package uebung5.vzb.ch.zhaw.bosluc01;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// calculate gray-values for all pixels
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				int red = (bild[h][w] & 0xFF0000) >> 16;
				int green = (bild[h][w] & 0xFF00) >> 8;
				int blue = bild[h][w] & 0xFF;
				int grayValue = (red + green + blue) / 3;
				gray[h][w] = grayValue << 16 | grayValue << 8 | grayValue;
			}
		}
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
