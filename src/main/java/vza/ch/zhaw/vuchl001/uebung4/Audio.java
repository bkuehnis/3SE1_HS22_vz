package vza.ch.zhaw.vuchl001.uebung4;

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
		// calculate lowSignal
		for (int j = 0; j<lowSignal.length;j++) {
			lowSignal[j] = 0.5*signal[j];
		}	
		ZhawWavLib.write(lowSignal, "Guitar-lowSignal.wav");
		ZhawWavLib.play("Guitar-lowSignal.wav");
		
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// calculate highSignal
		for (int k = 0; k<lowSignal.length;k++) {
			lowSignal[k] = 1.5*signal[k];
			double newSignal = signal[k]*1.5;
			if (newSignal > 1.0) {
				newSignal = 1.0;
				if (newSignal < -1.0) {
					newSignal = -1.0;
				}
			}
			highSignal[k] = newSignal;
		}
		
		ZhawWavLib.write(highSignal, "Guitar-highSignal.wav");
		ZhawWavLib.play("Guitar-highSignal.wav");
		
		// increase frequency by a "quinte"
		// calculate signalQuinte
		int newLength = signal.length*2/3;
		double[] signalQuinte = new double[newLength +1];
		int count = 0;
		for (int l = 0; l <signal.length; l++) {
			if ((l+1) % 3 != 0) {
				signalQuinte[count] = signal[l];
				count++;
			}
		}
		ZhawWavLib.write(signalQuinte, "Guitar-signalQuinte.wav");
		ZhawWavLib.play("Guitar-signalQuinte.wav");
		
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length/2];
		// calculate signalOktave
		for (int m = 0; m<signalOktave.length;m++) {
			signalOktave[m] = signal[m*2];
		}
		ZhawWavLib.write(signalOktave, "Guitar-signalOktave.wav");
		ZhawWavLib.play("Guitar-signalOktave.wav");
			
		
		
		
		
		
	}
}
