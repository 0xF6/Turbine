////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.Network;
import java.io.*;

public class ArchBox
{
	protected ByteArrayInputStream memoryReader;
	protected ByteArrayOutputStream Writer;
	protected ArchBox(byte[] buffer) throws IOException
	{
		memoryReader = new ByteArrayInputStream(buffer);
	}
	protected ArchBox() throws IOException
	{
		Writer = new ByteArrayOutputStream();
	}
	public static IArchBoxWriter InvokeWriter() throws IOException
	{
		return new ArchBoxWriter();
	}
	public static IArchBoxReader InvokeReader(byte[] buffer) throws IOException
	{
		return new ArchBoxReader(buffer);
	}
}
