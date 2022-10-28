package uebung5.vzb.ch.zhaw.schulfa2;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] gray = new int[bild.length][bild[0].length];

		for (int i = 0; i < bild.length; i++) {
			for (int j = 0; j < bild[0].length; j++) {

				int pixel = bild[i][j];

				int red = pixel >> 16;
				int green = pixel & 0x00FF00 >> 8;
				int blue = pixel & 0x0000FF;

				gray[i][j] = grayPixel(red, green, blue);

			}
		}

		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}

	public static int grayPixel(int red, int green, int blue) {

		int media = (red + green + blue) / 3;

		int temp = media;
		temp = (temp << 8) + media;
		temp = (temp << 8) + media;

		return temp;
	}
}
