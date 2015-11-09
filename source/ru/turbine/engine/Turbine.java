////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////
package ru.turbine.engine;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Turbine
{
	public static final String TURBINE_VERSION = "0.0.1";
	public static final String MINE_VERSION = "1.7.10";
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
