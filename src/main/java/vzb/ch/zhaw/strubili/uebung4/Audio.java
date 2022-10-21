package vzb.ch.zhaw.strubili.uebung4;

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

		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		// decrease volume of the audio signal
		double amplitude = 0;
		double[] lowSignal = new double[signal.length];
		for (int g = 0; g < signal.length; g++) {

			amplitude = (signal[g]) * 0.5;

			if (amplitude > 1.0) {
				lowSignal[g] = 1.0;
			}

			else {
				lowSignal[g] = -1.0;
			}
		}
		
		ZhawWavLib.write(lowSignal, "Guitar-lowSignal.wav");
		ZhawWavLib.play("Guitar-lowSignal.wav");

		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		for (int f = 0; f < signal.length; f++) {
			
			amplitude = (signal[f]) * 1.5;

			if (amplitude > 1.0) {
				lowSignal[f] = 1.0;
			}

			else {
				lowSignal[f] = -1.0;
			}
		}
		ZhawWavLib.write(highSignal, "Guitar-highSignal.wav");
		ZhawWavLib.play("Guitar-highSignal.wav");
		
		//Ich verstehe nicht, was ich bei highSignal und lowSignal falsch gemacht habe.

		// increase frequency by a "quinte"
		double[] signalQuinte = new double[(signal.length / 2) * 3];

		for (int g = 0; g < signal.length; g++) {
			signalQuinte[(g / 2) * 3] = signal[g];
			if (g % 2 == 0) {
				signalQuinte[(g / 2) * 3] = signal[g];
			}
		}
		ZhawWavLib.write(signalQuinte, "Guitar-signalQuinte.wav");
		ZhawWavLib.play("Guitar-signalQuinte.wav");

		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length / 2];

		for (int g = 0; g < signal.length; g++) {
			if (g % 2 == 0) {
				signalOktave[g / 2] = signal[g];
			}
		}
		ZhawWavLib.write(signalOktave, "Guitar-signalOktave.wav");
		ZhawWavLib.play("Guitar-signalOktave.wav");

	}

}
