package vza.ch.zhaw.zuercja2.uebung4;

import ch.zhaw.lib.ZhawWavLib;

public class Audio {

		public static void main(String[] args) {
			// read and play original wav file
			double[] signal = ZhawWavLib.read("Guitar.wav");
			ZhawWavLib.play("Guitar.wav");
			// mirror the audio signal
			double[] mirroredSignal = new double[signal.length];
			for (int i=0; i<signal.length; i++) {
			int index = signal.length-1-i;
			mirroredSignal[index] = signal[i];
			}
			// write and play modified wav file
			ZhawWavLib.write(mirroredSignal,"Guitar-mirrored.wav");
			ZhawWavLib.play("Guitar-mirrored.wav");
			
			double[] lowSignal = ZhawWavLib.read("Guitar.wav");
			
			for(int i=0;i<lowSignal.length;i++) {
				lowSignal[i] /= 2;
			}
			ZhawWavLib.write(lowSignal,"Guitar.wav.leiser");
			ZhawWavLib.play("Guitar.wav.leiser");
			
			double[] highSignal = ZhawWavLib.read("Guitar.wav");
			
			for(int i=0;i<highSignal.length;i++) {
				if(highSignal[i]*1.5>1) {
					highSignal[i]=1;
				}
				else {highSignal[i]*=1.5;}
			}
			ZhawWavLib.write(lowSignal,"Guitar.wav.louder");
			ZhawWavLib.play("Guitar.wav.louder");
			
			double[] signalQuinte = new double[signal.length/2];
			
			for(int i=0;i<signalQuinte.length;i++) {
				signalQuinte[i]=signal[i/2*3];
			}
			
			ZhawWavLib.write(signalQuinte,"Guitar.wav.Quinte");
			ZhawWavLib.play("Guitar.wav.Quinte");
			
			
			double[] signalOktave = new double[signal.length/2];
			
			for(int i = 0;i<signalOktave.length;i++) {
				signalOktave[i]=signal[i*2];
			}
			
			ZhawWavLib.write(signalOktave,"Guitar.wav.Oktave");
			ZhawWavLib.play("Guitar.wav.Oktave");



	}

}
