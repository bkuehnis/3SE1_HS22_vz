package vzb.ch.zhaw.landsfre.uebung4;

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
		for (int i=0; i < lowSignal.length; i++) {
			lowSignal[i] = signal[i] * 0.5;
		}
		ZhawWavLib.write(lowSignal, "lowSignal.wav");
		ZhawWavLib.play("lowSignal.wav");
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// TODO calculate highSignal
		for (int i=0; i < highSignal.length; i++) {
			highSignal[i] = signal[i] * 1.5;
			if (highSignal[i] > 1) {
				highSignal[i] = 1;
			}
		}
		ZhawWavLib.write(highSignal, "highSignal.wav");
		ZhawWavLib.play("highSignal.wav");
		
		
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length *2 / 3];
		// TODO calculate signalQuinte
		int a = 0;
		for (int i = 0; i < signalQuinte.length; i++) {
			signalQuinte[i] = signal[a];
			a = i * 3 / 2;
			}
		ZhawWavLib.write(signalQuinte, "signalQuinte.wav");
		ZhawWavLib.play("signalQuinte.wav");
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length / 2];
		// TODO calculate signalOktave
		int b = 0;
		for (int i = 0; i < signalOktave.length; i++) {
			signalOktave[i] = signal[b];
			b += 2;
			}
		ZhawWavLib.write(signalOktave, "signalOktave.wav");
		ZhawWavLib.play("signalOktave.wav");
	}
	
}
