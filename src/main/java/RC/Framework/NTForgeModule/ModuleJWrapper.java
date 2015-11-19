////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.NTForgeModule;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import java.util.Collections;

@Mod(name = ModuleJWrapper.Ref.name, modid = ModuleJWrapper.Ref.modid, version = ModuleJWrapper.Ref.Version)
public class ModuleJWrapper
{
	public class Ref
	{
		public static final String Version = "2.153 Alpha";
		public static final String modid = "RC_Framework_JNI_Wrapper";
		public static final String name = "RC.JWrapper";
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
		meta.version = Ref.Version;
	}
}
