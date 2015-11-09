////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////
package RC.Framework.RException;

public class ArgumentException extends RException
{
	public String Argument = "null";
	public ArgumentException(String arg)
	{
		this.Argument = arg;
	}
	public ArgumentException(String arg, String message)
	{
		super(message);
		this.Argument = arg;
	}
	public ArgumentException()
	{
		super();
	}
}
