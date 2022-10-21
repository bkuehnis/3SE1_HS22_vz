package vza.ch.zhaw.friesti1.uebung4;

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
		double[] lowSignal = signal;
		// TODO calculate lowSignal
		for(int i = 0; i < lowSignal.length; i++) {
			lowSignal[i] /= 2;
		}
		ZhawWavLib.write(lowSignal, "Guitar-low.wav");
		ZhawWavLib.play("Guitar-low.wav");
		
		// increase volume of the audio signal
		double[] highSignal = signal;
		// TODO calculate highSignal
		for(int i = 0; i < highSignal.length; i++) {
			highSignal[i] *= 1.5;
		}
		ZhawWavLib.write(highSignal, "Guitar-high.wav");
		ZhawWavLib.play("Guitar-high.wav");
		
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length/2];
		// TODO calculate signalQuinte
		for(int i = 0; i < signalQuinte.length; i++) {
			signalQuinte[i] = signal[i/2*3];
		}
		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");
		
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length/2];
		// TODO calculate signalQuinte
		for(int i = 0; i < signalOktave.length; i++) {
			signalOktave[i] = signal[i*2];
		}
		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");
		// TODO calculate signalOktave

	}
	
}
