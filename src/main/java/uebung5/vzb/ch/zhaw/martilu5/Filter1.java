package uebung5.vzb.ch.zhaw.martilu5;

import ch.zhaw.lib.ZhawImgLib;

public class Filter1 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int [][] noGreen = new int[bild.length][bild[0].length];
		
		// remove green


		
		
		
		// show result
		ZhawImgLib.writeImage("noGreen.jpg", noGreen);
		ZhawImgLib.showImage("noGreen.jpg");
	}
}
