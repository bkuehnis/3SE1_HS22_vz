package vzb.ch.zhaw.schulfa2.uebung4;

import ch.zhaw.lib.ZhawWavLib;

public class Audio {

	public static void main(String[] args) {
// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		int n = signal.length;

// mirror the audio signal
		double[] mirroredSignal = new double[signal.length];

		// decrease volume of the audio signal
		double[] lowSignal = new double[signal.length];

		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];

		// increase frequency by a "quinte"
		int quinte = (int) (n * 0.66);
		double[] signalQuinte = new double[quinte];

		// increase frequency by an "oktave"
		int oktave = (int) (n * 0.5);
		double[] signalOktave = new double[oktave];

		// all-in-one mirror/low/high
		for (int i = 0; i < signal.length; i++) {
			int index = signal.length - 1 - i;
			mirroredSignal[index] = signal[i];

			lowSignal[index] = signal[index] / 2;

			highSignal[index] = signal[index] * 2;

			if (highSignal[index] > 1) {
				highSignal[index] = 1;
			} else if (highSignal[index] < -1) {
				highSignal[index] = -1;
			}
		}

		for (int j = 0; j < quinte; j++) {
			signalQuinte[j] = signal[j * 3 / 2];
		}

		for (int j = 0; j < oktave; j++) {
			signalOktave[j] = signal[j * 2];
		}

// write and play modified wav file
		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		ZhawWavLib.write(lowSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		ZhawWavLib.write(highSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		ZhawWavLib.write(signalQuinte, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		ZhawWavLib.write(signalOktave, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");
	}
}
