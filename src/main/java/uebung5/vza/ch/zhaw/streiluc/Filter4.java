package uebung5.vza.ch.zhaw.streiluc;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");
		
		// create array for new image
		int [][] gray = new int[bild.length][bild[0].length];
		
		// TODO: calculate gray-values for all pixels
		 for (int x = 0; x < bild.length; ++x)
			    for (int y = 0; y < bild.length; ++y)
			    {
			        int rgb = gray[x][y];
			        int r = (rgb >> 16) & 0xFF;
			        int g = (rgb >> 8) & 0xFF;
			        int b = (rgb & 0xFF);

			        // Normalize and gamma correct:
			        double rr = Math.pow(r / 255.0, 2.2);
			        double gg = Math.pow(g / 255.0, 2.2);
			        double bb = Math.pow(b / 255.0, 2.2);

			        // Calculate luminance:
			        double lum = 0.2126 * rr + 0.7152 * gg + 0.0722 * bb;

			        // Gamma compand and rescale to byte range:
			        int grayLevel = (int) (255.0 * Math.pow(lum, 1.0 / 2.2));
			        int gray1 = (grayLevel << 16) + (grayLevel << 8) + grayLevel;
			        
					ZhawImgLib.writeImage("gray.jpg", gray);
					ZhawImgLib.showImage("gray.jpg");
			    }
		
	}
}

		
		
		// show result

		

