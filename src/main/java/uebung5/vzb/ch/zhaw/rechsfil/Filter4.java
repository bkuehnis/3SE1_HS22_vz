package uebung5.vzb.ch.zhaw.rechsfil;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// TODO: calculate gray-values for all pixels

		
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				gray[h][w] = getgray(bild[h][w]);
			}
		}
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}

	static int getgray(int pixel) {
		int red = pixel >> 16;
		int green = (pixel & 0x00FF00) >> 8;
		int blue = pixel & 0x0000FF;
		int durchschnitt = (red + green + blue) / 3;
		return (((durchschnitt << 8) | durchschnitt) << 8) | durchschnitt;
	}

}
