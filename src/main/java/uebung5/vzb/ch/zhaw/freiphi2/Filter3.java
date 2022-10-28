package uebung5.vzb.ch.zhaw.freiphi2;

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

		// TODO: add frame of size frameWidth (pixels)
		for (int h = 0, x = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				for (x = 0; x < 10; x++) {
					frame[x][w + 0] |= blue; // oben
					frame[x][w + 20] |= blue; // oben

					frame[h + 10][x] |= blue; // links

					frame[h + 10][width + 19 - x] |= blue; // rechts

					frame[height - x + 19][w + 0] |= blue; // unten
					frame[height - x + 19][w + 20] |= blue; // unten

				}
				frame[h + 10][w + 10] = bild[h][w];

			}
		}

		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
