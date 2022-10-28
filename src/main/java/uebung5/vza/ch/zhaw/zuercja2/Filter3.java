package uebung5.vza.ch.zhaw.zuercja2;

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
		
		for (int i = 0; i < bild.length; i++) {
			for (int j = 0; j < bild[i].length; j++) {
		
		        if(i<=height | i>= 20) {
			        frame[i][j]=bild[i][j];
		        }
		        else if(j<=width | j>=20) {
			        frame[i][j]=bild[i][j];
		        }
			}
		}
	
		for(int c=0;c<frame.length;c++) {
			for(int j=0;j<frame[c].length;j++) {
				if(c>height | c < 20) { 
					frame[c][j]=blue;
				}
				else if(j>width | j<20) {
					frame[c][j]=blue;
				}
			}
		}
		
		
		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
	}
