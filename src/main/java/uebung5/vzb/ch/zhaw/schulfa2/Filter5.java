package uebung5.vzb.ch.zhaw.schulfa2;

import ch.zhaw.lib.ZhawImgLib;

public class Filter5 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] blur = new int[bild.length][bild[0].length];

		for (int i = 0; i < bild.length; i++) {
			for (int j = 0; j < bild[0].length; j++) {

				blur[i][j] = blurWert(bild, i, j);

			}
		}

		// show result
		ZhawImgLib.writeImage("blur.jpg", blur);
		ZhawImgLib.showImage("blur.jpg");
	}

	static int blurWert(int[][] bild, int i, int j) {

		int[] blurBox = new int[9];
        
		// alle 9 Werte in array absËichern
		blurBox[0] = (i - 1 >= 0 && j - 1 >= 0) ? bild[i - 1][j - 1] : bild[i][j];
		blurBox[1] = (i - 1 >= 0) ? bild[i - 1][j] : bild[i][j];
		blurBox[2] = (i - 1 >= 0 && j + 1 < bild[0].length) ? bild[i - 1][j + 1] : bild[i][j];
		blurBox[3] = (j - 1 >= 0) ? bild[i][j - 1] : bild[i][j];
		blurBox[4] = (j + 1 < bild[0].length) ? bild[i][j + 1] : bild[i][j];
		blurBox[5] = (i + 1 < bild.length && j - 1 >= 0) ? bild[i + 1][j - 1] : bild[i][j];
		blurBox[6] = (i + 1 < bild.length) ? bild[i + 1][j] : bild[i][j];
		blurBox[7] = (i + 1 < bild.length && j + 1 < bild[0].length) ? bild[i + 1][j + 1] : bild[i][j];
		blurBox[8] = bild[i][j];

		return rgbValue(blurBox);
	}

	static int rgbValue(int[] pixels) {

		int red = 0;
		int green = 0;
		int blue = 0;

		for (int i = 0; i < pixels.length; i++) {
            //decode
			red += pixels[i] >> 16;
			green += pixels[i] >> 8 & 0x00FF;
			blue += pixels[i] & 0x0000FF;
		}
		
		//encode
		int temp = red/9;
		temp = (temp << 8) + green/9;
		temp = (temp << 8) + blue/9;

		return temp;

	}
}
