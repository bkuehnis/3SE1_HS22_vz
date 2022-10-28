package uebung5.vzb.ch.zhaw.bosluc01;

import ch.zhaw.lib.ZhawImgLib;

public class Filter5 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int [][] blur = new int[bild.length][bild[0].length];
		
		// apply blur filter
		for (int h = 1; h < bild.length - 1; h++) {
			for (int w = 1; w < bild[0].length - 1; w++) {
				int red = 0;
				int green = 0;
				int blue = 0;
				for (int i = -1; i <= 1; i++) {
					for (int j = -1; j <= 1; j++) {
						red += (bild[h + i][w + j] & 0xFF0000) >> 16;
						green += (bild[h + i][w + j] & 0xFF00) >> 8;
						blue += bild[h + i][w + j] & 0xFF;
					}
				}
				red /= 9;
				green /= 9;
				blue /= 9;
				blur[h][w] = red << 16 | green << 8 | blue;
			}
		}
		
		// show result
		ZhawImgLib.writeImage("blur.jpg", blur);
		ZhawImgLib.showImage("blur.jpg");
	}
}
