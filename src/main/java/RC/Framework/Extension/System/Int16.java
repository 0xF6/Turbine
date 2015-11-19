////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.Extension.System;

import RC.Framework.RException.FormatException;

public class Int16
{
	public short value;
	public static final Int16 MaxValue = Int16.toInt16((short)32767);
	public static final Int16 MinValue = Int16.toInt16((short)-32767);

	public static boolean isParse(final String value)
	{
		try
		{
			Int16 i = Int16.Parse(value);
			return true;
		}
		catch (Exception ignored)
		{
			return false;
		}
	}
	public static Int16 Parse(final String value) throws Exception
	{
		int i = Int32.Parse(value);
		if (i < MinValue.value || i > MaxValue.value)
			throw new FormatException("Value out of range. Value:\"" + value + "\"");
		Int16 sh = new Int16();
		sh.value = (short)i;
		return sh;
	}
	public Int16 ToInt16(final short value)
	{
		Int16 returnValue = new Int16();
		returnValue.value = value;
		return returnValue;
	}
	public short ToShort(final Int16 value)
	{
		return value.value;
	}
	public static Int16 toInt16(final short value)
	{
		Int16 returnValue = new Int16();

		returnValue.value = value;
		return returnValue;
	}
	public static short toShort(final Int16 value)
	{
		return value.value;
	}
}
