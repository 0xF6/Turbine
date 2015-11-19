////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.Extension.System.Marshal;

import RC.Framework.Extension.System.Int16;
import RC.Framework.Extension.System.Int32;
import RC.Framework.Extension.System.Marshal.SystemType;
import RC.Framework.RException.NotSupportedException;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class BitConverter
{
	public static byte[] getBytes(Int16 value)
	{
		return getBytes(value.value);
	}
	public static byte[] getBytes(Int32 value)
	{
		return getBytes(value.value);
	}
	public static byte[] getBytes(short value)
	{
		return ByteBuffer.allocate(Short.BYTES).order(ByteOrder.nativeOrder()).putShort(value).array();
	}
	public static byte[] getBytes(float value)
	{
		return ByteBuffer.allocate(Float.BYTES).order(ByteOrder.nativeOrder()).putFloat(value).array();
	}
	public static byte[] getBytes(long value)
	{
		return ByteBuffer.allocate(Long.BYTES).order(ByteOrder.nativeOrder()).putLong(value).array();
	}
	public static byte[] getBytes(int value)
	{
		return ByteBuffer.allocate(Integer.BYTES).order(ByteOrder.nativeOrder()).putInt(value).array();
	}
	public static byte[] getBytes(boolean value)
	{
		byte[] ar = new byte[0];
		try
		{
			ar = new byte[SystemType.SizeOf(boolean.class)];
		} catch (NotSupportedException ignored) {}
		if(value)
			ar[0] = 1;
		else
			ar[0] = 0;
		return ar;
	}
	public static float toSingle(byte[] buffer)
	{
		return ByteBuffer.wrap(buffer, 0, buffer.length).order(ByteOrder.nativeOrder()).getFloat();
	}
	public static int toInt32(byte[] buffer)
	{
		return ByteBuffer.wrap(buffer, 0, buffer.length).order(ByteOrder.nativeOrder()).getInt();
	}
	public static long toInt64(byte[] buffer)
	{
		return ByteBuffer.wrap(buffer, 0, buffer.length).order(ByteOrder.nativeOrder()).getLong();
	}
	public static short toInt16(byte[] buffer)
	{
		return ByteBuffer.wrap(buffer, 0, buffer.length).order(ByteOrder.nativeOrder()).getShort();
	}
	public static boolean toBool(byte[] buffer)
	{
		return buffer[0] == 1;
	}
}
