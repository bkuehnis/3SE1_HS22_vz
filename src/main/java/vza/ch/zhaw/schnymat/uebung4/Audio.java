package vza.ch.zhaw.schnymat.uebung4;

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

        lowAndHighGuitar(signal);

        oktaveQuinteSound(signal);

        // write and play modified wav file
        ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
        ZhawWavLib.play("Guitar-mirrored.wav");
    }

    public static void lowAndHighGuitar(double[] signal){
        double[] lowSignal = new double[signal.length];
        double[] highSignal = new double[signal.length];
        for(int i = 0; i < signal.length; i++){
            // Sänke Lautstärke um 0.5
            double amplitudeLow = signal[i] * 0.5;
            if (amplitudeLow < -1) amplitudeLow = -1;
            lowSignal[i] = amplitudeLow;

            // Erhöhe Lautstärke um 0.5
            double amplitudeHigh = signal[i] * 1.5;
            if (amplitudeHigh > 1.0) amplitudeHigh = 1.0;
            highSignal[i] = amplitudeHigh;
        }

        ZhawWavLib.write(lowSignal, "Guitar-low.wav");
        ZhawWavLib.write(highSignal, "Guitar-high.wav");
        ZhawWavLib.play("Guitar-low.wav");
        ZhawWavLib.play("Guitar-high.wav");
    }

    public static void oktaveQuinteSound(double[] signal){

        // increase frequency by a "oktave"
        double[] signalOktave = new double[signal.length / 2];
        int counter = 0;
        for(int i = 0; i < signal.length; i++){
            if (i % 2 != 0) {
                signalOktave[counter] = signal[i];
                counter++;
            }
        }
        // increase frequency by a "quinte"
        double[] signalQuinte = new double[(signal.length / 3)*2];
        counter = 0;
        for(int i = 0; i < signal.length; i ++){
            if (i % 3 != 0) {
                signalQuinte[counter] = signal[i];
                counter++;
            }
        }

        ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
        ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
        ZhawWavLib.play("Guitar-quinte.wav");
        ZhawWavLib.play("Guitar-oktave.wav");
    }
}
