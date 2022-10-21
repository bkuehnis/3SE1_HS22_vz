package vzb.ch.zhaw.mulahham.uebung4;

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

        // decrease volume of the audio signal
        double[] lowSignal = new double[signal.length];
        for (int i = 0; i < signal.length; i++) {
            lowSignal[i] = signal[i] * 0.5;
            if (lowSignal[i] > 1){
                lowSignal[i] = 1;
            }
        }

        // increase volume of the audio signal
        double[] highSignal = new double[signal.length];
        for (int i = 0; i < signal.length; i++) {
            highSignal[i] = signal[i] * 1.5;
            if (highSignal[i] > 1){
                highSignal[i] = 1;
            }
        }

        // increase frequency by a "quinte"
        double[] signalQuinte = new double[signal.length/3*2];
        int indexSignalQuinte = 0;
        for (int i = 0; i < signal.length; i++) {
            if (i != 0 && i % 3 != 0){
                signalQuinte[indexSignalQuinte] = signal[i];
                indexSignalQuinte++;
            }
        }

        // increase frequency by an "oktave"
        double[] signalOktave = new double[signal.length/2];
        for (int i = 0; i < signalOktave.length; i++) {
            signalOktave[i] = signal[i*2];
        }


        // write and play modified wav file
        ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
        ZhawWavLib.play("Guitar-mirrored.wav");

        ZhawWavLib.write(lowSignal, "Guitar-low.wav");
        ZhawWavLib.play("Guitar-low.wav");

        ZhawWavLib.write(highSignal, "Guitar-high.wav");
        ZhawWavLib.play("Guitar-high.wav");

        ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
        ZhawWavLib.play("Guitar-quinte.wav");

        ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
        ZhawWavLib.play("Guitar-oktave.wav");

    }

}
