////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.Network;

import RC.Framework.Extension.System.Marshal.BitConverter;
import RC.Framework.Extension.System.Marshal.SystemType;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ArchBoxReader extends ArchBox implements IArchBoxReader
{
	protected ArchBoxReader(byte[] buffer) throws IOException
	{
		super(buffer);
	}
	@Override
	public String rString()
	{
		byte[] buffer = new byte[rShort()];
		int i = memoryReader.read(buffer, 0, buffer.length);
		return new String(buffer, StandardCharsets.UTF_8);
	}
	@Override
	public short rShort()
	{
		try
		{
			byte[] buffer = new byte[SystemType.SizeOf(short.class)];
			int len = memoryReader.read(buffer, 0, buffer.length);
			return BitConverter.toInt16(buffer);
		}
		catch (Exception ignored) { }
		return 0;
	}
	@Override
	public float rFloat()
	{
		try
		{
			byte[] buffer = new byte[SystemType.SizeOf(float.class)];
			int len = memoryReader.read(buffer, 0, buffer.length);
			return BitConverter.toSingle(buffer);
		}
		catch (Exception ignored) { }
		return 0;
	}
	@Override
	public int rInt()
	{
		try
		{
			byte[] buffer = new byte[SystemType.SizeOf(int.class)];
			int len = memoryReader.read(buffer, 0, buffer.length);
			return BitConverter.toInt32(buffer);
		}
		catch (Exception ignored) { }
		return 0;
	}
	@Override
	public long rLong()
	{
		try
		{
			byte[] buffer = new byte[SystemType.SizeOf(long.class)];
			int len = memoryReader.read(buffer, 0, buffer.length);
			return BitConverter.toInt64(buffer);
		}
		catch (Exception ignored) { }
		return 0;
	}
	@Override
	public boolean rBool()
	{
		try
		{
			byte[] buffer = new byte[SystemType.SizeOf(boolean.class)];
			int len = memoryReader.read(buffer, 0, buffer.length);
			return BitConverter.toBool(buffer);
		}
		catch (Exception ignored) { }
		return false;
	}
}
