package uebung5.vza.ch.zhaw.streiluc;

import ch.zhaw.lib.ZhawImgLib;

public class Filter2 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] lessColors = new int[bild.length][bild[0].length];
		
		// TODO: reduce number of different colors
		for(int i=0; i< lessColors.length;i++) {
			for(int w=0; i<lessColors[0].length;w++) {
				int rot=0xFF;
				int blau=0x00FF;
				int grün=0x000FF;
		if(lessColors[i][w] ==rot) {
			lessColors[i][w] = 0xFF00000;
		}else if (lessColors[i][w] == blau) {
			lessColors[i][w]= 0x00FF00;
		}else {
			lessColors[i][w]= 0x0000FF;
		}
			}
		}
		
		//hab das Problem irgendwie nichg mehr gesehen
		// show result
		ZhawImgLib.writeImage("lessColors.jpg", lessColors);
		ZhawImgLib.showImage("lessColors.jpg");
	}
	}

