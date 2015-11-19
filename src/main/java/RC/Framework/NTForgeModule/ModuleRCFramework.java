////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.NTForgeModule;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.versioning.ArtifactVersion;

import java.util.Collections;

@Mod(name = ModuleRCFramework.Ref.name, modid = ModuleRCFramework.Ref.modid, version = ModuleRCFramework.Ref.Version)
public class ModuleRCFramework
{
	public class Ref
	{
		public static final String Version = "8.1.2.5700";
		public static final String modid = "RCFramework";
		public static final String name = "RCFramework - Core";
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		this.getModMeta(event.getModMetadata());
	}

	private void getModMeta(ModMetadata meta)
	{
		meta.name = Ref.name;
		meta.modId = Ref.modid;
		meta.logoFile = "Image\\logo.rc.framework.png";
		meta.credits = "By Whisper";
		meta.description = "CSharp Power!";
		meta.authorList = Collections.singletonList("Whisper");
	}
}
