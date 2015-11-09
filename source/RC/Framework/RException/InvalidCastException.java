////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////
package RC.Framework.RException;

public class InvalidCastException extends RException
{
	public int ErrorCode = -1;
	public InvalidCastException(String message)
	{
		super(message);
	}
	public InvalidCastException(String message, int errorCode)
	{
		super(message);
		this.ErrorCode = errorCode;
	}
	public InvalidCastException()
	{
		super();
	}
}
