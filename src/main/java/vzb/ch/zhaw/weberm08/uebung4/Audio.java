package vzb.ch.zhaw.weberm08.uebung4;

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
		int sampleRate = 44100;
		double[] lowSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			if (signal[i] * sampleRate / 2 < 1.0 && signal[i] * sampleRate / 2 > -1.0) {
				lowSignal[i] = signal[i] / 2;
			} else if (signal[i] * sampleRate / 2 > 1.0) {
				lowSignal[i] = 1.0 / sampleRate;
			} else {
				lowSignal[i] = -1.0 / sampleRate;
			}
			
		}
		ZhawWavLib.write(lowSignal, "Guitar-lowSignal.wav");
		ZhawWavLib.play("Guitar-lowSignal.wav");
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			if (signal[i] * sampleRate * 1.5 < 1.0 && signal[i] * sampleRate * 1.5 > -1.0) {
				highSignal[i] = signal[i] * 1.5;
			} else if (signal[i] * sampleRate * 1.5 > 1.0) {
				highSignal[i] = 1.0 / 44100;
			} else {
				highSignal[i] = -1.0 / 44100;
			}
			
		}
		
		ZhawWavLib.write(highSignal, "Guitar-highSignal.wav");
		ZhawWavLib.play("Guitar-highSignal.wav");
		
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length * 3 / 2];
		int quinteCounter = 0;
		for (int i = 0; i < signal.length; i++) {
				signalQuinte[quinteCounter] = signal[i];
				quinteCounter++;
			if (i % 2 == 0) {
				quinteCounter++;
				signalQuinte[quinteCounter] = signal[i];
			}
		}
		
		ZhawWavLib.write(signalQuinte, "Guitar-signalQuinte.wav");
		ZhawWavLib.play("Guitar-signalQuinte.wav");

		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length / 2];
		for (int i = 0; i < signal.length; i++) {
			if (i % 2 == 0) {
				signalOktave[i/2] = signal[i];
			}
		}
		ZhawWavLib.write(signalOktave, "Guitar-signalOktave.wav");
		ZhawWavLib.play("Guitar-signalOktave.wav");
	}
}
