////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////
package ru.turbine.engine;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.turbine.engine.proxy.Server;
import ru.turbine.launch.TurbineTweaker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

@Mod(name = Turbine.Ref.name, modid = Turbine.Ref.modid, version = Turbine.Ref.version)
public class Turbine
{
	@SidedProxy(
			serverSide = "ru.turbine.engine.proxy.Server",
			clientSide = "ru.turbine.engine.proxy.Client"
	)
	public static Server proxy;
	@Mod.Instance("Turbine")
	public static Turbine intanse;
	public class Ref
	{
		public static final String version = "4.5233";
		public static final String modid = "Turbine";
		public static final String name = "Turbine - RC.Core Tweaker";
	}


	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		this.getModMeta(event.getModMetadata());
		proxy.registerEvents();
	}

	private void getModMeta(ModMetadata meta)
	{
		meta.authorList = Collections.singletonList("Whisper");
		meta.logoFile = "Image\\logo.turbine.png";
		meta.credits = "Provided by Whisper";
		meta.description = "Steam overclock!";
		meta.name = "Turbine - RC.Core Wrapper";
		meta.modId = "Turbine";
		meta.version = Ref.version;
	}
	public static String PathToGame;
	private static Logger logger = LogManager.getLogger("Turbine");

	// Logger
	public static void LogError(String msg)
	{
		logger.log(Level.ERROR, msg);
	}
	public static void LogInfo(String msg)
	{
		logger.log(Level.INFO, msg);
	}
	public static void LogWarning(String msg)
	{
		logger.log(Level.WARN, msg);
	}
}
