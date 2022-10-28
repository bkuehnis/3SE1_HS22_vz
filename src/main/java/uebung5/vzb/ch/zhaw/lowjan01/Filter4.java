package uebung5.vzb.ch.zhaw.lowjan01;

import ch.zhaw.lib.ZhawImgLib;

public class Filter4 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// create array for new image
		int[][] gray = new int[bild.length][bild[0].length];

		for (int h = 0; h < gray.length; h++) {
			for (int w = 0; w < gray[0].length; w++) {
				int pixel = bild[h][w];

				int red = pixel >> 16;
				int green = (pixel & 0x00FF00) >> 8;
				int blue = pixel & 0x0000FF;

				int sum = red + green + blue;
				int mittelwert = sum / 3;
				String hex = Integer.toHexString(sum);
				gray[h][w] = mittelwert;

			}
		}

		//// Leider kann ich den Integer (Mittelwert) nicht in eine Hex umwandeln - Beim
		//// einsetzen vom Mittelwert wird das Bild völlig verfälscht

		// show result
		ZhawImgLib.writeImage("gray.jpg", gray);
		ZhawImgLib.showImage("gray.jpg");
	}
}
