////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////
package RC.Framework.RException;

public class ArgumentNullException extends RException
{
	public String Argument = "null";
	public ArgumentNullException(String arg)
	{
		this.Argument = arg;
	}
	public ArgumentNullException(String arg, String message)
	{
		super(message);
		this.Argument = arg;
	}
	public ArgumentNullException()
	{
		super();
	}
}
