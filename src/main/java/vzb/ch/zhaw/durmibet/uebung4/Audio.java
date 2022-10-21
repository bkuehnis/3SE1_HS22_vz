package vzb.ch.zhaw.durmibet.uebung4;

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
		for (int i = 0; i < signal.length; i++)
			;
		{
//lowSignal[i] = signal[i]*0.5;
		}
		double[] highSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++)
			;
		{
//	highSignal[i] = signal[i]*1.5;
		} // Ab hier kam ich nicht mehr weiter und weiss auch nicht, warum ich bei den
			// Zeilen 14/17 Fehlermeldungen habe.
		//TODO

//// write and play modified wav file
//ZhawWavLib.write(mirroredSignal,"Guitar-mirrored.wav");
//ZhawWavLib.play("Guitar-mirrored.wav");
//
////decrease volume of the audio signal 
//double[] lowSignal = new double[signal.length];
////TODO calculate lowSignal
////increase volume of the audio signal
//double[] highSignal = new double[signal.length];
////TODO calculate highSignal
//
////increase frequency by a "quinte"
//double[] signalQuinte = new double[?];
////TODO calculate signalQuinte
////increase frequency by an "oktave"
//double[] signalOktave = new double[?];
////TODO calculate signalOktave
	}
}
