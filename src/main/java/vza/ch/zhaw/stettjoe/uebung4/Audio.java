package vza.ch.zhaw.stettjoe.uebung4;

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
		for (int i = 0; i < signal.length; i++) {
			double slot = signal[i] / 2;
			lowSignal[i] = slot;
		}
		
		ZhawWavLib.write(lowSignal, "Guitar-lowSignal.wav");
		ZhawWavLib.play("Guitar-lowSignal.wav");
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// TODO calculate highSignal
		for (int i = 0; i < signal.length; i++) {
			double slot = signal[i] * 1.5;
			if (slot > 1) {
				slot = 1;
			} else if (slot < -1) {
				slot = -1;
			}
			highSignal[i] = slot;
		}
		
		ZhawWavLib.write(highSignal, "Guitar-highSignal.wav");
		ZhawWavLib.play("Guitar-highSignal.wav");
		
		// increase frequency by a "quinte"
		double[] signalQuinte = new double[367395];
		int count = 0;
		int count2 = 0;
		// TODO calculate signalQuinte
		for (int i = 0; i < 367395; i++) {
			if (count < 3) {
				signalQuinte[i] = signal[i-count2];
				count++;
			} else {
				signalQuinte[i] = (signalQuinte[i-1] + signal[i-count2+1])/2;
				count2++;
			}
		}

		ZhawWavLib.write(signalQuinte, "Guitar-signalQuinte.wav");
		ZhawWavLib.play("Guitar-signalQuinte.wav");
		
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length / 2];
		// TODO calculate signalOktave
		int slotOktave = 0;
		for (int i = 0; i < signal.length / 2; i = i+2) {
			signalOktave[slotOktave] =  signal[i];
			slotOktave++;
		}
		
		ZhawWavLib.write(signalOktave, "Oktave-Signal.wav");
		ZhawWavLib.play("Oktave-Signal.wav");
	}
	
}
