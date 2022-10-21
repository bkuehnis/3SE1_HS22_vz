package vzb.ch.zhaw.wueesnin.uebung4;

import ch.zhaw.lib.ZhawWavLib;

public class Audio {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		// Variable Volume da der Ton ansonsten bei +50% übersteuert
		double volume = 0.5;

		// mirror the audio signal
		double[] mirroredSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			int index = signal.length - 1 - i;
			mirroredSignal[index] = signal[i] * volume;
		}

		// decrease volume of the audio signal -50%
		double[] lowSignal = new double[signal.length];
		for (int i = 0; i < lowSignal.length; i++) {
			lowSignal[i] = signal[i] / 2 * volume;
		}

		// increase volume of the audio signal +50%
		double[] highSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			highSignal[i] = signal[i] * 2 * volume;
		}

		// increase frequency by a quinte
		double[] signalQuinte = new double[signal.length * (3 / 2)];
		for (int i = 0; i < signal.length; i++) {
			// Ton ist nicht so wie es sein sollte.. :(
			signalQuinte[i] = signal[i * (3 / 2)] * volume;
		}

		// increase frequency by an oktave
		double[] signalOktave = new double[signal.length / 2];
		for (int i = 0; i < signalOktave.length; i++) {
			signalOktave[i] = signal[i * 2] * volume;
		}

		// write and play modified wav file
		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		ZhawWavLib.write(lowSignal, "Guitar-lowSignal.wav");
		ZhawWavLib.play("Guitar-lowSignal.wav");

		ZhawWavLib.write(highSignal, "Guitar-highSignal.wav");
		ZhawWavLib.play("Guitar-highSignal.wav");

		ZhawWavLib.write(signalQuinte, "Guitar-signalQuinte.wav");
		ZhawWavLib.play("Guitar-signalQuinte.wav");

		ZhawWavLib.write(signalOktave, "Guitar-signalOktave.wav");
		ZhawWavLib.play("Guitar-signalOktave.wav");
	}
}