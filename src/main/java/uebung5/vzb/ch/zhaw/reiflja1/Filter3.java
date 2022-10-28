package uebung5.vzb.ch.zhaw.reiflja1;

import ch.zhaw.lib.ZhawImgLib;

public class Filter3 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// settings
		int blue = 0x6495ED; // rgb(100,149,237)
		int frameWidth = 10;

		// create array for new image
		int height = bild.length + frameWidth * 2;
		int width = bild[0].length + frameWidth * 2;
		int[][] frame = new int[height][width];

		// add frame of size frameWidth (pixels)
		for (int h = 0; h < frame.length; h++) {
			for (int w = 0; w < frame[0].length; w++) {
				if (w <= frameWidth || w >= width - frameWidth || h <= frameWidth || h >= height - frameWidth) {
					frame[h][w] = blue;
				} else {
					frame[h][w] = bild[h - frameWidth][w -frameWidth];
				}

			}
		}

		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
