package uebung5.vzb.ch.zhaw.wueesnin;

import ch.zhaw.lib.ZhawImgLib;
public class Filter2 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] lessColors = new int[bild.length][bild[0].length];

		// reduce number of different colors
		for (int i = 0; i < lessColors.length; i++) {
			for (int j = 0; j < lessColors[0].length; j++) {
				lessColors[i][j] = bild[i][j] & 0xE0E0E0;
			}
		}

		// show result
		ZhawImgLib.writeImage("lessColors.jpg", lessColors);
		ZhawImgLib.showImage("lessColors.jpg");
	}
}
