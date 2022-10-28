package uebung5.vzb.ch.zhaw.steinol3;

import ch.zhaw.lib.ZhawImgLib;

public class Filter2 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		
		int [][] lessColors = new int[bild.length][bild[0].length];
		
		
		for (int h = 0; h < bild.length; h++) {
			for (int j = 0; j < bild[0].length; j++) {
				
				
				
				bild[h][j] = bild[h][j] & 0xFFFFE0;
				
				
				
				
			
				
				
				
				
				
				lessColors[h][j] = bild[h][j] ;
				
			}
		}
		
		
		
		
		// show result
		ZhawImgLib.writeImage("lessColors.jpg", lessColors);
		ZhawImgLib.showImage("lessColors.jpg");
	}
}
