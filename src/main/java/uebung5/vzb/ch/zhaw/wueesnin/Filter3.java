package uebung5.vzb.ch.zhaw.wueesnin;

import ch.zhaw.lib.ZhawImgLib;

public class Filter3 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		// ZhawImgLib.showImage("eiffel.jpg");

		// settings
		int blue = 0x6495ED; // rgb(100,149,237)
		int frameWidth = 10;

		// create array for new image
		int height = bild.length;
		int width = bild[0].length;
		int[][] frame = new int[height + frameWidth * 2][width + frameWidth * 2];

		// add frame of size frameWidth (pixels)
		for (int i = 0; i < frame.length; i++) {
			for (int j = 0; j < frame[i].length; j++) {
				if (i <= frameWidth - 1) {
					// set frame in first array dimension (i)
					frame[i][j] = blue;
				} else if (i >= frame[i].length - frameWidth - 1) {
					frame[i][j] = blue;
				} else if (j <= frameWidth) {
					// set frame in second array dimension (j)
					frame[i][j] = blue;
				} else if (j >= frame[i].length - frameWidth * 2 - 1) {
					frame[i][j] = blue;
				} else {
					try {
						frame[i][j] = bild[i - frameWidth][j - frameWidth];
					} catch (Exception e) {
						System.out.println(e);
					}
				}
			}
		}

		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
