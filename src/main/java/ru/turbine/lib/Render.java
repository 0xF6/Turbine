////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////

package ru.turbine.lib;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

import java.util.ArrayList;

public class Render
{
	public static boolean isShadow = true;
	public static void RenderString(ArrayList arList, boolean isLeft)
	{
		ScaledResolution scala = new ScaledResolution(Minecraft.getMinecraft(), Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight);
		int width = scala.getScaledWidth();
		int height = scala.getScaledHeight();

		if(isLeft)
		{
			for(int x = 0; x < arList.size(); x++)
			{
				String str = (String)arList.get(x);
				if(str != null)
					Minecraft.getMinecraft().fontRenderer.drawString(str, 2, 2 + x * 10, 16777215, isShadow);
			}
		}
		else
		{
			for(int x = 0; x < arList.size(); x++)
			{
				String str = (String)arList.get(x);
				if(str != null)
				{
					int w = Minecraft.getMinecraft().fontRenderer.getStringWidth(str);
					Minecraft.getMinecraft().fontRenderer.drawString(str, width - w - 10, 2 + x * 10, 16777215, isShadow);
				}
			}
		}
	}
}
