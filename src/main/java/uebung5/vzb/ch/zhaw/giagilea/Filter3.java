package uebung5.vzb.ch.zhaw.giagilea;

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
		for (int i=0; i<frame.length; i++) {
			for (int j=0; j<frame[0].length; j++) {
				if (i < 10 || i > frame.length-10 || j < 10 || j > frame[0].length-10) {
					frame[i][j] = blue;
				} 
			}
		}
		
		for (int i=0; i<bild.length; i++) {
			for (int j=0; j<bild[0].length; j++) {
				frame[i+10][j+10] = bild[i][j];
			}
		}
		
		
		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
