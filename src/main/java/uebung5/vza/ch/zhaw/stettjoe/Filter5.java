package uebung5.vza.ch.zhaw.stettjoe;

import ch.zhaw.lib.ZhawImgLib;

public class Filter5 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int [][] blur = new int[bild.length][bild[0].length];
		
		// TODO: apply blur filter
		
		blur[0][0] = bild[0][0];
		blur[0][bild[0].length-1] = bild[0][bild[0].length-1];
		blur[bild.length-1][0] = bild[bild.length-1][0];
		blur[bild.length-1][bild[0].length-1] = bild[bild.length-1][bild[0].length-1];
		
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				// blur pixel at left edge
				if (h > 0 && h < bild.length-2 && w == 0) {
					int pixelEL1 = bild[h][w];
					int pixelEL2 = bild[h-1][w];
					int pixelEL3 = bild[h-1][w+1];
					int pixelEL4 = bild[h][w+1];
					int pixelEL5 = bild[h+1][w+1];
					int pixelEL6 = bild[h+1][w];
					
					blur[h][w] = pixelEdgeL(pixelEL1, pixelEL2, pixelEL3, pixelEL4, pixelEL5, pixelEL6);
					
					// blur pixel at right edge
				} else if (h > 0 && h < bild.length-2 && w == bild[0].length-1) {
					int pixelER1 = bild[h][w];
					int pixelER2 = bild[h-1][w];
					int pixelER3 = bild[h-1][w-1];
					int pixelER4 = bild[h][w-1];
					int pixelER5 = bild[h+1][w-1];
					int pixelER6 = bild[h+1][w];
					
					blur[h][w] = pixelEdgeL(pixelER1, pixelER2, pixelER3, pixelER4, pixelER5, pixelER6);
					
					// blur pixel at upper edge
				} else if (h == 0 && w > 0 && w < bild[0].length-2) {
					int pixelEO1 = bild[h][w];
					int pixelEO2 = bild[h][w-1];
					int pixelEO3 = bild[h+1][w-1];
					int pixelEO4 = bild[h+1][w];
					int pixelEO5 = bild[h+1][w+1];
					int pixelEO6 = bild[h][w+1];
					
					blur[h][w] = pixelEdgeL(pixelEO1, pixelEO2, pixelEO3, pixelEO4, pixelEO5, pixelEO6);
					
					// blur pixel at lower edge
				} else if (h == bild.length-1 && w > 0 && w < bild[0].length-2) {
					int pixelEU1 = bild[h][w];
					int pixelEU2 = bild[h][w-1];
					int pixelEU3 = bild[h-1][w-1];
					int pixelEU4 = bild[h-1][w];
					int pixelEU5 = bild[h-1][w+1];
					int pixelEU6 = bild[h][w+1];
					
					blur[h][w] = pixelEdgeL(pixelEU1, pixelEU2, pixelEU3, pixelEU4, pixelEU5, pixelEU6);
					
				} else if (h != 0 && h != bild.length-1 && w != 0 && w != bild[0].length-1) {
					int pixel1 = bild[h][w];
					int pixel2 = bild[h][w-1];
					int pixel3 = bild[h-1][w-1];
					int pixel4 = bild[h-1][w];
					int pixel5 = bild[h-1][w+1];
					int pixel6 = bild[h][w+1];
					int pixel7 = bild[h+1][w];
					int pixel8 = bild[h+1][w-1];
					int pixel9 = bild[h+1][w+1];
					
					blur[h][w] = pixelBlur(pixel1, pixel2, pixel3, pixel4, pixel5, pixel6, pixel7, pixel8, pixel9);
					
				}
			}
		}
		
		// show result
		ZhawImgLib.writeImage("blur.jpg", blur);
		ZhawImgLib.showImage("blur.jpg");
	
	}
	static int pixelEdgeL(int pixelEL1, int pixelEL2, int pixelEL3, int pixelEL4, int pixelEL5, int pixelEL6) {
		
		int [] pixelEdgeL = {pixelEL1, pixelEL2, pixelEL3, pixelEL4, pixelEL5, pixelEL6,};
		int [] pixelEdgeLRed = new int [6];
		int [] pixelEdgeLGreen = new int [6];
		int [] pixelEdgeLBlue = new int [6];
		int sumRed = 0;
		int sumGreen = 0;
		int sumBlue = 0;
		for (int i = 0; i < pixelEdgeL.length; i++) {
			pixelEdgeLRed[i] = pixelEdgeL[i] >> 16;
			pixelEdgeLGreen[i] = (pixelEdgeL[i] & 0x00FF00) >> 8;
			pixelEdgeLBlue[i] = pixelEdgeL[i] & 0x0000FF;
		}
		for (int i = 0; i < pixelEdgeL.length; i++) {
			sumRed += pixelEdgeLRed[i];
			sumGreen += pixelEdgeLGreen[i];
			sumBlue += pixelEdgeLBlue[i];
		}
		sumRed /= 6;
		sumGreen /= 6;
		sumBlue /= 6;
		
		return (sumRed << 16) | (sumGreen << 8) | (sumBlue);
	}
	static int pixelBlur(int pixel1, int pixel2, int pixel3, int pixel4, int pixel5, int pixel6, int pixel7, int pixel8, int pixel9) {
		int [] pixelRest = {pixel1, pixel2, pixel3, pixel4, pixel5, pixel6, pixel7, pixel8, pixel9};
		int [] pixelRestRed = new int [9];
		int [] pixelRestGreen = new int [9];
		int [] pixelRestBlue = new int [9];
		int sumRed = 0;
		int sumGreen = 0;
		int sumBlue = 0;
		for (int i = 0; i < pixelRest.length; i++) {
			pixelRestRed[i] = pixelRest[i] >> 16;
			pixelRestGreen[i] = (pixelRest[i] & 0x00FF00) >> 8;
			pixelRestBlue[i] = pixelRest[i] & 0x0000FF;
		}
		for (int i = 0; i < pixelRest.length; i++) {
			sumRed += pixelRestRed[i];
			sumGreen += pixelRestGreen[i];
			sumBlue += pixelRestBlue[i];
		}
		sumRed /= 9;
		sumGreen /= 9;
		sumBlue /= 9;
		
		return (sumRed << 16) | (sumGreen << 8) | (sumBlue);
	}
}
