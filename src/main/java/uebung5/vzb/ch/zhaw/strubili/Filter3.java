package uebung5.vzb.ch.zhaw.strubili;

import ch.zhaw.lib.ZhawImgLib;

public class Filter3 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// settings
		int blue = 0x6495ED; // rgb(100,149,237)
		int frameWidth = 5;
		
		// create array for new image
		int height = bild.length;
		int width = bild[0].length;
		int [][] frame = new int[height+frameWidth*2][width+frameWidth*2];
		
		// add frame of size frameWidth (pixels)
		for (int h = 0; h < frame.length; h++) {
			for (int w = 0; w < frame[0].length; w++) {
				frame [h][w] = blue;
				}
			}
		for (int h = 10; h < bild.length; h++) {
			for (int w = 10; w < bild[0].length; w++) {
				frame [h][w] = bild [h][w];
				}
			}
		
		// show result
				ZhawImgLib.writeImage("frame.jpg", frame);
				ZhawImgLib.showImage("frame.jpg");
}
}
