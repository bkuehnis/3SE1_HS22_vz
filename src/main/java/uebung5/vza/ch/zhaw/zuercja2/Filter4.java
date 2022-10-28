package uebung5.vza.ch.zhaw.zuercja2;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// TODO: calculate gray-values for all pixels
		for(int i=0;i<gray.length;i++) {
			for(int j=0;j<gray[i].length;j++) {
				int pixel= bild[i][j];
			
			    int red = pixel >> 16;
			    int green = (pixel & 0x00FF00) >> 8 ;
			    int blue = pixel & 0x0000FF;
			    int durchschnitt = (red + green + blue)/3;
			    gray[i][j]= (durchschnitt<<16) | (durchschnitt<<8) | durchschnitt;
			    
			}
		}
		
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
