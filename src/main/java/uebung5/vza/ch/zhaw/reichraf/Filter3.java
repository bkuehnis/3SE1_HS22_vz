package uebung5.vza.ch.zhaw.reichraf;

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
		
		
		// oberer Ramen
		for (int h = 0; h < frameWidth; h++) {
			for (int w = 0; w < bild[0].length +frameWidth*2; w++) {
				frame[h][w] = blue; 
			}
		}
		
		// unterer Ramen
		for (int h = frameWidth+bild.length-1; h < frameWidth*2+bild.length; h++) {
			for (int w = 0; w < bild[0].length +frameWidth*2; w++) {
				frame[h][w] = blue; 
			}
		}
		
		// linker Ramen
		for (int h = frameWidth-1; h < bild.length+frameWidth-1; h++) {
			for (int w = 0; w < frameWidth; w++) {
				frame[h][w] = blue; 
			}
		}
		// rechter Ramen
		for (int h = frameWidth-1; h < bild.length+frameWidth-1; h++) {
			for (int w = frameWidth+bild[0].length-1; w < frameWidth*2+bild[0].length; w++) {
				frame[h][w] = blue; 
			}
		}
		
		// Bild eifügen
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
			frame[h+frameWidth][w+frameWidth] = bild[h][w];
			}
		}
		
		
		
		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
