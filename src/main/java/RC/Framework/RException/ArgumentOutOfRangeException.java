////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////
package RC.Framework.RException;

public class ArgumentOutOfRangeException extends RException
{
	public String Argument = "null";
	public ArgumentOutOfRangeException(String arg)
	{
		this.Argument = arg;
	}
	public ArgumentOutOfRangeException(String arg, String message)
	{
		super(message);
		this.Argument = arg;
	}
	public ArgumentOutOfRangeException()
	{
		super();
	}
}
