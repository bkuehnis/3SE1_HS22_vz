package uebung5.vzb.ch.zhaw.drarre01;

import ch.zhaw.lib.ZhawImgLib;

public class Filter5 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int [][] blur = new int[bild.length][bild[0].length];
		
		// TODO: apply blur filter

		
		// show result
		ZhawImgLib.writeImage("blur.jpg", blur);
		ZhawImgLib.showImage("blur.jpg");
	}
}
