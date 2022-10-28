package uebung5.vza.ch.zhaw.oezkasin;

import ch.zhaw.lib.ZhawImgLib;

public class Filter2 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// komme nicht mehr weiter
		
		// create array for new image
		int [][] lessColors = new int[bild.length][bild[0].length];
		
		// TODO: reduce number of different colors
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				int pixel = bild [h][w];
				int i = (pixel >> 24) & 0xFF;
				int r = (pixel >> 16) & 0xFF;
				int g = (pixel >> 8) & 0xFF;
				int b = pixel & 0xFF;
				
				i = i & 0x726FD0;
				r = r & 0x7E6EDD;
				g = g & 0x7261DF;
				b = b & 0x728DE1;
				
				pixel = (i << 24) |(r << 16)| (g << 8)| b;
			}
		}
		
		// show result
		ZhawImgLib.writeImage("lessColors.jpg", lessColors);
		ZhawImgLib.showImage("lessColors.jpg");
	}
}
