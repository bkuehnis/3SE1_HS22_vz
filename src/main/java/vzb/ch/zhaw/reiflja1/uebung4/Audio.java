package vzb.ch.zhaw.reiflja1.uebung4;

import ch.zhaw.lib.ZhawCsvLib;
import ch.zhaw.lib.ZhawWavLib;
public class Audio {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		// -- MIRROR --
		// mirror the audio signal
		double[] mirroredSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			int index = signal.length - 1 - i;
			mirroredSignal[index] = signal[i];
		}
		// write and play modified wav file
		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		// -- LOW --
		// decrease volume of the audio signal
		double[] lowSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			lowSignal[i] = signal[i] * 0.5;
		}
		// write and play modified wav file
		ZhawWavLib.write(lowSignal, "Guitar-low.wav");
		ZhawWavLib.play("Guitar-low.wav");

		// -- HIGH --
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			if (highSignal[i] * 1.5 == 1) {
				highSignal[i] = 1;
			} else {
				highSignal[i] = signal[i] * 0.5;
			}
		}
		// write and play modified wav file
		ZhawWavLib.write(highSignal, "Guitar-high.wav");
		ZhawWavLib.play("Guitar-high.wav");

		// -- QUINTE Versuch 1 --
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length * 3 / 2];
		System.out.println(signal.length);
		System.out.println(signalQuinte.length);
		for (int i = 0; i < signal.length; i++) {
			signalQuinte[i * 3 / 2] = signal[i];
		}
		for (int i = 0; i < signalQuinte.length; i++) {
			if (signalQuinte[i] == 0) {
				signalQuinte[i] = signalQuinte[i - 1];
			}
		}
		ZhawCsvLib.writeDoubleArray("signalQuinte.csv", signalQuinte);

		// -- QUINTE Versuch 2 --
		// increase frequency by a "quinte"
		double[] signalQuinte1 = new double[signal.length / 3 * 2];
		for (int i = 0; i < signal.length - 1; i++) {
			signalQuinte1[i / 3 * 2 + 1] = signal[i];
		}
		// write and play modified wav file
		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");

		// -- OKTAVE --
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length / 2];
		for (int i = 0; i < signal.length; i++) {
			signalOktave[i / 2] = signal[i];
		}
		// write and play modified wav file
		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");

	}
}
