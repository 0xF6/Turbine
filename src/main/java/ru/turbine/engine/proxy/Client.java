////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package ru.turbine.engine.proxy;

import cpw.mods.fml.common.FMLCommonHandler;
import ru.turbine.engine.TurbineEvent;

public class Client extends Server
{
	@Override
	public void registerEvents()
	{
		FMLCommonHandler.instance().bus().register(new TurbineEvent());
	}
}
