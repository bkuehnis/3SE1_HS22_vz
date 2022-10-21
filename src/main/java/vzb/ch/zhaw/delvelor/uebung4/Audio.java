package vzb.ch.zhaw.delvelor.uebung4;

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
		
		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");
		
		//Dieser Abschnitt wird nicht abgespielt
		
		double Ueberprüfung = 0.0;
		double[] lowSignal = new double[signal.length];

		for (int i = 0; i < signal.length; i++) {
			Ueberprüfung = signal[i] * 0.5;

			if (Ueberprüfung < 1.0 && Ueberprüfung > -1.0) {
				lowSignal[i] = Ueberprüfung / 0.5;
			} else if (Ueberprüfung > 1.0) {
				lowSignal[i] = 1.0;
			} else {
				lowSignal[i] = -1.0;
			}

		}

		//Ich schaffe es nicht, dass die Audio-Datei sich nicht übersteuert
		
		ZhawWavLib.write(lowSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		double[] highSignal = new double[signal.length];

		for (int i = 0; i < signal.length; i++) {
			Ueberprüfung = signal[i] * 1.5;

			if (Ueberprüfung < 1.0 && Ueberprüfung > -1.0) {
				highSignal[i] = Ueberprüfung / 1.5;
			} else if (Ueberprüfung > 1.0) {
				highSignal[i] = 1.0;
			} else {
				highSignal[i] = -1.0;
			}

		}

		ZhawWavLib.write(highSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		double[] sound3 = ZhawWavLib.read("Guitar.wav");
		double[] SignalQuinte = new double[sound3.length / 2];
		for (int i = 0; i < SignalQuinte.length; i++) {
			SignalQuinte[i] = sound3[2 * i];

		}

		ZhawWavLib.write(SignalQuinte, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		double[] sound4 = ZhawWavLib.read("Guitar.wav");
		double[] SignalOktave = new double[(int) (sound4.length * 1.5)];
		for (int i = 0; i < SignalOktave.length; i++) {
			SignalOktave[i] = sound4[(int) (i / 1.5)];

		}

		ZhawWavLib.write(SignalOktave, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

	}

}
