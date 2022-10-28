package uebung5.vzb.ch.zhaw.toddara1;

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
		
		 for (int h = 0; h < height+frameWidth*2; h++) {
		     for (int w = 0; w < width+frameWidth*2; w++) {
		    	// if (h >= frameWidth && w < bild.length && w>=bild.length)
		      
		    	 bild[h][w] = frame[h][w] & 0x6495ED; 
		     }
		
		
		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
	}
}
