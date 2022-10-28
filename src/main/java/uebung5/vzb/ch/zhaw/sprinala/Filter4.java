package uebung5.vzb.ch.zhaw.sprinala;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		for (int h = 0; h<bild.length; h++){
			for (int w = 0; w<bild[h].length; w++){
				int mean = 0;

				int red = bild[h][w] >> 16;
				int green = (bild[h][w] & 0x00FF00) >> 8;
				int blue = bild[h][w] & 0x0000FF;

				mean = (red + green + blue)/3;
				bild[h][w] = (0xFF<<24)| (mean<<16) | (mean<<8)| mean;
				gray[h][w] = bild[h][w];


			}
		}
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
