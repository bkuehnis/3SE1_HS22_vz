package uebung5.vza.ch.zhaw.oezkasin;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// habe es leider nicht geschafft
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// TODO: calculate gray-values for all pixels
		int height = bild.length;
		int width = bild[0].length;
		
		for (int h = 0; h < height; h++) {
			for (int w = 0; w < width; w++) {
				int pixel = bild[h][w];
				
				int red = (pixel >> 16) & 0xFF;
				int green = (pixel >> 8) & 0xFF;
				int blue = pixel & 0xFF;
				
				int d = (red + green + blue) / 3;
				
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
	}
}

