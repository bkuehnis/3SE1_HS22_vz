package vza.ch.zhaw.seemaala.uebung4;

import ch.zhaw.lib.ZhawWavLib;

public class Audio {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");
		
		// mirror the audio signal
		double[] mirroredSignal = new double[signal.length];
		for (int i=0; i<signal.length; i++) { 
			int index = signal.length-1-i; 
			mirroredSignal[index] = signal[i];
		}
			// write and play modified wav file
			ZhawWavLib.write(mirroredSignal,"Guitar-mirrored.wav");
			ZhawWavLib.play("Guitar-mirrored.wav");	
		
		
		// decrease volume of the audio signal 
		double[] lowSignal = new double[signal.length];
		// TODO calculate lowSignal
		
		for(int j = 0; j<signal.length; j++) {
			lowSignal[j] /= 2;
			lowSignal = signal;
		}
		
		// write and play modified wav file
				ZhawWavLib.write(lowSignal,"Guitar-leiser.wav");
				ZhawWavLib.play("Guitar-leiser.wav");
		
		

		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// TODO calculate highSignal
		for ( int i = 0; i<signal.length; i++) {
			highSignal[i] *= 1.5;
			highSignal = signal;
		}
		
		// write and play modified wav file
		ZhawWavLib.write(highSignal,"Guitar-lauter.wav");
		ZhawWavLib.play("Guitar-lauter.wav");
		
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length/2];
		// TODO calculate signalQuinte
		for(int i = 0; i<signalQuinte.length; i++) {
		signalQuinte[i] = signal[i/2*3];
		
	}
		// write and play modified wav file
				ZhawWavLib.write(signalQuinte,"Guitar-Quinte.wav");
				ZhawWavLib.play("Guitar-Quinte.wav");

		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length/2];
		// TODO calculate signalOktave
		for (int i = 0; i<signalOktave.length; i++) {
			signalOktave[i] = signal[i*2];
			
		}
		// write and play modified wav file
		ZhawWavLib.write(signalOktave,"Guitar-Oktave.wav");
		ZhawWavLib.play("Guitar-Oktave.wav");
		
		

	}

}
