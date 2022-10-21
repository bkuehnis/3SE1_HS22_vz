package vzb.ch.zhaw.toddara1.uebung4;

import ch.zhaw.lib.ZhawWavLib;

public class Uebung4 {


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

			for (int i = 0; i < lowSignal.length; i++) { // Schleife lauft nur so lange wie Länge des Arrays
				// System.out.println("Vorher: " + signal[i]);
				lowSignal[i] = signal[i] * 0.5;
				// System.out.println("Nachher: " + lowSignal[i]);

			}
			// write and play modified wav file
			ZhawWavLib.write(lowSignal, "Guitar-low.wav");
			ZhawWavLib.play("Guitar-low.wav");

			// TODO calculate lowSignal

			// increase volume of the audio signal
			double[] highSignal = new double[signal.length];

			// TODO calculate highSignal

			for (int i = 0; i < highSignal.length; i++) {
				// System.out.println("Vorher: " + signal[i]);
				highSignal[i] = signal[i] * 2;
				// richtiger Wert
//				if(highSignal[i] > -1) {
//					
//				} else if(highSignal[i] < 1){

//				}
				// falsche Werte korrigieren
				if (highSignal[i] < -1) {
					highSignal[i] = -1;

				}

				else if (highSignal[i] > 1) {
					highSignal[i] = 1;
				}

//			System.out.println("Nachher: " + highSignal[i]);

			}
			// write and play modified wav file
			ZhawWavLib.write(highSignal, "Guitar-high.wav");
			ZhawWavLib.play("Guitar-high.wav");

			// increase frequency by a "quinte"
			double[] signalQuinte = new double[signal.length * 2 / 3];
			for (int i = 0; i < signalQuinte.length; i++) {
				signalQuinte[i] = signal[i * 3 / 2];
			}

			// write and play modified wav file
			ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
			ZhawWavLib.play("Guitar-quinte.wav");

			// TODO calculate signalQuinte
			// increase frequency by an "oktave"
			// TODO calculate signalOktave
			double[] signalOktave = new double[signal.length / 2];
			for (int i = 0; i < signalOktave.length; i++) {
				signalOktave[i] = signal[2 * i];
			}

			// write and play modified wav file
			ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
			ZhawWavLib.play("Guitar-oktave.wav");

		}

	}



