package uebung5.vza.ch.zhaw.baechni2;

import ch.zhaw.lib.ZhawImgLib;

public class Filter2 {

	public static void main(String[] args) {
		int [][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int [][] lessColors = new int[bild.length][bild[0].length];

		// TODO: reduce number of different colors
		for (int h = 0; h < bild.length; h++) {
			for (int w = 0; w < bild[0].length; w++) {
				lessColors[h][w] = bild[h][w] & 0xE0E0E0;
			}
		}
		// show result
		ZhawImgLib.writeImage("lessColors.jpg", lessColors);
		ZhawImgLib.showImage("lessColors.jpg");
	}
}
// ich bin bei diesem thema sehr aufgeschmissen und muss es mir unbedingt dieses weekend genauer anschauen. diese arbeit wurde mit anderen personen zusammen generiert