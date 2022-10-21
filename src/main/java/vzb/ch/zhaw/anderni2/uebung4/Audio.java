package vzb.ch.zhaw.anderni2.uebung4;

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
        // TODO calculate lowSignal
        for (int i = 0; i < signal.length; i++) {
            lowSignal[i] = signal[i] * 0.5;


        }

        // increase volume of the audio signal
        double[] highSignal = new double[signal.length];
        // ToDo calculate highSignal
        for (int i = 0; i < signal.length; i++) {
            highSignal[i] = signal[i] * 2;
        //stimmt das??
            if (highSignal[i] > 1.0) {
                highSignal[i] = 1.0;
            }
            if (highSignal[i] < -1.0) {
                highSignal[i] = -1.0;
            }
        }

        // increase frequency by a "quinte"
        double[] quinteSignal = new double[signal.length];
        // TODO calculate signalQuinte
        for (int i = 0; i < quinteSignal.length; i = i + 2) {
            quinteSignal[i / 2] = signal[i];

        }

        // increase frequency by an "oktave"
        double[] oktaveSignal = new double[signal.length];
        // TODO calculate oktave
        for (int i = 0; i < oktaveSignal.length; i = i + 3) {
            oktaveSignal[i / 3] = signal[i];
        }


        // write and play modified wav file
        ZhawWavLib.write(highSignal, "Guitar-high.wav");
        ZhawWavLib.play("Guitar-high.wav");
        ZhawWavLib.write(lowSignal, "Guitar-low.wav");
        ZhawWavLib.play("Guitar-low.wav");
        ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
        ZhawWavLib.play("Guitar-mirrored.wav");
        ZhawWavLib.write(quinteSignal, "Guitar-quinte.wav");
        ZhawWavLib.play("Guitar-quinte.wav");
        ZhawWavLib.write(oktaveSignal, "Guitar-oktave.wav");
        ZhawWavLib.play("Guitar-oktave.wav");
    }

}
