package vza.ch.zhaw.tharmth2.uebung4;

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
		for(int j = 0; j<signal.length;j++) {
			lowSignal[j] /= 7;
			lowSignal = signal;

		}
		
		ZhawWavLib.write(lowSignal, "Guitar-leiser.wav");
		ZhawWavLib.play("Guitar-leiser.wav");




		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// TODO calculate highSignal
		for(int h = 0; h<signal.length;h++) {
			highSignal[h] *= 1.7;
			highSignal = signal;
			
	}

		ZhawWavLib.write(highSignal, "Guitar-lauter.wav");
		ZhawWavLib.play("Guitar-lauter.wav");
		
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length/2];
		// TODO calculate signalQuinte
		
		for(int q = 0; q<signalQuinte.length;q++) {
			signalQuinte[q] = signal[q/2*3];
			
			}
				
			
			
			ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
			ZhawWavLib.play("Guitar-quinte.wav");
		
		
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length/2];
		// TODO calculate signalOktave
		
		for(int o = 0; o<signalOktave.length;o++) {
				signalOktave [o] = signal[o*2];
		}
				
			ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
			ZhawWavLib.play("Guitar-oktave.wav");
		}
		}


