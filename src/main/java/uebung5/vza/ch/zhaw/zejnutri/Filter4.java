package uebung5.vza.ch.zhaw.zejnutri;

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
				int r = (bild[h][w] & 0xFF0000) >> 16;
			int g = (bild[h][w] & 0xFF00) >> 8;
			int b = (bild[h][w] & 0xFF);
			int gv = (r+g+b)/3;  // gray value
			gray[h][w] = (gv << 16) | (gv << 8) | gv;
			}
		}

		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
