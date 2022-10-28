package uebung5.vzb.ch.zhaw.weberm08;

import ch.zhaw.lib.ZhawImgLib;

public class Filter3 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// settings
		int blue = 0x6495ED; // rgb(100,149,237)
		int frameWidth = 10;
		
		// create array for new image
		int height = bild.length;
		int width = bild[0].length;
		int [][] frame = new int[height+frameWidth*2][width+frameWidth*2];
		
		// TODO: add frame of size frameWidth (pixels)
		for (int h = 0; h < frame.length; h++) {
			for (int w = 0; w < frame[0].length; w++) {
				if (h >= frameWidth && w >= frameWidth && h <= height+frameWidth - 1 && w <= width+frameWidth - 1) {
				frame[h][w] = bild[h - frameWidth][w - frameWidth];
				} else {
					frame[h][w] = blue;
				}
			}
		}
		
		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
