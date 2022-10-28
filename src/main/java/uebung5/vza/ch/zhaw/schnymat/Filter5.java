package uebung5.vza.ch.zhaw.schnymat;

import ch.zhaw.lib.ZhawImgLib;

public class Filter5 {
	static int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
	public static void main(String[] args) {
		ZhawImgLib.showImage("eiffel.jpg");
		// create array for new image
		int [][] blur = new int[bild.length][bild[0].length];
		
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				blur[h][w] = calculateBlur(h, w);
			}
		}
		
		// show result
		ZhawImgLib.writeImage("blur.jpg", blur);
		ZhawImgLib.showImage("blur.jpg");
	}

	public static Integer calculateBlur(int height, int width) {
		int sumRed = 0;
		int sumGreen = 0;
		int sumBlue = 0;
		int counter = 0;

		for (int h = height-1; h <= height + 1; h++) {
			for (int w = width -1; w <= width + 1; w++) {
				if (h >= 0 && w >= 0 && h < bild.length && w < bild[0].length) {
					sumRed += (bild[h][w] >> 16);
					sumGreen += (bild[h][w] >> 8 & 0x00FF);
					sumBlue += (bild[h][w] & 0x0000FF);
					counter++;
				}
			}
		}

		sumRed = sumRed / counter;
		sumGreen = sumGreen / counter;
		sumBlue = sumBlue / counter;

		return (sumRed << 16) + (sumGreen << 8) + (sumBlue) ;
	}
}
