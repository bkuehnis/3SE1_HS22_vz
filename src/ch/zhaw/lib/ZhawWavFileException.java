package ch.zhaw.lib;


public class ZhawWavFileException extends Exception
{	
	public ZhawWavFileException()
	{
		super();
	}

	public ZhawWavFileException(String message)
	{
		super(message);
	}

	public ZhawWavFileException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public ZhawWavFileException(Throwable cause) 
	{
		super(cause);
	}
}

