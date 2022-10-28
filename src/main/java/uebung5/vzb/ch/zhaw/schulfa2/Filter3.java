package uebung5.vzb.ch.zhaw.schulfa2;

import ch.zhaw.lib.ZhawImgLib;

public class Filter3 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// settings
		int blue = 0x6495ED; // rgb(100,149,237)
		int frameWidth = 10;

		// create array for new image
		int height = bild.length;
		int width = bild[0].length;
		int[][] frame = new int[height + frameWidth * 2][width + frameWidth * 2];

		for (int i = 0; i < height + frameWidth * 2; i++) {
			for (int j = 0; j < width + frameWidth * 2; j++) {

				frame[i][j] = blue;

			}
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {

				frame[i + frameWidth][j + frameWidth] = bild[i][j];

			}
		}

		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
