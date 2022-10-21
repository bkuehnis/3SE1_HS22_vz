package vza.ch.zhaw.kernpas1.uebung4;

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


		// decrease volume of the audio signal 
		double[] lowSignal = new double[signal.length];
		// TODO calculate lowSignal
		for (int i = 0; i<signal.length; i++) {
			lowSignal[i] = signal[i]/2;
		}
		ZhawWavLib.write(lowSignal, "Guitar-lowsignal.wav");
		ZhawWavLib.play("Guitar-lowsignal.wav");

		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		// TODO calculate highSignal
		for (int i = 0; i<signal.length; i++) {
			highSignal[i] = signal[i]/2 + signal[i];
			if (highSignal[i]>1) {
				highSignal[i] = 1;
			} 
		}
		ZhawWavLib.write(highSignal, "Guitar-highsignal.wav");
		ZhawWavLib.play("Guitar-highsignal.wav");

		// increase frequency by a "quinte"
		double[] signalQuinte = new double[signal.length/(3/2)];
		// TODO calculate signalQuinte
		int count = 0;
		int count2 = 0;
		for (int i = 0; i<signal.length; i++) {
			if (count!=2) {
				signalQuinte[count2] = signal[i];
				count++;
				count2++;
			} else {
				count = 0;
				}
		}
		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");

		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length/2];
		// TODO calculate signalOktave
		boolean wechsler = false;
		int zähler = 0;
		for (int i = 0; i<signal.length; i++) {
			if (wechsler) {
				signalOktave[zähler] = signal[i];
				zähler++;
			} 
			wechsler = !wechsler;
		}
		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");

	}
	}