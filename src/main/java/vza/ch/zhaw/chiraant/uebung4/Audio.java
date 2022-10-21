package vza.ch.zhaw.chiraant.uebung4;

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
//decrease volume of the audio signal
		double[] lowSignal = new double[signal.length];
		// TODO calculate lowSignal
		for (int i = 0; i < signal.length; i++) {
			double lowZW = signal[i] * 0.2;
			if (lowZW < -1.0) {
				lowZW = -1.0;
			}
			lowSignal[i] = lowZW;
		}

//increase volume of the audio signal
		double[] highSignal = new double[signal.length];

		for (int i = 0; i < signal.length; i++) {
			double highZW = 0;
			highZW = signal[i] * 1.5;
			if (highZW > 1.0) {
				highZW = 1.0;
			}
			highSignal[i] = highZW;
		}

		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length / 2];
		int oktave = 0;
		double oktaveZW = 0;
		for (int q = 0; q < signal.length; q++) {
			if (q % 2 != 0) {
				oktaveZW = signal[q];
				oktave++;
			}
			if (oktaveZW != 0) {
				signalOktave[oktave] = oktaveZW;
			}
		}

		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length / 3 * 2];
		int quinte = 0;
		int zweite = 0;
		double quinteZW = 0;
		for (int o = 0; o < signal.length; o++) {

			if (o % 3 == 0) {
				zweite++;
				if (zweite % 2 != 0) {
					quinteZW = signal[o];
					quinte++;
				}
				if (quinteZW != 0) {
					signalQuinte[quinte] = quinteZW;
				}
			}
		}

		ZhawWavLib.write(lowSignal, "Guitar-low.wav");
		ZhawWavLib.play("Guitar-low.wav");

		ZhawWavLib.write(highSignal, "Guitar-high.wav");
		ZhawWavLib.play("Guitar-high.wav");

		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");
		
		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");
		
		
// write and play modified wav file
		// ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		// ZhawWavLib.play("Guitar-mirrored.wav");
	}
}
