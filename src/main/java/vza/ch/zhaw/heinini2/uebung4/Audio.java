package vza.ch.zhaw.heinini2.uebung4;

import ch.zhaw.lib.ZhawWavLib;
import java.util.Iterator;

public class Audio {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");
/*
		// mirror the audio signal
		double[] mirroredSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			int index = signal.length - 1 - i;
			mirroredSignal[index] = signal[i];
		}

		// write and play modified wav file
		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");
*/

		// decrease volume of the audio signal 
		double[] lowSignal = new double[signal.length];
		// calculate lowSignal
		
		for (int i = 0; i < signal.length; i++) {
			lowSignal[i] = signal[i]*0.5;
		}
		
		ZhawWavLib.write(lowSignal, "Guitar-low.wav");
		ZhawWavLib.play("Guitar-low.wav");
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// calculate highSignal
		for (int i = 0; i < signal.length; i++) {
			if ((signal[i]*1.5)>1) {
				highSignal[i] = 1;
			}
			else if ((signal[i]*1.5)<(-1)){
				highSignal[i] = -1;
			}
			else {
				highSignal[i] = signal[i]*1.5;
			}
			
		}
		ZhawWavLib.write(highSignal, "Guitar-high.wav");
		ZhawWavLib.play("Guitar-high.wav");

		// increase frequency by a "quinte"
		
		
		
		
		double[] signalQuinte = new double[183697];
		
		// calculate signalQuinte
		int k =0;
		
		for (int i = 0; i < signalQuinte.length; i++) {
			if(k%4==0) {
				k++;
			}
			signalQuinte[i]=signal[k];
			k++;
		}
		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");
		
		// increase frequency by an "oktave"
		double[] signalOktave = new double[(signal.length/2)];
		// TODO calculate signalOktave
		int j=0;
		
		for (int i = 0; i < signalOktave.length; i++) {
			signalOktave[i]=signal[j];
			j =j+2;
		}
		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");
	}
	
}
