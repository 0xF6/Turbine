////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.Extension.System;

import RC.Framework.RException.ArgumentNullException;
import RC.Framework.RException.FormatException;

public class Int32
{
	public int value;
	public static int Parse(String s) throws Exception
	{
		if (s == null)
			throw new ArgumentNullException("null");
		int radix = 10;
		int result = 0;
		boolean negative = false;
		int i = 0, len = s.length();
		int limit = -Integer.MAX_VALUE;
		int multMin;
		int digit;

		if (len > 0)
		{
			char firstChar = s.charAt(0);
			if (firstChar < '0')
			{
				if (firstChar == '-')
				{
					negative = true;
					limit = Integer.MIN_VALUE;
				}
				else if (firstChar != '+')
					throw new FormatException(s);

				if (len == 1)
					throw new FormatException(s);
				i++;
			}
			multMin = limit / radix;
			while (i < len)
			{
				digit = Character.digit(s.charAt(i++),radix);
				if (digit < 0)
					throw new FormatException(s);
				if (result < multMin)
					throw new FormatException(s);
				result *= radix;
				if (result < limit + digit)
					throw new FormatException(s);
				result -= digit;
			}
		}
		else
			throw new FormatException(s);
		return negative ? result : -result;
	}
}
