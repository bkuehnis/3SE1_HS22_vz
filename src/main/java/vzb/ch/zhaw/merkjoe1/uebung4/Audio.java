package vzb.ch.zhaw.merkjoe1.uebung4;

import ch.zhaw.lib.ZhawWavLib;
public class Audio {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		//ZhawWavLib.play("Guitar.wav");

		// mirror the audio signal
		double[] lowSignal = new double[signal.length];
		for (int i = 0; i < signal.length; i++) {
			lowSignal [i] = signal [i]*0.5;	
		}
		double[] highSignal = new double[signal.length];	
		for (int i = 0; i < signal.length; i++) {
			highSignal [i] = signal [i]*1.5;	
			if(highSignal [i] > 1)
			{
				highSignal [i] = 1.0;
			}
		}
		double[] oktSignal = new double[signal.length / 2];
		for (int i = 0; i < signal.length; i++) {
			oktSignal[i / 2] = signal[i];
		}
		
		double[] quiSignal = new double[signal.length *3/2];
		for (int i = 0; i < signal.length; i++) {
			quiSignal[i*3/2] = signal[i];
		}
		
		int x = 2;
		while(x < quiSignal.length)
		{
			quiSignal[x] = quiSignal[x-1];
			x = x + 3;
		}
		double[] quiSignal1 = new double[quiSignal.length /3];
		for (int i = 0; i < signal.length; i++) {
			quiSignal1[i/3] = signal[i];
		}
		
		// write and play modified wav file
		ZhawWavLib.write(lowSignal, "Guitar-Low.wav");
		ZhawWavLib.play("Guitar-Low.wav");
		ZhawWavLib.write(highSignal, "Guitar-High.wav");
		ZhawWavLib.play("Guitar-High.wav");
		ZhawWavLib.write(oktSignal, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");
		ZhawWavLib.write(quiSignal1, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");
	}
}
