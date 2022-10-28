package uebung5.vza.ch.zhaw.kuralsar;

import ch.zhaw.lib.ZhawImgLib;

public class Filter1 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int [][] noGreen = new int[bild.length][bild[0].length];
		
		// remove green
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				noGreen[h][w] = bild[h][w] & 0xFF00FF;
			}
		}
		
		// show result
		ZhawImgLib.writeImage("noGreen.jpg", noGreen);
		ZhawImgLib.showImage("noGreen.jpg");
	}
}
