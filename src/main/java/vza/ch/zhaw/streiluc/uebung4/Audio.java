package vza.ch.zhaw.streiluc.uebung4;

import ch.zhaw.lib.ZhawWavLib;
public class Audio {

	public static void main(String[] args) {
		// read and play original wav file
		double[] signal = ZhawWavLib.read("Guitar.wav");
		ZhawWavLib.play("Guitar.wav");

		// mirror the audio signal
		double[] mirroredSignal = ZhawWavLib.read("Guitar.wav");
		for (int i = 0; i < signal.length; i++) {
			int index = signal.length - 1 - i;
			mirroredSignal[index] = signal[i];
		}

		// write and play modified wav file
		ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
		ZhawWavLib.play("Guitar-mirrored.wav");

		// decrease volume of the audio signal
		double[] lowSignal = ZhawWavLib.read("Guitar.wav");
		for (int i=0; i< lowSignal.length-1;i++) {
			if(lowSignal[i]> -1 )
			//mal 0.5
			lowSignal[i]=lowSignal[i]*0.5;
		}
			ZhawWavLib.write(lowSignal,"Tiefe Gitarre.wav");
			ZhawWavLib.play("Tiefe Gitarre.wav");
			
		double[] highSignal = ZhawWavLib.read("Guitar.wav");
		// TODO calculate highSignal vmt. mal 1.5
		for(int i=0; i<highSignal.length-1;i++) {
		if(highSignal[i]<1) {
			highSignal[i]=highSignal[i]*1.5;
		}else {
			highSignal[i]=1.0;
		}
		}
		ZhawWavLib.write(highSignal,"hohe Gitarre");
		ZhawWavLib.play("hohe Gitarre");
		
		// increase frequency by a "quinte"
		double[] signalQuinte =  new double[signal.length*2];
		signalQuinte = ZhawWavLib.read("Guitar.wav");
		for(int i=0; i<signalQuinte.length-1;i++) {
			if(signalQuinte[i]<1.5) {
				signalQuinte[i]=signalQuinte[i]*3/2;
			}else {
				signalQuinte[i]=1.0;
			}
			}
			ZhawWavLib.write(signalQuinte,"hohe Quinte");
			ZhawWavLib.play("hohe Quinte");
		// TODO calculate signalQuinte
		// increase frequency by an "oktave"
		double[] signalOktave = new double[signal.length*4];
		signalOktave = ZhawWavLib.read("Guitar.wav");
		for(int i=0; i<signalOktave.length-1;i++) {
			if(signalOktave[i]<1.5) {
				signalOktave[i]= signalOktave[i]*2;
			}else {
				signalOktave[i]=1.5;
			}
		}
		// TODO calculate signalOktave
	}

}
