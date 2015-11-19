////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package RC.Framework.NTForgeModule;

import cpw.mods.fml.common.versioning.ArtifactVersion;

public class ArtifactVersionRCFramework implements ArtifactVersion
{
	@Override
	public String getLabel()
	{
		return ModuleRCFramework.Ref.modid;
	}

	@Override
	public String getVersionString()
	{
		return ModuleRCFramework.Ref.Version;
	}

	@Override
	public boolean containsVersion(ArtifactVersion source)
	{
		return source.getVersionString().equals(ModuleRCFramework.Ref.Version);
	}

	@Override
	public String getRangeString()
	{
		return null;
	}

	@Override
	public int compareTo(ArtifactVersion o)
	{
		return 0;
	}
}
