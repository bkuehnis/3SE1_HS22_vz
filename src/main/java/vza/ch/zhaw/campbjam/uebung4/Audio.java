package vza.ch.zhaw.campbjam.uebung4;

import ch.zhaw.lib.ZhawWavLib;
public class Audio {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		// mirror the audio signal
		double[] mirroredSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			int index = signal.length - 1 - i;
			mirroredSignal[index] = signal[i];
		}

		// write and play modified wav file
		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		// decrease volume of the audio signal
		double[] lowSignal = new double[signal.length];
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];

		for (int i = 0; i < signal.length; i++) {
			// TODO calculate lowSignal
			double ampLow = signal[i] * 0.5;
			if (ampLow < -1) {
				ampLow = -1;
			}
			lowSignal[i] = ampLow;

			// TODO calculate highSignal
			double ampHigh = signal[i] * 1.5;
			if (ampHigh > 1) {
				ampHigh = 1.0;
			}
			highSignal[i] = ampHigh;
		}

		ZhawWavLib.write(lowSignal, "Guitar-low.wav");
		ZhawWavLib.play("Guitar-low.wav");

		ZhawWavLib.write(highSignal, "Guitar-high.wav");
		ZhawWavLib.play("Guitar-high.wav");

		// increase frequency by a "quinte"
		// increase frequency by an "oktave"

		int quinteLength = signal.length * 2 / 3;
		double[] signalQuinte = new double[quinteLength + 1];
		int ton = 0;

		int oktaveLength = signal.length / 2;
		double[] signalOktave = new double[oktaveLength];

		for (int i = 0; i < signal.length; i++) {
			if ((i + 1) % 3 != 0) {
				signalQuinte[ton] = signal[i];
				ton++;
			}
		}

		for (int i = 0; i < signal.length / 2; i++) {
			signalOktave[i] = signal[i * 2];
		}

		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");

		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");
	}
}
