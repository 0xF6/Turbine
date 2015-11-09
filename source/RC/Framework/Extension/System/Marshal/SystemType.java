////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.Extension.System.Marshal;

import RC.Framework.RException.NotSupportedException;

public enum SystemType
{
	_boolean(1, boolean	.class),
	_byte	(1, byte	.class),
	_short	(2, short	.class),
	_char	(2, char	.class),
	_int	(4, int		.class),
	_float	(4, float	.class),
	_long	(8, long	.class),
	_double	(8, double	.class);
	private final int size;
	private final Class<?> type;
	SystemType(final int size, final Class<?> type)
	{
		this.size = size;
		this.type = type;
	}
	public static int SizeOf(final Class<?> type) throws NotSupportedException
	{
		for(SystemType t : values())
		{
			if(type == t.type)
				return t.size;
		}
		throw new NotSupportedException("It is impossible to calculate the size of an object.");
	}
	public static int SizeOf(final Object obj) throws NotSupportedException
	{
		if(obj instanceof ISizeOfSupport)
		{
			return ((ISizeOfSupport) obj).getSize();
		}
		throw new NotSupportedException("This object does not support the interface ISizeOfSupport.");
	}
}