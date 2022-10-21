package vza.ch.zhaw.baechni2.uebung4;

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


		//b)
		// decrease volume of the audio signal 
		// TODO calculate lowSignal
		double[] lowSignal = new double[signal.length];
		for (int i=0; i< signal.length; i++) {
			lowSignal[i]=signal[i] * 0.5;
		}

		ZhawWavLib.write(lowSignal,  "lowSignal.wav");
		ZhawWavLib.play("lowSignal.wav");

		// increase volume of the audio signal
		// TODO calculate highSignal
		double[] highSignal = new double[signal.length];
		for (int i=0; i < signal.length; i++) {
			double highWert = 0;
			highWert = signal[i]*1.5;      
			if (highWert > 1.0) {
				highWert = 1.0;
			}
			highSignal[i]=highWert;  
		}

		ZhawWavLib.write(highSignal,  "highSignal.wav");
		ZhawWavLib.play("highSignal.wav");

		//c)
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length/3*2];
		int quinte = 0;
		for (int i = 0; i < signal.length; i++) {
			if (i%3==0) {
				signalQuinte[quinte]=signal[i];
				quinte++;

			}
		}

		ZhawWavLib.write(signalQuinte,  "signalQuinte.wav");
		ZhawWavLib.play("signalQuinte.wav");

		//oktave
		// jeder zweite wert muss ausgelesen und in neuem array abgespeichert werden
		double[] signalOktave = new double[signal.length/2];
		int z=0;
		for (int i=0; i < signal.length; i++) {
			if (i%2==0) {
				signalOktave[z]=signal[i];
				z++;

			}


		}

		ZhawWavLib.write(signalOktave, "signalOktave.wav");
		ZhawWavLib.play("signalOktave.wav");


	}

}