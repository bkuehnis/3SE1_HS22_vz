package vza.ch.zhaw.bauerfel.uebung4;

import ch.zhaw.lib.ZhawWavLib;

public class Audio {

	public static void main(String[] args) {
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		double[] mirroredSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			int index = signal.length - 1 - i;
			mirroredSignal[index] = signal[i];
		}
		// decrease volume of the audio signal
		double[] lowSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			lowSignal[i] = signal[i] * 0.5;
		}
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			double signalbegrenzung;
			signalbegrenzung = signal[i] * 1.5;

			if (signalbegrenzung > 1.0) {
				signalbegrenzung = 1;
			}
			highSignal[i] = signalbegrenzung;
		}
		// increase frequency by a "quinte"
		int quinteLength = signal.length * 2 / 3;
		double[] signalQuinte = new double[quinteLength + 1];
		int i = 0;
		for (int j = 0; j < signal.length; j++) {
			if ((j + 1) % 2 != 0) {
				signalQuinte[i] = signal[j];
				j++;
			}
		}

		// increase frequency by an "oktave"
		int oktaveLength = signal.length / 2;
		double[] signalOktave = new double[oktaveLength];
		for (int j = 0; j < signal.length / 2; j++) {
			signalOktave[j] = signal[j * 2];
		}

		ZhawWavLib.write(lowSignal, "Guitar-mirroed.wav");
		ZhawWavLib.play("Guitar-mirroed.wav");

		ZhawWavLib.write(highSignal, "Guitar-mirroed.wav");
		ZhawWavLib.play("Guitar-mirroed.wav");

		ZhawWavLib.write(signalQuinte, "Guitar-mirroed.wav");
		ZhawWavLib.play("Guitar-mirroed.wav");

		ZhawWavLib.write(signalOktave, "Guitar-mirroed.wav");
		ZhawWavLib.play("Guitar-mirroed.wav");
	}

}
