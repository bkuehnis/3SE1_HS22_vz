package uebung5.vzb.ch.zhaw.durmibet;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] gray = new int[bild.length][bild[0].length];

		// TODO: calculate gray-values for all pixels
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[h].length; w++) {
				int rot = bild[h][w] >> 16;
				int gruen = (bild[h][w] & 0b000000001111111100000000) >> 8;
				int blau = bild[h][w] & 0b000000000000000011111111;
				int mean = (rot + gruen + blau) / 3;

				gray[h][w] = ((mean << 16) | (mean << 8)) | mean;
			}
		}

		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
