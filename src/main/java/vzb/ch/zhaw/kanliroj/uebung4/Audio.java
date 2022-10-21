package vzb.ch.zhaw.kanliroj.uebung4;

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
		for (double d = 0; d < signal.length; d++); {
			double decreased = signal.length * 2;
		}	
	
		// lowSignal[decrease] am Schluss erscheint immer als Mismatch aufgrund von double+int obwohl int nicht definiert wurde..
		
		
		// write and play decreased volume signal
		ZhawWavLib.write(lowSignal, "Guitar-decreased.wav");
		ZhawWavLib.play("Guitar-decreased.wav");
		
		
		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		for (double h = 0; h < signal.length; h++); {
			double high = signal.length / 2;
			
		//highSignal[high] am Schluss erscheint immer als Mismatch aufgrund von double+int obwohl int nicht definiert wurde..
}}}

		//increase frequency by a "quinte"
		//TODO calculate signalQuinte
//		double[] signalQuinte = new double[signal.length];
//		for (double q = 0; q < signal.lentgh; q++); {
//			double quinte = signal.lentgh * 3/2;
//		}
//
//		//increase frequency by an "oktave"
//		//TODO calculate signalOktave
//		double[] signalOktave = new double[signal.length/2];
//		for (double o = 0; o < signal.lentgh; o++); {
//			double oktave = signal.length / 2;
//		}}}
		
		// Brauche ein bisschen Zeit für das Selbststudium und mehrere (diversere) Beispiele in den Übungen. (Videos wie auch Codeboard-Aufgaben.)


