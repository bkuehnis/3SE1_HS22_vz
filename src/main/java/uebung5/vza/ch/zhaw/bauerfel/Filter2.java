package uebung5.vza.ch.zhaw.bauerfel;

import ch.zhaw.lib.ZhawImgLib;

public class Filter2 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] lessColors = new int[bild.length][bild[0].length];

		// TODO: reduce number of different colors

		for (int i = 0; i < bild.length; i++) {
			for (int j = 0; j < bild[i].length; j++) {
				int pixel = bild[i][j];
				lessColors[i][j] = (pixel & 0xF0F0F0);
			}
		}
		// show result
		ZhawImgLib.writeImage("lessColors.jpg", lessColors);
		ZhawImgLib.showImage("lessColors.jpg");
	}
}