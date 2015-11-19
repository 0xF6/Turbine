////////////////////////////////////////////////////////////////////////////////
//                 Copyright (c) Of Fire Twins Wesp 2015.                      /
//                          Alise Wesp & Yuuki Wesp                            /
////////////////////////////////////////////////////////////////////////////////
package RC;

import RC.Framework.Extension.System.Int32;
import RC.Framework.Network.ArchBox;
import RC.Framework.Network.IArchBoxReader;
import RC.Framework.RException.*;
import ru.turbine.launch.TurbineTweaker;

import java.io.File;
public class RFramework
{
	public class Version
	{
		public Version()
		{ }
		/**
		 * Initializes a new instance of the System.Version class using the specified string.
		 *
		 * @param version A string containing the major, minor, build, and revision numbers, where each
		 *                number is delimited with a period character ('.').
		 * @throws FormatException 				At least one component of version does not parse to an integer.
		 * @throws ArgumentOutOfRangeException 	A major, minor, build, or revision component is less than zero.
		 * @throws ArgumentNullException 		Version is null.
		 * @throws ArgumentException 			Version has fewer than two components or more than four components.
		 * @throws OverflowException 			At least one component of version represents a number greater than Integer.MAX_VALUE.
		 */
		public Version(String version) throws FormatException, ArgumentOutOfRangeException, ArgumentNullException, ArgumentException, OverflowException
		{
			if(version == null)
				throw new ArgumentNullException("version");
			if(version.split(".").length == 0 && version.contains(".") || version.split(".").length > 4)
				throw new ArgumentException("version", "Version has fewer than two components or more than four components.");
			if(version.split(".").length == 4)
			{
				try
				{
					this.Major 		= Int32.Parse(version.split(".")[0]);
					this.Minor 		= Int32.Parse(version.split(".")[1]);
					this.Build 		= Int32.Parse(version.split(".")[2]);
					this.Revision 	= Int32.Parse(version.split(".")[3]);
				}
				catch (NumberFormatException numEx)
				{ throw new OverflowException("At least one component of version represents a number greater than Integer.MAX_VALUE."); }
				catch(Exception ignored)
				{ throw new FormatException("version", "At least one component of version does not parse to an integer."); }
				if(this.Major == 0 && this.Minor == 0 && this.Build == 0 && this.Revision == 0)
					throw new ArgumentOutOfRangeException("Major, minor, build, or revision is less than zero.");
			}
			else if(version.split(".").length == 3)
			{
				try
				{
					this.Major 		= Int32.Parse(version.split(".")[0]);
					this.Minor 		= Int32.Parse(version.split(".")[1]);
					this.Build 		= Int32.Parse(version.split(".")[2]);
				}
				catch (NumberFormatException numEx)
				{ throw new OverflowException("At least one component of version represents a number greater than Integer.MAX_VALUE."); }
				catch(Exception ignored)
				{ throw new FormatException("version", "At least one component of version does not parse to an integer."); }
				if(this.Major == 0 && this.Minor == 0 && this.Build  == 0)
					throw new ArgumentOutOfRangeException("Major, minor, or build is less than zero.");
			}
			else if(version.split(".").length == 2)
			{
				try
				{
					this.Major 		= Int32.Parse(version.split(".")[0]);
					this.Minor 		= Int32.Parse(version.split(".")[1]);
				}
				catch (NumberFormatException numEx)
				{ throw new OverflowException("At least one component of version represents a number greater than Integer.MAX_VALUE."); }
				catch(Exception ignored)
				{ throw new FormatException("version", "At least one component of version does not parse to an integer."); }
				if(this.Major == 0 && this.Minor == 0)
					throw new ArgumentOutOfRangeException("Major or minor is less than zero.");
			}
			else
				throw new FormatException("version");
		}
		/**
		 * Initializes a new instance of the Version class using the specified major
		 *
		 * @param major The major version number.
		 * @param minor The minor version number.
		 * @throws ArgumentOutOfRangeException Major or minor is less than zero.
		 */
		public Version(int major, int minor) throws ArgumentOutOfRangeException
		{
			if(major == 0 && minor == 0)
				throw new ArgumentOutOfRangeException("Major or minor is less than zero.");
			this.Major = major;
			this.Minor = minor;
		}
		/**
		 *
		 * Initializes a new instance of the System.Version class using the specified major,
		 * minor, and build values.
		 *
		 * @param major The major version number.
		 * @param minor The minor version number.
		 * @param build The build number.
		 * @throws ArgumentOutOfRangeException Major, minor, or build is less than zero.
		 */
		public Version(int major, int minor, int build) throws ArgumentOutOfRangeException
		{
			if(major == 0 && minor == 0 && build == 0)
				throw new ArgumentOutOfRangeException("Major, minor, or build is less than zero.");
			this.Major = major;
			this.Minor = minor;
			this.Build = build;
		}
		/**
		 *  Initializes a new instance of the System.Version class with the specified major,
		 *  minor, build, and revision numbers.
		 *
		 * @param major The major version number.
		 * @param minor The minor version number.
		 * @param build The build number.
		 * @param revision  The revision number.
		 * @throws ArgumentOutOfRangeException major, minor, build, or revision is less than zero.
		 */
		public Version(int major, int minor, int build, int revision) throws ArgumentOutOfRangeException
		{
			if(major == 0 && minor == 0 && build == 0 && revision == 0)
				throw new ArgumentOutOfRangeException("Major, minor, build, or revision is less than zero.");
			this.Major = major;
			this.Minor = minor;
			this.Build = build;
			this.Revision = revision;
		}

