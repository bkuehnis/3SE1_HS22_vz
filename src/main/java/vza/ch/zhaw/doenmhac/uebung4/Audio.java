package vza.ch.zhaw.doenmhac.uebung4;

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
            for (int h = 0; h < signal.length; h++) {
                        double lowZW = signal[h]*0.5;
                        if (lowZW < -1.0) {
                              lowZW = -1.0;
                        }
                        lowSignal[h]=lowZW;         
                       
                  }          
           
            // increase volume of the audio signal
                 
                 
            double[] highSignal = new double[signal.length];
            for (int k=0; k < signal.length; k++) {
                  double highZW = 0;
                  highZW = signal[k]*1.5;     
                  if (highZW > 1.0) {
                        highZW = 1.0;
                  }
                  highSignal[k]=highZW; 
                 
           
            }
            // increase frequency by a "quinte"
            double[] signalQuinte = new double[signal.length/3*2];
            int quinte = 0;
            int zweite=0;
            double quinteZW = 0;
            for (int o = 0; o < signal.length; o++) {
                  if (o%3==0) {         
                        zweite++;
                        if (zweite%2==0)
                        signalQuinte[quinte]=signal[o];
                                   
                        quinte++;
                 
            }
            }
           
            // increase frequency by an "oktave"
            double[] signalOktave = new double[signal.length/2];
            signalOktave[0]=signal[0];
            for (int i=2; i < signal.length; i++) {                 
                  if (i%2==0) {
                  signalOktave[i/2] = signal[i];
                  
                  }
                 
            }
                 	
           
 
            // write and play modified wav file
            //ZhawWavLib.write(mirroredSignal, "Guitar-mirrored.wav");
            //ZhawWavLib.play("Guitar-mirrored.wav");
           
            ZhawWavLib.write(lowSignal, "Guitar-low.wav");
            ZhawWavLib.play("Guitar-low.wav");
           
            ZhawWavLib.write(highSignal, "Guitar-high.wav");
            ZhawWavLib.play("Guitar-high.wav");
           
            ZhawWavLib.write(signalOktave, "Guitar-oktave.wav");
            ZhawWavLib.play("Guitar-oktave.wav");
           
            ZhawWavLib.write(signalQuinte, "Guitar-quinte.wav");
            ZhawWavLib.play("Guitar-quinte.wav");
      }
}