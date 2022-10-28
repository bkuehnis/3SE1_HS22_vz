package uebung5.vzb.ch.zhaw.mulahham;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];

		for (int i = 0; i < bild.length; i++){
			for (int j = 0; j < bild[i].length; j++){
				int rot = bild[i][j] >> 16;
				int gruen = (bild[i][j] & 0b000000001111111100000000) >> 8;
				int blau = bild[i][j] & 0b000000000000000011111111;
				int mean = (rot + gruen + blau) / 3;

				gray[i][j] = ((mean << 16) | (mean << 8)) | mean;
			}
		}
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