		/**
		 * Gets the value of the build component of the version number for the current Version
		 * The build number, or -1 if the build number is undefined.
		 */
		public int Build = -1;
		/**
		 * Gets the value of the major component of the version number for the current Version
		 * object.
		 * The major version number, or -1 if the major number is undefined..
		 */
		public int Major = -1;
		/**
		 * Gets the value of the minor component of the version number for the current Version
		 * object.
		 *  The minor version number, or -1 if the minor number is undefined..
		 */
		public int Minor = -1;
		/**
		 * Gets the value of the revision component of the version number for the current
		 * Version object.
		 * The revision number, or -1 if the revision number is undefined.
		 */
		public int Revision = -1;
	}
	public class RCAssemblyInfo
	{
		/**
		 * Version Assembly
		 */
		public Version ver;
		/**
		 * ProcessorArchitecture Assembly
		 */
		public ProcessorArchitecture ProcArch;
	}
	public RCAssemblyInfo getVersion()
	{
		try
		{
			RCAssemblyInfo rcAssemblyInfo = new RCAssemblyInfo();
			Version ver;

			// read signature
			byte[] arSign = getAssemblyInfo();
			IArchBoxReader reader;

			if(arSign.length != 0)
			{
				reader = ArchBox.InvokeReader(arSign);
				int major 	= reader.rInt();
				int minor 	= reader.rInt();
				int build 	= reader.rInt();
				int rev 	= reader.rInt();
				int arch 	= reader.rInt();
				ver = new Version(major, minor, build, rev);
				rcAssemblyInfo.ver = ver;
				rcAssemblyInfo.ProcArch = ProcessorArchitecture.valueOf(arch);
			}

			// end

			return rcAssemblyInfo;
		}
		catch (Exception ignored)
		{ ignored.printStackTrace();}
		return null;
	}
	public static boolean is64bitProcess()
	{
		String wow64_kernel = System.getenv("systemroot") + "\\SysWOW64\\kernel32.dll";
		if (new File(wow64_kernel).exists())
		{
			try
			{
				System.load(wow64_kernel);
			}
			catch (UnsatisfiedLinkError e)
			{
				return true;
			}
		}
		return false;
	}



	// Native
	static
	{
		if(RFramework.is64bitProcess())
			System.load(TurbineTweaker.PathToModule + "\\RC.Framework.x64.dll");
		else
			System.load(TurbineTweaker.PathToModule + "\\RC.Framework.x86.dll");
	}
	private native static byte[] getAssemblyInfo();
}
