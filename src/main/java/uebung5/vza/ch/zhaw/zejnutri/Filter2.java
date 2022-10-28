package uebung5.vza.ch.zhaw.zejnutri;

import ch.zhaw.lib.ZhawImgLib;

public class Filter2 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] lessColors = new int[bild.length][bild[0].length];
		
		// TODO reduce number of different colors
		for (int height = 0; height < bild.length; height++) {
			for (int width = 0; width < bild[0].length; width++) {
		
				lessColors[height][width] = (bild[height][width] & 0xE0E0E0);
			}
		}
		
		// show result
		ZhawImgLib.writeImage("lessColors.jpg", lessColors);
		ZhawImgLib.showImage("lessColors.jpg");
	}
}
