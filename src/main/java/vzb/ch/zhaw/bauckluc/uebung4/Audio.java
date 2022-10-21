package vzb.ch.zhaw.bauckluc.uebung4;

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
		for (int l=0; l<signal.length;l++) {
			lowSignal[l]=signal[l]*0.5;
			if (lowSignal[l]<-1) {
				lowSignal[l]=-1;
			}
		}
		ZhawWavLib.write(lowSignal, "Guitar-lowSignal.wav");
		ZhawWavLib.play("Guitar-lowSignal.wav");
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// TODO calculate highSignal
		for (int k=0; k<signal.length;k++) {
			highSignal[k]=signal[k]*1.5;
			if (highSignal[k]>1) {
				highSignal[k]=1;
			}
		}
		
		ZhawWavLib.write(highSignal, "Guitar-highSignal.wav");
		ZhawWavLib.play("Guitar-highSignal.wav");
		
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[(signal.length/2*3)];
		// TODO calculate signalQuinte
		
		// Ich vestehe nicht, wie ich 1.5 mal so viele Daten kriege. 
		// Eine Quinte ist gem. Auftrag 3/2 von dem jetzigen Ton, somit muss mein Array auch 3/2 mal so lang sein.
		
		
		ZhawWavLib.write(signalQuinte, "Guitar-signalQuinte.wav");
		ZhawWavLib.play("Guitar-signalQuinte.wav");
		
		// increase frequency by an "oktave"
		double[] signalOktave = new double[(signal.length/2)];
		// TODO calculate signalOktave
		for (int o=0; o<signalOktave.length; o++) {
			signalOktave[o] = signal[o*2];
		}
		ZhawWavLib.write(signalOktave, "Guitar-signalOktave.wav");
		ZhawWavLib.play("Guitar-signalOktave.wav");
	}
}
