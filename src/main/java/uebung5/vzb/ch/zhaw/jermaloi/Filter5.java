package uebung5.vzb.ch.zhaw.jermaloi;

import ch.zhaw.lib.ZhawImgLib;

public class Filter5 {

    public static void main(String[] args) {
        int[][] bild = ZhawImgLib.readImage("eiffel.jpg");
        ZhawImgLib.showImage("eiffel.jpg");

        // create array for new image
        int[][] blur = new int[bild.length][bild[0].length];

        for (int h = 0; h < bild.length; h++) {
            for (int w = 0; w < bild[0].length; w++) {
                blur[h][w] = getAvgNeighbourColor(bild, h, w);
            }
        }


        // show result
        ZhawImgLib.writeImage("blur.jpg", blur);
        ZhawImgLib.showImage("blur.jpg");

    }

    private static int getAvgNeighbourColor(int[][] bild, int height, int width) {
        int startPosWidth = (width - 1 < 0) ? width : width - 1; // left boundry
        int startPosHeight = (height - 1 < 0) ? height : height - 1; // upper boundry
        int endPosWidth = (width + 1 > bild[0].length - 1) ? width : width + 1; // right boundry
        int endPosHeight = (height + 1 > bild.length - 1) ? height : height + 1; // lower boundry

        int red = 0;
        int green = 0;
        int blue = 0;
        int counter = 0;
        for (int iHeight = startPosHeight; iHeight <= endPosHeight; iHeight++) {
            for (int iWidth = startPosWidth; iWidth <= endPosWidth; iWidth++) {
                int farbe = bild[iHeight][iWidth];
                red += farbe >> 16;
                green += (farbe & 0x00FF00) >> 8;
                blue += farbe & 0x0000FF;
                counter++;
            }
        }
        red /= counter;
        green /= counter;
        blue /= counter;
        return (((red << 8) | green) << 8) | blue;
    }
}
