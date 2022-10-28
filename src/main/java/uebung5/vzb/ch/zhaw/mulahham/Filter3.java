package uebung5.vzb.ch.zhaw.mulahham;

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
		
		for (int i = 0; i < frame.length; i++){
			for (int j = 0; j < frame[i].length; j++) {
				if (i < frameWidth || i >= height+frameWidth || j < frameWidth || j >= width+frameWidth){
					frame[i][j] = blue;
				}
				else {
					frame[i][j] = bild[i-frameWidth][j-frameWidth];
				}
			}
		}

		
		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
