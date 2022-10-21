package vzb.ch.zhaw.giagilea.uebung4;

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
		for (int i=0; i<signal.length; i++) {
			lowSignal[i] = signal[i]*0.5;
		}
		ZhawWavLib.write(lowSignal, "Guitar-low.wav");
		ZhawWavLib.play("Guitar.low.wav");
		
		
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		for (int i=0; i<signal.length; i++) {
			highSignal[i] = signal[i]*1.5;
			if (highSignal[i] > 1) {
				highSignal[i] = 1;
			} else if (highSignal[i] < -1) {
				highSignal[i] = -1;
			}
		}
		
		ZhawWavLib.write(highSignal, "Guitar-high.wav");
		ZhawWavLib.play("Guitar-high.wav");
		
		double [] signalDoppelt = new double[signal.length*2];
		for (int i=0; i<signalDoppelt.length; i++) {
			if (i%2 == 0) {
				signalDoppelt[i] = signal[i/2];
			} else if (i%2 != 0) {
				if ((i/2)+1 < signal.length) {
					signalDoppelt[i] = signal[(i/2)+1]/2;
				}
			}
		}
		
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signalDoppelt.length];
		for (int i=0; i<signalDoppelt.length/3; i++) {
			signalQuinte[i] = signalDoppelt[i*3];
			if (signalQuinte[i] > 1) {
			signalQuinte[i] = 1;
			} else if (signalQuinte[i] < -1) {
			signalQuinte[i] = -1;
			}
		}
		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");
		
		
		
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length];
		for (int i=0; i<signal.length/2; i++) {
			signalOktave[i] =  signal[i*2];
			if (signalOktave[i] > 1) {
				signalOktave[i] = 1;
			} else if (signalOktave[i] < -1) {
				signalOktave[i] = -1;
			}
		}
		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-Oktave.wav");
		
	}
}
