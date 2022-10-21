package vzb.ch.zhaw.sprinala.uebung4;

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
		for (int i = 0; i<signal.length; i++){
			lowSignal[i] = signal[i]/2;
		}

		// increase volume of the audio signal
		double[] highSignal = new double[signal.length];
		for (int i = 0; i<signal.length; i++){
			highSignal[i] = signal[i]*2;

			if (highSignal[i] > 1.0){
				highSignal[i] = 1.0;
			} if (highSignal[i] < -1.0){
				highSignal[i] = -1.0;
			}
		}

		// decrease vol.
		ZhawWavLib.write(lowSignal, "Guitar-lowSignal.wav");
		ZhawWavLib.play("Guitar-lowSignal.wav");
		// increase vol.
		ZhawWavLib.write(highSignal, "Guitar-highSignal.wav");
		ZhawWavLib.play("Guitar-highSignal.wav");

		// increase frequency by a "quinte"
		double[] signalOktave = new double[signal.length/2];
		for (int i = 0, y = 0; i<signal.length; i+=2, y++){
			 signalOktave[y] = signal[i];
		}

		double[] signalQuinte = new double[signal.length];
		for (int i = 0; i < signalQuinte.length; i = i + 3) {
			signalQuinte[i / 3] = signal[i];
		}

		ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
		ZhawWavLib.play("Guitar-oktave.wav");
		// increase vol.
		ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
		ZhawWavLib.play("Guitar-quinte.wav");
	}
}
