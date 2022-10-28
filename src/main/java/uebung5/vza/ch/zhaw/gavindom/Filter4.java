package uebung5.vza.ch.zhaw.gavindom;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// TODO: calculate gray-values for all pixels
		
		for (int h = 0; h < gray.length; h++) {
			for (int w = 0; w < gray[0].length; w++) {
			

		// Die Farben auslesen
		int red = bild[h][w] >> 16;
		int green = (bild[h][w] & 0x00FF00) >> 8;
		int blue = bild[h][w] & 0x0000FF;


		int Durchschnitt = (red+green+blue)/3;

		// Die Farben wieder zusammenfügen 
		gray[h][w] = (Durchschnitt << 16) | (Durchschnitt << 8) | Durchschnitt;
			}
		}

		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	

			}
			}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
	/*		for (int h = 0; h < gray.length; h++) {
			for (int w = 0; w < gray[0].length; w++) {
			
				int test = gray[h][w];
				int red = (test>> 16) & 0xFF;
				int green = (test >> 8) & 0xFF;
				int blue = (test) & 0xFF;
				
				
				int pixel = (red+blue+green);
				
				
				//int pixel = (red << 16) | (green << 8) | blue;
				
		
				
				int neu = pixel / 3;
				 
			
				
		//	int	Durchschnitt = (red*green*blue)/3;
				
			//	if (Durchschnitt > 200) {
			//		gray[h][w] = 0xFFFFFF; 
				
				gray [h][w] = neu;
				
			//	System.out.println(gray);
		
		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
			}
			}
			}
	}

*/

