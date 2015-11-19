////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////
package ru.turbine.launch;

import RC.Framework.Extension.Debug;
import RC.Framework.Extension.RCPlugin;
import RC.Framework.Extension.System.Marshal.BitConverter;
import RC.RFramework;
import cpw.mods.fml.common.Mod;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import ru.turbine.engine.Turbine;

import java.io.File;
import java.util.List;
@RCPlugin(version = TurbineTweaker.Version, id = "TurbineTweaker")
public class TurbineTweaker implements ITweaker
{
	@Debug(target = "ru.whisper.native.debug.win64")
	public static void main(String[] args)
	{
		byte[] ars = BitConverter.getBytes((short)12);
		System.out.print(RFramework.is64bitProcess());
		RFramework rf = new RFramework();
		RFramework.RCAssemblyInfo inf = rf.getVersion();
		if(inf.ver != null)
		{
			System.out.print("Processor Arch:" + inf.ProcArch);
			System.out.print("Version:" + inf.ver.Major + "." + inf.ver.Minor + "." + inf.ver.Revision + "." + inf.ver.Build);
		}
	}
	public final static String Version = "%APP_VERSION%";

	public static String PathToModule;
	public static RFramework.RCAssemblyInfo RC_Framework_Inf;

	@Override
	public void acceptOptions(List<String> list, File file, File file1, String s)
	{
		Turbine.PathToGame = file.getAbsolutePath();
		PathToModule = Turbine.PathToGame + "\\mods\\Turbine";

		//RC_Framework_Inf = new RFramework().getVersion();

		if(RC_Framework_Inf == null)
		{
			Turbine.LogInfo("#*************#TurbineTweaker-BOOT#******************#");
			Turbine.LogInfo("# ERROR CODE - NOT FOUND .NET RC.CORE				  #");
			Turbine.LogInfo("#****************************************************#");
		}
		else
		{
			Turbine.LogInfo("#*************#TurbineTweaker-BOOT#******************#");
			Turbine.LogInfo(("# Load Turbine (RC.RFramework) - 8.2.1.5525		   #").replace("8.2.1.5525", RC_Framework_Inf.ver.Major + "." + RC_Framework_Inf.ver.Minor + "." + RC_Framework_Inf.ver.Revision + "." + RC_Framework_Inf.ver.Build));
			Turbine.LogInfo("#****************************************************#");
		}
	}

	@Override
	public void injectIntoClassLoader(LaunchClassLoader launchClassLoader)
	{
		Turbine.LogInfo("#*************#TurbineTweaker-INJECT#*****************#");
		Turbine.LogInfo("# Inject List Empty! 								   #");
		Turbine.LogInfo("#*****************************************************#");
	}

	@Override
	public String getLaunchTarget()
	{
		return "net.minecraft.client.Minecraft";
	}

	@Override
	public String[] getLaunchArguments()
	{
		return new String[0];
	}
}
