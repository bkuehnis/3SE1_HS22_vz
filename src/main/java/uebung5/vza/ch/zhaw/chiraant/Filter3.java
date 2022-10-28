package uebung5.vza.ch.zhaw.chiraant;

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
		for (int i=0;i<frame.length; i++) {
			for (int j=0;j<frame[0].length;j++) {
				frame[i][j]= blue;
			}
			
		}
		for (int i = 0; i < frame.length;i++) {
			for (int j = 0; j < 50;j++) {
			 // Wie fügt man bild ein? frame[i][j] = 0x000000;
			}
		}
		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
