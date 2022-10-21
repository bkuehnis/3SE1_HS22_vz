package vza.ch.zhaw.zejnutri.uebung4;

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


		//decrease volume of the audio signal
		double[] lowSignal = new double[signal.length];
		//TODO calculate lowSignal
		for (int  h = 0; h < signal.length; h++) {
			double lowZW = signal[h]*0.2;
			if (lowZW < -1.0) {
				lowZW = -1.0;
			}
			lowSignal[h] = lowZW;
		}

		ZhawWavLib.write(lowSignal, "Guitar-decrease.wav");
		ZhawWavLib.play("Guitar-decrease.wav");

		//increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		//TODO calculate highSignal
		for (int i = 0; i < signal.length; i++) {
			double highZW = signal[i]*1.5;
			if (highZW > 1.0) {
				highZW = 1.0;
			}
			highSignal[i] = highZW;
		}

		ZhawWavLib.write(highSignal, "Guitar-increase.wav");
		ZhawWavLib.play("Guitar-increase.wav");

		//increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length/2];
		//TODO calculate signalQuinte
		for (int i = 0; i < signalQuinte.length; i++) {
			signalQuinte[i] = signal[i/2*3];
		}

		//write and play modified wav file (Quinte)
		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");

		//increase by oktave
		double[] signalOktave = new double[signal.length/2];
		//TODO calculate signalQuinte
		for (int i = 0; i < signalOktave.length; i++) {
			signalOktave[i] = signal[i*2];
		}
		//write and play modified wav file (Oktave)
		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");

	}

}
