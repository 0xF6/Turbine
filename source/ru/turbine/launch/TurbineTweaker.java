//==============================================================//
//   Copyright � Of Fire Twins Wesp 2015  <ls-micro@ya.ru>      //
//                  Alise Wesp & Yuuki Wesp                     //
//==============================================================//
package ru.turbine.launch;

import RC.Framework.Extension.Debug;
import RC.Framework.Extension.System.Marshal.BitConverter;
import RC.RFramework;
import net.minecraft.launchwrapper.ITweaker;
import net.minecraft.launchwrapper.LaunchClassLoader;
import ru.turbine.engine.Turbine;

import java.io.File;
import java.util.List;
public class TurbineTweaker implements ITweaker
{
	public static String PathToModule;
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

	@Override
	public void acceptOptions(List<String> list, File file, File file1, String s)
	{
		Turbine.LogInfo("#*************#TurbineTweaker-BOOT#******************#");
		Turbine.LogInfo("# Load Turbine (RC.RFramework) - 8.2.1.5525		  #");
		Turbine.LogInfo("#****************************************************#");
		Turbine.PathToGame = file.getAbsolutePath();
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
