package uebung5.vzb.ch.zhaw.jermaloi;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];

		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				gray[h][w] = getGrayColor(bild[h][w]);
			}
		}
		
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}

	private static int getGrayColor(int farbe){
		int r = farbe >> 16;
		int g = (farbe & 0x00FF00) >> 8;
		int b = farbe & 0x0000FF;
		int avg = (r + g + b) / 3;
		return (((avg << 8) | avg) << 8) | avg;
	}

}
