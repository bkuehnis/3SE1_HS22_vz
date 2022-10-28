package uebung5.vza.ch.zhaw.drmicfil;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// TODO: calculate gray-values for all pixels
		
		int grayValue;
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				grayValue = ((bild[h][w] & 0x0000FF) + (bild[h][w] >> 16))/3;
				
				gray[h][w] = (grayValue << 16) + (grayValue << 8) + (grayValue);
			}
		}
		
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
