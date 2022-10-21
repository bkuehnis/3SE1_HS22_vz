package vza.ch.zhaw.gavindom.uebung4;

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
		double[] lowSignal = new double[signal.length];			//Array neues Signal
		// TODO calculate lowSignal
		for (int i = 0; i < signal.length; i++) {				//Bearbeitung
			lowSignal[i] = signal[i]*0.5;
		}
		ZhawWavLib.write(lowSignal,"Guitar-mirrored.wav");		//speichern
		//ZhawWavLib.play("Guitar-mirrored.wav");					//abspielen
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];		//Array neues Signal
		// TODO calculate highSignal
	    for (int i = 0; i < signal.length; i++) {				//Bearbeitung
			 highSignal[i] = signal[i]*1.5;
			if(highSignal[i] > 1) {
				highSignal[i] = 1;
			}
			if(highSignal[i] < -1) {
				highSignal[i] = -1;
			}
		}
		ZhawWavLib.write(highSignal,"Guitar-mirrored.wav");		
		//ZhawWavLib.play("Guitar-mirrored.wav");					
		
		// increase frequency by a "quinte"
		int grosse = 163285; // 2/3 vom Guitar.wav 244930 gerundet
		int differenz = 0;
		double[] signalQuinte = new double[grosse-1];
		// TODO calculate signalQuinte
		for (int i=0; i < signalQuinte.length; i=i+2) { 
		signalQuinte[i] = signal[i+differenz];
		signalQuinte[i+1] = signal[i+1+differenz];
		differenz = differenz + 1;
			}
	    ZhawWavLib.write(signalQuinte,"Guitar-mirrored.wav");		
	    ZhawWavLib.play("Guitar-mirrored.wav");					
		
/*  Mehrere Zeilen ausblenden */
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length/2];
		// TODO calculate signalOktave
		for (int i=0; i < signalOktave.length; i++) { 
		signalOktave[i] = signal[2*i];
		}
		ZhawWavLib.write(signalOktave,"Guitar-mirrored.wav");		
		ZhawWavLib.play("Guitar-mirrored.wav");					
		
		System.out.println(signal.length);
		
		}
}
	

	

