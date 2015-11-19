////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////
package RC.Framework.RException;

public class FormatException extends RException
{
	public String Argument;
	public FormatException(String message)
	{
		super(message);
	}
	public FormatException(String message, String arg)
	{
		super(message);
		this.Argument = arg;
	}
	public FormatException()
	{
		super();
	}
}
