//package vzb.ch.zhaw.straueri.uebung4;
//
//import ch.zhaw.lib.ZhawWavLib;
//public class Audio {
//
//	public static void main(String[] args) {
//		// read and play original wav file
//		double[] signal = ZhawWavLib.read("Guitar.wav");
//		ZhawWavLib.play("Guitar.wav");
//
//		// mirror the audio signal
//		double[] mirroredSignal = new double[signal.length];
//		for (int i = 0; i < signal.length; i++) {
//			int index = signal.length - 1 - i;
//			mirroredSignal[index] = signal[i];
//		}
//
//		// decrease volume of the audio signal
//		double[] lowSignal = new double[signal.length];
//		// TODO calculate lowSignal
//		for (int e = 0; e < signal.length; e++) {
//
//			lowSignal[e] = signal[e] * 0.5;
//		}
//		// increase volume of the audio signal
//		double[] highSignal = new double[signal.length];
//		// TODO calculate highSignal
//		for (int f = 0; f < signal.length; f++) {
//
//			double newSignal = signal[f] * 1.5;
//			if (newSignal > 1.0) {
//				newSignal = 1.0;
//			} else if (newSignal < -1.0) {
//				newSignal = -1.0;
//			}
//			highSignal[f] = newSignal;
//		}
//		// increase frequency by a "quinte"
//		int newlength = signal.length * 2 / 3;
//		double[] signalQuinte = new double[newlength + 1];
//		int j = 0;
//		for (int i = 0; i < signal.length; i++) {
//			if ((i + 1) % 3 != 0) {
//				signalQuinte[j] = signal[i];
//				j++;
//			}
//		}
//		// increase frequency by an "oktave"
//		double[] signalOktave = new double[signal.length / 2];
//		for (int i = 0; i < signal.length / 2; i++) {
//			signalOktave[i] = signal[i * 2];
//		}
//
//		// write and play modified wav file
//		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
//		ZhawWavLib.play("Guitar-mirrored.wav");
//		ZhawWavLib.write(lowSignal, "lowSignal.wav");
//		ZhawWavLib.play("lowSignal.wav");
//		ZhawWavLib.write(highSignal, "highSignal.wav");
//		ZhawWavLib.play("highSignal.wav");
//		ZhawWavLib.write(signalQuinte, "Quinte.wav");
//		ZhawWavLib.play("Quinte.wav");
//		ZhawWavLib.write(signalOktave, "Oktave.wav");
//		ZhawWavLib.play("Oktave.wav");
//	}
//
//}
