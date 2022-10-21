package vzb.ch.zhaw.lowjan01.uebung4;

import ch.zhaw.lib.ZhawWavLib;
public class Audio {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		// mirror the audio signal
		double[] mirroredSignal = new double[signal.length];
		double[] mirroredSignal2 = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			int index = signal.length - 1 - i;
			mirroredSignal[index] = signal[i];
		}

		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		// decrease volume of the audio signal
		double[] lowSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			double s = signal[i];
			double s2 = s * 0.5;
			lowSignal[i] = s2;
		}
		ZhawWavLib.write(lowSignal, "Low-signal.wav");
		ZhawWavLib.play("Low-signal.wav");

		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			double s = signal[i];
			double s3 = s * 1.5;
			{
				if (s3 > 1.0) {
					int s4 = (int) s3;
					double s5 = (double) s4;
					highSignal[i] = s5;
				} else {
					if (s3 < -1.0) {
						int s7 = (int) s3;
						double s8 = (double) s7;
						highSignal[i] = s8;

					}
					highSignal[i] = s3;
				}
			}
		}

		ZhawWavLib.write(highSignal, "High-signal.wav");
		ZhawWavLib.play("High-signal.wav");

		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length >> 2];
		for (int i = 2; i < signal.length; i += 3) {
			signalQuinte[(i - 2) >> 2] = signal[i];
		}
		double[] signalQuinte_1 = new double[signalQuinte.length / 2];
		int ab = signalQuinte.length / 2;
		for (int i = 0; i < ab; i++) {
			signalQuinte_1[i] = signalQuinte[i];
		}
		System.out.println(signal.length);
		System.out.println(signalQuinte_1.length);

		ZhawWavLib.write(signalQuinte, "Quinte-signal.wav");
		ZhawWavLib.play("Quinte-signal.wav");

		///// Leider ist mir nicht ganz klar, wie ich die Quinte erstelle

		// increase frequency by an "oktave"
		double[] OktaveSignal = new double[signal.length >> 1];
		for (int i = 1; i < signal.length; i += 2) {
			OktaveSignal[(i - 1) >> 1] = signal[i];
		}

		ZhawWavLib.write(OktaveSignal, "Oktave-signal.wav");
		ZhawWavLib.play("Oktave-signal.wav");

	}

}
