////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.Configuration;

import RC.RFramework;
import ru.turbine.launch.TurbineTweaker;

public class Orch
{
	static
	{
		if(RFramework.is64bitProcess())
			System.load(TurbineTweaker.PathToModule + "\\RC.Framework.x64.dll");
		else
			System.load(TurbineTweaker.PathToModule + "\\RC.Framework.x86.dll");
	}
	private native static void 		init				();
	private native static void 		open				(String path);
	private native static void 		create				(String path);
	private native static String 	getString			(String key, String def);
	private native static void 		setString			(String key, String newVal);
	private native static void  	addString			(String key, String val);
	private native static int 		getErrorCode		(int index);
	private native static int 		getErrorCodeLenght	();
	private native static boolean	isNotNull			();
}
