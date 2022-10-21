package vza.ch.zhaw.kuralsar.uebung4;

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
		double[] lowSignal = new double[signal.length];
		// TODO calculate lowSignal
		for (int i = 0; i < signal.length; i++) {
			int lindex = (int) (signal.length * 0.5 - i) ;
		lowSignal[lindex] = signal [i];
		}
		
		ZhawWavLib.write(lowSignal, "Guitar-decreased.wav");
		ZhawWavLib.play("Guitar-decreased.wav");
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// TODO calculate highSignal
		for (int i = 0; i < signal.length; i++) {
			int hindex = (int) (signal.length * 0.5 + i) ;
		highSignal[hindex] = signal [i];
		}
	
		
		ZhawWavLib.write(highSignal, "Guitar-increased.wav");
		ZhawWavLib.play("Guitar-increased.wav");
	}
	
}
