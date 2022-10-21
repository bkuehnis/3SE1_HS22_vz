package vzb.ch.zhaw.martilu5.uebung4;

import ch.zhaw.lib.ZhawWavLib;
public class Audio {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		// mirror the audio signal
		//double[] mirroredSignal = new double[signal.length];
		//for (int i = 0; i < signal.length; i++) {
			//int index = signal.length - 1 - i;
			//mirroredSignal[index] = signal[i];
		//}

		// write and play modified wav file
		//ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		//ZhawWavLib.play("Guitar-mirrored.wav");

		// decrease volume of the audio signal
		double[] lowSignal = new double[signal.length];
		// TODO calculate lowSignal
		for (int i = 0; i < signal.length; i++) {
			lowSignal [i] = signal[i]*0.5;
		}
		//System.out.println(signal[10]);
		//System.out.println(lowSignal[10]);
		
		// write and play modified wav file
		ZhawWavLib.write(lowSignal, "Guitar-low.wav");
		ZhawWavLib.play("Guitar-low.wav");
			
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// TODO calculate highSignal
		for (int i = 0; i < signal.length; i++) {
			double a = signal[i]*1.5;
			if (a >= 1) {
				highSignal [i] = 1;	
			}
			else if (a < 1 ){
				highSignal [i] = a;
			}
		}
		//System.out.println(signal[10]);
		//System.out.println(lowSignal[10]);
		
		// write and play modified wav file
		ZhawWavLib.write(highSignal, "Guitar-high.wav");
		ZhawWavLib.play("Guitar-high.wav");
		
		//Oktave
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length / 2];
		for (int i = 0; i < signal.length; i++) {
			signalOktave[i / 2] = signal[i];
		}
		// write and play modified wav file
		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");
		
		//Quinte
		// increase frequency by an "quinte"
		double[] signalQuinte = new double[signal.length*3/2];
		for (int i = 0; i < signal.length; i++) {
					signalQuinte[i*3/2] = signal[i];
		}
		int x = 2;
		while(x < signalQuinte.length) {
			signalQuinte[x] = signalQuinte[x-1];
			x = x + 3;
		}
		// write and play modified wav file
		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");
		
			
	}
}	