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

@Mod(name = ModuleRCDesign.Ref.name, modid = ModuleRCDesign.Ref.modid)
public class ModuleRCDesign
{
	public class Ref
	{
		public static final String modid = "RCDesign";
		public static final String name = "RC.Design";
	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		this.getModMeta(event.getModMetadata());
	}

	private void getModMeta(ModMetadata meta)
	{
		meta.description = "CSharp Power!";
		meta.credits = "By Whisper";
		meta.dependencies = Collections.singletonList((ArtifactVersion)new ArtifactVersionRCFramework());
		meta.logoFile = "Image\\logo.rc.framework.png";
		meta.authorList = Collections.singletonList("Whisper");
		meta.name = Ref.name;
		meta.modId = Ref.modid;
	}
}