////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.Network;

public interface IArchBoxWriter
{
	byte[] GetAll();
	void wString(String value) throws Exception;
	void wShort(short value);
	void wFloat(float value);
	void wLong(long value);
	void wInt(int value);
	void wBool(boolean value);
}
