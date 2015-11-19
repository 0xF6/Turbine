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

@Mod(name = ModuleRCExtension.Ref.name, modid = ModuleRCExtension.Ref.modid)
public class ModuleRCExtension
{
	public class Ref
	{
		public static final String modid = "RCExtension";
		public static final String name = "RC.Extension";
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
		meta.credits = "By Whisper";
		meta.dependencies = Collections.singletonList((ArtifactVersion)new ArtifactVersionRCFramework());
		meta.logoFile = "Image\\logo.rc.framework.png";
		meta.authorList = Collections.singletonList("Whisper");
		meta.description = "CSharp Power!";

	}
}