package uebung5.vzb.ch.zhaw.celikezg;

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

		// add frame of size frameWidth (pixels)
		for (int h = 0; h < frame.length; h++) {
			for (int i = 0; i < frameWidth; i++) {
				frame[h][i] = blue;
				frame[h][width + frameWidth + i] = blue;
			}
		}
		for (int w = 0; w < frame[0].length; w++) {
			for (int i = 0; i < frameWidth; i++) {
				// note: pixels in corners are written twice.
				frame[i][w] = blue;
				frame[height + frameWidth + i][w] = blue;
			}
		}
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				frame[h + frameWidth][w + frameWidth] = bild[h][w];
			}
		}

		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
