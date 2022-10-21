package vza.ch.zhaw.drmicfil.uebung4;

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
		double[] highSignal = new double[signal.length];
														
		for (int i = 0; i<signal.length;i++) {
			
			// um 0.5 senken
				
			double amplitudeLow = signal[i]*0.5;     // leises signal berechnen lisliger mache mit multiplikator *0.5
					if (amplitudeLow <-1)     //einschränken mit -1
						amplitudeLow = -1;
			lowSignal[i] = amplitudeLow;
			
			// hohes signal berechnen um 50% erhöhen
			
			double amplitudeHigh = signal[i]*1.5;
			if (amplitudeHigh>1.0)					//einschränken mit 1
				amplitudeHigh = 1.0;
			highSignal[i]=amplitudeHigh;
			
		}
		ZhawWavLib.write(lowSignal, "lowSignal");
		ZhawWavLib.play("lowSignal");
		
		ZhawWavLib.write(highSignal, "highSignal");
		ZhawWavLib.play("highSignal");
		
		
		// um eine quinte/oktave erhöhen
		
		double[] signalOktave = new double[(signal.length / 2 )];
		
		//double[] signalQuinte = new double[signal.length ];
		
		for (int i = 0; i<signalOktave.length;i++) {
			
			signalOktave[i] = signal[i*2];
		}
		
		ZhawWavLib.write(signalOktave, "signalOktave");
		ZhawWavLib.play("signalOktave");
			
			//double jede3quinte = signal[i];
		double[] signalQuinte = new double[(signal.length / 3)];
		
		for (int i = 0; i<signalQuinte.length;i ++) {
			
			signalQuinte[i] = signal[i*3];
		}	
			
			

		ZhawWavLib.write(signalQuinte, "signalQuinte");
		ZhawWavLib.play("signalQuinte");
	}
	
}
