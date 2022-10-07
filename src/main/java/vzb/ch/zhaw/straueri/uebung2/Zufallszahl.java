package vzb.ch.zhaw.straueri.uebung2;

import java.util.Random;
public class Zufallszahl {
 public static void main(String[] args) {
 Random rn = new Random();
 int zahl = rn.nextInt(6);
 System.out.println(zahl);
 }
}