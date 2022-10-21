package vzb.ch.zhaw.freiphi2.uebung4;

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

		// decrease volume of the audio signal
		double[] lowSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			lowSignal[i] = 0.5 * signal[i];

		}
		ZhawWavLib.write(lowSignal, "Low-signal.wav");
		ZhawWavLib.play("Low-signal.wav");

		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			highSignal[i] = 1.5 * signal[i];
			{
				if (1.5 * signal[i] > 1.0) {
					int s4 = (int) (1.5 * signal[i]);
					double s5 = (double) s4;
					highSignal[i] = s5;
				} else {
					if (1.5 * signal[i] < -1.0) {
						int s7 = (int) (1.5 * signal[i]);
						double s8 = (double) s7;
						highSignal[i] = s8;

					}
				}
			}
		}
		ZhawWavLib.write(highSignal, "signal-high.wav");
		ZhawWavLib.play("signal-high.wav");
		// increase frequency by a "quinte"
		double signalQuinte[] = new double[(int) ((signal.length) / 1.5)];
		for (int i = 0; i < (int) ((signal.length) / 1.5); i++) {
			signalQuinte[i] = signal[(int) (1.5 * i)];

		}

		// ---
		ZhawWavLib.write(signalQuinte, "signal-quint.wav");
		ZhawWavLib.play("signal-quint.wav");
		// increase frequency by a "oktave"
		double signalOktave[] = new double[(signal.length) / 2];
		for (int i = 0; i < (signal.length) / 2; i++) {
			signalOktave[i] = signal[2 * i];

		}

		ZhawWavLib.write(signalOktave, "signal-okt.wav");
		ZhawWavLib.play("signal-okt.wav");

	}
}
