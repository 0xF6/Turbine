////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.Network;

public abstract class NetworkObject
{
	public abstract byte[] ToByte();
	public abstract void outByte(byte[] bitBox);
}
