////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package ru.turbine.engine;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import ru.turbine.launch.TurbineTweaker;
import ru.turbine.lib.Render;

import java.util.ArrayList;

public class TurbineEvent
{
	private final Minecraft mc = Minecraft.getMinecraft();

	@SubscribeEvent
	public void onUpdate(TickEvent.RenderTickEvent event)
	{
		if(event.phase == TickEvent.Phase.END)
		{
			GuiScreen guiscreen = Minecraft.getMinecraft().currentScreen;
			if(guiscreen instanceof GuiMainMenu)
			{
				ArrayList<String> lst = new ArrayList<String>();
				lst.add("16 plugin §4loaded§r, 14 plugin §9active§r");
				lst.add("Turbine " + Turbine.Ref.version);
				lst.add("RC.Framework 8.1.2.5700");
				Render.RenderString(lst, true);
			}
		}
	}
}
