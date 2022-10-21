package vza.ch.zhaw.ahmaddav.uebung4;

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

		
        double[] lowSignal = new double[signal.length];
        double[] highSignal = new double[signal.length];
        for(int i = 0; i < signal.length; i++){
            // Sänke Lautstärke um 0.5
            double amplitudeLow = signal[i] * 0.5;
            if (amplitudeLow < -1) amplitudeLow = -1;
            lowSignal[i] = amplitudeLow;

            // Erhöhe Lautstärke um 0.5
            double amplitudeHigh = signal[i] * 1.5;
            if (amplitudeHigh > 1.0) amplitudeHigh = 1.0;
            highSignal[i] = amplitudeHigh;
        }
		ZhawWavLib.write(lowSignal,  "lowSignal");
		ZhawWavLib.write(highSignal, "highSignal");
		ZhawWavLib.play("lowSignal");
		ZhawWavLib.play("highSignal");
		
		
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length];
		for (int i=0; i<signal.length; i++) {
			signalQuinte[i] = signal[i]/3;
		}
	
		// TODO calculate signalQuinte
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length];
		for (int i=0; i<signal.length; i++) {
			signalOktave[i] = signal[i]*0.5;
		}
		ZhawWavLib.write(signalQuinte, "Quinte");
		ZhawWavLib.write(signalOktave, "Oktave");
		ZhawWavLib.play("Quinte");
		ZhawWavLib.play("Oktave");

		
		
		
		
		}

	}
	

