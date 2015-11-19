////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.Network;

import RC.Framework.Extension.System.Marshal.BitConverter;
import RC.Framework.Extension.System.Int16;
import RC.Framework.RException.ArgumentOutOfRangeException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ArchBoxWriter extends ArchBox implements IArchBoxWriter
{
	protected ArchBoxWriter() throws IOException
	{
		super();
	}
	@Override
	public byte[] GetAll()
	{
		return Writer.toByteArray();
	}
	@Override
	public void wString(String value) throws ArgumentOutOfRangeException
	{
		if (value.length() > Int16.toShort(Int16.MaxValue) - 1)
			throw new ArgumentOutOfRangeException("Length > short.MaxValue");
		byte[] byteArray = value.getBytes(StandardCharsets.UTF_8);
		this.wShort((short) byteArray.length);
		Writer.write(byteArray, 0, byteArray.length);
	}
	@Override
	public void wShort(short value)
	{
		byte[] byteArray = BitConverter.getBytes(value);
		Writer.write(byteArray, 0, byteArray.length);
	}
	@Override
	public void wFloat(float value)
	{
		byte[] byteArray = BitConverter.getBytes(value);
		Writer.write(byteArray, 0, byteArray.length);
	}
	@Override
	public void wLong(long value)
	{
		byte[] byteArray = BitConverter.getBytes(value);
		Writer.write(byteArray, 0, byteArray.length);
	}
	@Override
	public void wInt(int value)
	{
		byte[] byteArray = BitConverter.getBytes(value);
		Writer.write(byteArray, 0, byteArray.length);
	}
	@Override
	public void wBool(boolean value)
	{
		byte[] byteArray = BitConverter.getBytes(value);
		Writer.write(byteArray, 0, byteArray.length);
	}
}
