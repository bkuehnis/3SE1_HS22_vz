package vzb.ch.zhaw.steinol3.uebung4;

import ch.zhaw.lib.ZhawWavLib;
public class Audio {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		

		// mirror the audio signal
		double[] mirroredSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			int index = signal.length - 1 - i;
			mirroredSignal[index] = signal[i];
		}
		
		double [] highSignal = new double[signal.length];
		for (int i = 0; i < signal.length-1-i;i++) {
			double volume_up =  i;
			highSignal[(int) volume_up] = signal[i] * 1.5;
		}
		
		double [] lowSignal = new double[signal.length];
		for (int i = 0; i < signal.length-1-i;i++) {
			double volume_down = i;
			lowSignal[(int) volume_down] = signal[i] * 0.5;
		}
		
		double [] signalQuinte = new double[signal.length];
		for (int i = 0; i < signal.length-1-i;i++) {
			double quinte = i /1.5;
			signalQuinte[(int) quinte] = signal[i];
		}
			
		double [] signalOktave = new double[signal.length];
		for (int i = 0; i < signal.length-1-i;i++) {
			double oktave = i /2;
			signalOktave[(int) oktave] = signal[i];
			
		
		}

		// write and play modified wav file
		ZhawWavLib.write(lowSignal, "Guitar_down.wav");
		ZhawWavLib.play("guitar_down.wav");
		ZhawWavLib.write(highSignal, "guitar_up.wav");
		ZhawWavLib.play("Guitar_up.wav");
		ZhawWavLib.write(signalQuinte, "Guitar_Quinte.wav");
		ZhawWavLib.play("Guitar_Quinte.wav");
		ZhawWavLib.write(signalOktave, "Guitar_Oktave.wav");
		ZhawWavLib.play("Guitar_Oktave.wav");

	}
	
}
