//==============================================================//
//   Copyright � Of Fire Twins Wesp 2015  <ls-micro@ya.ru>      //
//                  Alise Wesp & Yuuki Wesp                     //
//==============================================================//
package RC;

public enum ProcessorArchitecture
{
	/**
	 * An unknown or unspecified combination of processor and bits-per-word.
	 */
	None(0),
	/**
	 * Neutral with respect to processor and bits-per-word.
	 */
	MSIL(1),
	/**
	 * A 32-bit Intel processor, either native or in the Windows on Windows environment
	 * on a 64-bit platform (WOW64).
	 */
	X86(2),
	/**
	 * A 64-bit Intel processor only.
	 */
	IA64(3),
	/**
	 * A 64-bit AMD processor only.
	 */
	Amd64(4),
	/**
	 * An ARM processor.
	 */
	Arm(5);
	public int ID;
	ProcessorArchitecture(int id)
	{
		this.ID = id;
	}
	public static ProcessorArchitecture valueOf(int id)
	{
		switch (id)
		{
			case 1:
				return MSIL;
			case 2:
				return X86;
			case 3:
				return IA64;
			case 4:
				return Amd64;
			case 5:
				return Arm;
			default:
				return None;
		}
	}
}
