package vzb.ch.zhaw.straueri.uebung4;

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
		// TODO calculate lowSignal
		for (int e = 0; e < signal.length; e++) {
			
			lowSignal[e] = signal[e]/2;
		}
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// TODO calculate highSignal
		for (int f = 0; f < signal.length; f++) {
			
			highSignal[f] = signal[f]*1.5;
		}

		// write and play modified wav file
		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");
		ZhawWavLib.write(lowSignal, "lowSignal.wav");
		ZhawWavLib.play("lowSignal.wav");
		ZhawWavLib.write(highSignal, "highSignal.wav");
		ZhawWavLib.play("highSignal.wav");
	}
	
}
