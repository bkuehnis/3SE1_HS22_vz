package uebung5.vza.ch.zhaw.stettjoe;

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
				int pixel = bild[h][w];
				int newRed = transformRed(pixel);
				int newGreen = transformGreen(pixel);
				int newBlue = transformBlue(pixel);
				
				int newPixel = (newRed << 16) | (newGreen << 8) | (newBlue);
				lessColors[h][w] = newPixel;
			}
		}
			
		// show result
		ZhawImgLib.writeImage("lessColors.jpg", lessColors);
		ZhawImgLib.showImage("lessColors.jpg");
	}
	
	static int transformRed(int pixel) {
		int red = pixel >> 16;
			String redBinary = Integer.toBinaryString(red);
			if (redBinary.length() != 8) {
				char[] add = new char [8-redBinary.length()];
				for (int i = 0; i < 8 - redBinary.length(); i++) {
					add[i] = '0';
				}
				String addToString = String.valueOf(add);
				redBinary = addToString + redBinary;
			}
			char[] redBinaryChars = redBinary.toCharArray();
			for (int i = 3; i < redBinary.length(); i++) {
				redBinaryChars[i] = '0';
			}
			String newRedBinary = String.valueOf(redBinaryChars);
			int newRed = Integer.parseInt(newRedBinary,2);
			return newRed;
	}
	
	static int transformGreen(int pixel) {
		int green = (pixel & 0x00FF00) >> 8;
			String Binary = Integer.toBinaryString(green);
			if (Binary.length() != 8) {
				char[] add = new char [8-Binary.length()];
				for (int i = 0; i < 8 - Binary.length(); i++) {
					add[i] = '0';
				}
				String addToString = String.valueOf(add);
				Binary = addToString + Binary;
			}
			char[] binaryChars = Binary.toCharArray();
			for (int i = 3; i < Binary.length(); i++) {
				binaryChars[i] = '0';
			}
			String newBinary = String.valueOf(binaryChars);
			int newGreen = Integer.parseInt(newBinary,2);
			return newGreen;
	}
	
	static int transformBlue(int pixel) {
		int blue = pixel & 0x0000FF;
			String Binary = Integer.toBinaryString(blue);
			if (Binary.length() != 8) {
				char[] add = new char [8-Binary.length()];
				for (int i = 0; i < 8 - Binary.length(); i++) {
					add[i] = '0';
				}
				String addToString = String.valueOf(add);
				Binary = addToString + Binary;
			}
			char[] binaryChars = Binary.toCharArray();
			for (int i = 3; i < Binary.length(); i++) {
				binaryChars[i] = '0';
			}
			String newBinary = String.valueOf(binaryChars);
			int newBlue = Integer.parseInt(newBinary,2);
			return newBlue;
	}
}
