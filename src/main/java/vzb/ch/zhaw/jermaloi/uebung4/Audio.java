package vzb.ch.zhaw.jermaloi.uebung4;

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
        }

        // increase volume of the audio signal
        double[] highSignal = new double[signal.length];
        for (int i = 0; i < signal.length; i++) {
            highSignal[i] = signal[i] * 1.5;
            if (highSignal[i] > 1.0) {
                highSignal[i] = 1.0;
            }
        }

        // increase frequency by an "oktave"
        double[] signalQuinte = new double[signal.length / 3 * 2];
        int indexQuinte = 0;
        for (int i = 0; i < signal.length; i++) {
            if (i % 3 == 0) continue;

            signalQuinte[indexQuinte] = signal[i];
            indexQuinte++;
        }

        // increase frequency by an "oktave"
        double[] signalOktave = new double[signal.length / 2];
        int indexOktave = 0;
        for (int i = 0; i < signal.length; i = i + 2) {
            signalOktave[indexOktave] = signal[i];
            indexOktave++;
        }

        saveAndPlayAudio(mirroredSignal, "Guitar-mirrored.wav");
        saveAndPlayAudio(lowSignal, "Guitar-low.wav");
        saveAndPlayAudio(highSignal, "Guitar-high.wav");
        saveAndPlayAudio(signalQuinte, "Guitar-quinte.wav");
        saveAndPlayAudio(signalOktave, "Guitar-oktave.wav");

    }

    public static void saveAndPlayAudio(double[] audio, String name) {
        ZhawWavLib.write(audio, name);
        ZhawWavLib.play(name);
    }

}
