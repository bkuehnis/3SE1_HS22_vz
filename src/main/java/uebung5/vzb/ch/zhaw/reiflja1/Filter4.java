package uebung5.vzb.ch.zhaw.reiflja1;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] gray = new int[bild.length][bild[0].length];
		int red = 0;
		int green = 0;
		int blue = 0;
		int grey = 0;

		// calculate gray-values for all pixels
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				red = (bild[h][w] & 0xFF0000) >> 16;
				green = (bild[h][w] & 0x00FF00) >> 8;
				blue = bild[h][w] & 0x0000FF;
				grey = (red + green + blue) / 3;
				gray[h][w] = (grey << 16) | (grey << 8) | grey;
			}
		}

		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
