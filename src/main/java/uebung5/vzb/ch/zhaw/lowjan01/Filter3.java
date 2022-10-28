package uebung5.vzb.ch.zhaw.lowjan01;

import ch.zhaw.lib.ZhawImgLib;

public class Filter3 {

	public static void main(String[] args) {
		int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
		ZhawImgLib.showImage("eiffel.jpg");

		// settings
		int blue = 0x6495ED; // rgb(100,149,237)
		int frameWidth = 10;

		// create array for new image
		int height = bild.length;
		int width = bild[0].length;
		int[][] frame = new int[height + frameWidth * 2][width + frameWidth * 2];
		int height2 = frame.length;
		int width2 = frame[0].length;

		System.out.println("Höhe " + height2);
		System.out.println("Breite " + width2);
		// Oberer blauen Rahmen
		for (int h = 0; h < 21; h++) {
			for (int w = 0; w < frame[0].length; w++) {
				frame[h][w] = blue;
			}
		}

		// Unterer blauen Rahmen
		for (int h = 0; (height2 - h) > (height2 - 21); h++) {
			int unt = height2 - h;
			for (int w = 0; w < width2; w++) {
				frame[unt - 1][w] = blue;
			}
		}

		// Linker blauen Rahmen
		for (int w = 0; w < 21; w++) {
			for (int h = 0; h < height2; h++) {
				frame[h][w] = blue;
			}
		}

		// rechter blauer Rahmen
		for (int w = 0; width2 - w > (width2 - 21); w++) {
			int test1 = width2 - w;
			for (int h = 0; h < height2; h++) {
				frame[h][test1 - 1] = blue;
			}
		}

		// Bild hinzufügen (eingemittet)
		for (int h = 21; h < bild.length; h++) {
			for (int w = 21; w < bild[0].length; w++) {
				frame[h][w] = bild[h][w];
			}
		}

		// show result
		ZhawImgLib.writeImage("frame.jpg", frame);
		ZhawImgLib.showImage("frame.jpg");
	}
}
