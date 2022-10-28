package uebung5.vza.ch.zhaw.friesti1;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] gray = new int[bild.length][bild[0].length];

		// calculate gray-values for all pixels
		for (int h = 0; h < gray.length; h++) {
			for (int w = 0; w < gray[h].length; w++) {
				int pixel = bild[h][w];
				int red = pixel >> 16;
				int green = (pixel & 0x00FF00) >> 8;
				int blue = pixel & 0x0000FF;
				int durchschnitt = (red + green + blue) / 3;
				int pixelNew = (durchschnitt << 16) | (durchschnitt << 8) | durchschnitt;
				gray[h][w] = pixelNew;

			}
		}

		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
