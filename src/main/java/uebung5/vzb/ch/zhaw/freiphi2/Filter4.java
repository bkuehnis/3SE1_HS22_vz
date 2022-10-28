package uebung5.vzb.ch.zhaw.freiphi2;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] gray = new int[bild.length][bild[0].length];
		int height = bild.length;
		int width = bild[0].length;

		// TODO: calculate gray-values for all pixels
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				int red = bild[h][w] >> 16;
				int green = (bild[h][w] & 0x00FF00) >> 8;
				int blue = bild[h][w] & 0x0000FF;
				int med = (red + blue + green) / 3;
				gray[h][w] = ((med << 16) | (med << 8)) | (med >> 32);
			}

		}
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}

}
