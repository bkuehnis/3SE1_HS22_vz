package vzb.ch.zhaw.drarre01.uebung4;

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
		
		double[] lowSignal = new double[signal.length];
		for (int i = 0; i<signal.length; i++) {
			lowSignal[i] = signal[i]*0.5;
		}
		
		double[] highSignal = new double[signal.length];
		for (int i = 0; i<signal.length; i++) {
			highSignal[i] = signal[i]*1.5;
		}

		double[] signalOktave = new double[signal.length/2-1];
		int n = 0;
		for (int i = 0; i<signal.length/2-1;i=i+2) {
			signalOktave[n]= signal[i];
			n++;
			}
			
		//Keine Tonausgabe
		double [] signalQuinte = new double[signal.length*2/3];
		int z = 0;
		for(int i = 0; i%3!=0&i<signalQuinte.length-1;i++) {
			signalQuinte[z]= signal[i];
			z++;
			}
		
		
		
		// write and play modified wav file
		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");
		ZhawWavLib.write(lowSignal, "Guitar-low.wav");
		ZhawWavLib.play("Guitar-low.wav");
		ZhawWavLib.write(highSignal,"Guitar-high.wav");
		ZhawWavLib.play("Guitar-high.wav");
		ZhawWavLib.write(signalOktave,"Guitar-Oktave.wav");
		ZhawWavLib.play("Guitar-Oktave.wav");
		ZhawWavLib.write(signalQuinte, "Guitar-Quinte.wav");
		ZhawWavLib.play("Guitar-Quinte.wav"); 

	}
	
}
