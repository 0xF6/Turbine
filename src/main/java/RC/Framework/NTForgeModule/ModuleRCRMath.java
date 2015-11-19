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

@Mod(name = ModuleRCRMath.Ref.name, modid = ModuleRCRMath.Ref.modid)
public class ModuleRCRMath
{
	public class Ref
	{
		public static final String modid = "RCRMath";
		public static final String name = "RC.RMath";
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		this.getModMeta(event.getModMetadata());
	}

	private void getModMeta(ModMetadata meta)
	{
		meta.dependencies = Collections.singletonList((ArtifactVersion)new ArtifactVersionRCFramework());
		meta.name = Ref.name;
		meta.modId = Ref.modid;
		meta.logoFile = "Image\\logo.rc.framework.png";
		meta.credits = "By Whisper";
		meta.authorList = Collections.singletonList("Whisper");
		meta.description = "CSharp Power!";
	}
}