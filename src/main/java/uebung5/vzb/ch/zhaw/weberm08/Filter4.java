package uebung5.vzb.ch.zhaw.weberm08;

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
				int pixel = bild[h][w];
				int red = pixel >> 16;
				int green = (pixel & 0x00FF00) >> 8;
				int blue = pixel & 0x0000FF;
				int average = (red + green + blue) / 3;
				
				//gray[h][w] = (red + green + blue) / 3;
				
					//gray[h][w] = 0xFFFFFF;
				gray[h][w] = (average << 16) | (average << 8) | average;
				
			}
		}
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
