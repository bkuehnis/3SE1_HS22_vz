package vzb.ch.zhaw.truemjul.uebung4;

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
		//ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		//ZhawWavLib.play("Guitar-mirrored.wav");

		// decrease volume of the audio signal
		double[] lowSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			lowSignal[i] = signal[i] * 0.5;
		}

		// write and play the low audio signal
		//ZhawWavLib.write(lowSignal, "Guitar-low.wav");
		//ZhawWavLib.play("Guitar-low.wav");

		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];

		// get highest Signal
		double max = signal[0];
		double maxHigh = highSignal[0];

		for (int i = 0; i < signal.length; i++) {

			if (signal[i] > max) {
				max = signal[i];
			}
			highSignal[i] = signal[i] * 2;

			// Erhalte höchstes Signal
			if (highSignal[i] > maxHigh) {
				maxHigh = highSignal[i];
			}

			highSignal[i] = highSignal[i] / maxHigh;
		}

		System.out.println(max);
		System.out.println(maxHigh);

		// write and play high Signal
		//ZhawWavLib.write(highSignal, "Guitar-high.wav");
		//ZhawWavLib.play("Guitar-high.wav");

		// increase frequency by an "oktave"
		int index = signal.length * 1 / 2;

		System.out.println(index);
		// new Array Oktave
		double[] signalOktave = new double[index];
		System.out.println(signalOktave.length);

		// write every second index into Array
		int jumper = 0;
		for (int i = 0; i < signal.length; i++) {
			if (i % 2 == 0) {
				signalOktave[jumper] = signal[i];
				jumper++;
			}
		}

		System.out.println(signalOktave.length);
		System.out.println(signal.length);

		// write and play Oktave
		ZhawWavLib.write(signalOktave, "Guitar-Oktave.wav");
		ZhawWavLib.play("Guitar-Oktave.wav");

		// increase frequency by a "quinte"
		int index2 = signal.length * 2 / 3;

		System.out.println(index2);
		// new Array Quinte
		double[] signalQuinte = new double[index2 + 1];

		System.out.println(signalQuinte.length);

		// write every third index into array
		int jumper2 = 0;
		int j = 0;
		for (int i = 0; i < signal.length; i++) {
			if (jumper2 == i && jumper2 + 1 < signal.length) {
				jumper2 += 3;
				i++;
			}
			signalQuinte[j] = signal[i];
			j++;
		}
		
		// write and play Oktave
		ZhawWavLib.write(signalQuinte, "Guitar-Quinte.wav");
		ZhawWavLib.play("Guitar-Quinte.wav");
	}
}
