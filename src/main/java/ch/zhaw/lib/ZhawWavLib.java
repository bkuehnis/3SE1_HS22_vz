package ch.zhaw.lib;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * Simple API to play wav files based on Andrew Greensted wav file IO class (see
 * http://www.labbookpages.co.uk/audio/javaWavFiles.html).
 */

public class ZhawWavLib {

	//private constructor to hide the public one.
	private ZhawWavLib() {}
	
	/**
	 * Read a wav file and extract the sample values.
	 * 
	 * @param filename Filename and path of the wav file to read.
	 * @return wav file samples in an array of doubles (range -1.0 to 1.0).
	 */
	public static double[] read(String filename) {
		// Open the wav file
		try (ZhawWavFile wavFile = ZhawWavFile.openWavFile(new File(filename))){
			
			// Get the number of audio channels and frames
			long numChannels = wavFile.getNumChannels();
			long numFrames = wavFile.getNumFrames();

			// Read all frames to buffer
			double[] buffer = new double[(int) (numFrames * numChannels)];
			wavFile.readFrames(buffer, (int) numFrames);

			// Return the buffer
			return buffer;
		} catch (Exception e) {
			printException(filename, e);
			return null;
		}
	}

	/**
	 * Create and write a wav file from sample values.
	 * 
	 * @param data     wav file samples in an array of doubles (range -1.0 to 1.0).
	 * @param filename Filename and path of the wav file to write.
	 */
	public static void write(double[] data, String filename) {

		int sampleRate = 44100; // Samples per second

		// Calculate the number of frames required
		long numFrames = (long) (data.length);
		// Create a wav file

		try (ZhawWavFile wavFile = ZhawWavFile.newWavFile(new File(filename), 2, numFrames / 2, 16, sampleRate)) {

			// Write the buffer
			wavFile.writeFrames(data, data.length);

			System.out.println("Wav file " + filename + " written");

		} catch (Exception e) {
			printException(filename, e);
		}
	}

	/**
	 * Play a wav file
	 * 
	 * @param filename Filename and path of the file to play.
	 */
	public static void play(String filename) {
		// Calculate length of the file in seconds
		try (ZhawWavFile wavFile = ZhawWavFile.openWavFile(new File(filename))){			
			float wavFileLength = (float) wavFile.getNumFrames() / wavFile.getSampleRate();

			// Open audio stream and start playback
			File file = new File(filename);
			Clip clip = AudioSystem.getClip();
			AudioInputStream wav = AudioSystem.getAudioInputStream(file);
			clip.open(wav);
			clip.start();

			// Wait for playback to finish
			Thread.sleep((long) (1000 * wavFileLength));
			System.out.println("Finished playback of " + filename + " (" + wavFileLength + " seconds)");

		} catch (Exception e) {
			printException(filename, e);
		}
	}

	/**
	 * Print some wav file properties to standard output.
	 * 
	 * @param filename Filename and path of the wav file.
	 */
	public static void info(String filename) {
		try (ZhawWavFile wavFile = ZhawWavFile.openWavFile(new File(filename))){			
			wavFile.display();
		} catch (Exception e) {
			printException(filename, e);
		}
	}

	private static void printException(String filename, Exception e) {
		System.err.println("Working Directory = " + System.getProperty("user.dir"));
		System.err.println("Trying to read file " + filename);
		System.err.println(e);
	}
}
