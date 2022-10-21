package vza.ch.zhaw.weberth6.uebung4;

import ch.zhaw.lib.ZhawWavLib;
import java.util.Arrays;

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
		
		for (int k =0; k<signal.length-1; k++) {
			lowSignal[k] = signal[k] * 0.5;
		}
		
		ZhawWavLib.write(lowSignal, "Guitar-lowsignal.wav");
		ZhawWavLib.play("Guitar-lowsignal.wav");
		
		
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		
		
		for (int k =0; k<signal.length-1; k++) {
			highSignal[k] = signal[k] * 1.5;
			if (highSignal[k]>1) {
				highSignal[k] = 1;
			} else if (highSignal[k]<-1) {
				highSignal[k] = -1;
			}
		}
		ZhawWavLib.write(highSignal, "Guitar-highsignal.wav");
		ZhawWavLib.play("Guitar-highsignal.wav");
		
		
		// increase frequency by a "quinte"
		//Quinte ist 3/2??
		double[] signalQuinte = new double[signal.length * (3/2)];
		//WHAT
		for (int m=0; m<signalQuinte.length; m++) {
			signalQuinte[m] = signal[m*3/2];
			
		}
		
		ZhawWavLib.write(signalQuinte, "Guitar-signalquinte.wav");
		ZhawWavLib.play("Guitar-signalquinte.wav");
		
		
		// increase frequency by an "oktave"
		// Oktave ist 1/2. 
		double[] signalOktave = new double[signal.length * (1/2)];
		//Eine Oktave höher jedes zweite Signal entfernen
		for (int m=0; m<signalOktave.length; m++) {
			signalOktave[m] = signal[m*2];
			
		}
		
		ZhawWavLib.write(signalOktave, "Guitar-signaloktave.wav");
		ZhawWavLib.play("Guitar-signaloktave.wav");
	}
}
