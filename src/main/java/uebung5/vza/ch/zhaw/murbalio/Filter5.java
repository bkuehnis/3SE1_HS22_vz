package uebung5.vza.ch.zhaw.murbalio;

import ch.zhaw.lib.ZhawImgLib;

public class Filter5 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int [][] blur = new int[bild.length][bild[0].length];
		
		// apply blur filter
		int height = bild.length;
		int width = bild[0].length;
		int boxSize = 3;
		int halfBox = boxSize/2;
		
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				int r=0, g=0, b=0, count=0; 
				for (int i=0; i<boxSize; i++) {
					for (int j=0; j<boxSize; j++) {
						int posH = h-halfBox+i;
						int posW = w-halfBox+j;
						if (posH >= 0 && posW >= 0 && posW < width && posH < height) {
							r += ((bild[posH][posW] & 0xFF0000) >> 16);
							g += ((bild[posH][posW] & 0xFF00) >> 8);
							b += ((bild[posH][posW] & 0xFF));
							count++;
						}
					}
				}
				r /= count;
				g /= count;
				b /= count;
				blur[h][w] = (r << 16) | (g << 8) | b; 
			}
		}
		
		// show result
		ZhawImgLib.writeImage("blur.jpg", blur);
		ZhawImgLib.showImage("blur.jpg");
	}
}
