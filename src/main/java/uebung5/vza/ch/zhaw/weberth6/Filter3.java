package uebung5.vza.ch.zhaw.weberth6;

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
		
		
		for(int i=0; i<frame.length; i++) {
			 for(int j=0; j<frameWidth; j++) {
				 frame[i][j] = blue;	 
			 }
		 }
		
		for(int i=0; i<frameWidth; i++) {
			 for(int j=0; j<bild[0].length; j++) {
				 frame[i][j] = blue;	 
			 }
		 }
		
		for(int i=0; i<frame.length; i++) {
			 for(int j=width-frameWidth; j<width; j++) {
				 frame[i][j] = blue;	 
			 }
		 }
		
		for(int i=width-frameWidth; i<frame.length; i++) {
			 for(int j=height-frameWidth; j<height; j++) {
				 frame[i][j] = blue;	 
			 }
		 }
		
		
		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
