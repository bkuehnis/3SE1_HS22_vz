package vza.ch.zhaw.reichraf.uebung4;

import ch.zhaw.lib.ZhawWavLib;
public class Audio {

	public static void main(String[] args) {

		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");


		// decrease volume of the audio signal 
		double[] lowSignal = new double[signal.length];
		for (int i=0; i<signal.length; i++) {
			lowSignal[i]= signal[i]*0.5;
		}

		// write and play decrease wav file
		ZhawWavLib.write(lowSignal,"Guitar-decrease.wav");
		ZhawWavLib.play("Guitar-decrease.wav");

		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		for (int i=0; i<signal.length; i++) {
			highSignal[i]= signal[i]*2;
			if (highSignal[i]>1) {
				highSignal[i]= 1;}
			if (highSignal[i]<-1) {
				highSignal[i]= -1;}	
		}
		// write and play increase wav file
		ZhawWavLib.write(highSignal,"Guitar-increase.wav");
		ZhawWavLib.play("Guitar-increase.wav");

		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length/2];
		signalOktave[0]=signal[0];
		for (int i=2; i<signal.length; i++) {
			if (i%2==0) {
				signalOktave[i/2]=signal[i];
			}
		}

		// write and play Oktave wav file
		ZhawWavLib.write(signalOktave,"Guitar-Oktave.wav");
		ZhawWavLib.play("Guitar-Oktave.wav");

		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length/3+1];
		signalQuinte[0]=signal[0];
		for (int i=3; i<signal.length; i++) {
			if (i%3==0) {
				signalQuinte[i/3]=signal[i];
			}
		}

		// write and play Oktave wav file
		ZhawWavLib.write(signalQuinte,"Guitar-Quinte.wav");
		ZhawWavLib.play("Guitar-Quinte.wav");


		// mirror the audio signal
		double[] mirroredSignal = new double[signal.length];
		for (int i=0; i<signal.length; i++) {
			int index = signal.length-1-i;
			mirroredSignal[index] = signal[i];
		}


		// write and play modified wav file
		ZhawWavLib.write(mirroredSignal,"Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

	}
}