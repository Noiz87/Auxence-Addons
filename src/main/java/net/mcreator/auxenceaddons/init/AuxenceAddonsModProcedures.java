
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auxenceaddons.init;

import net.mcreator.auxenceaddons.procedures.VicinoguardiaProcedure;
import net.mcreator.auxenceaddons.procedures.JacksparrowChatProcedure;
import net.mcreator.auxenceaddons.procedures.HeroshieldblockOnPlayerStoppedUsingProcedure;
import net.mcreator.auxenceaddons.procedures.HeroshieldRightclickedProcedure;
import net.mcreator.auxenceaddons.procedures.HeroshieldRightclickedOnBlockProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class AuxenceAddonsModProcedures {
	public static void load() {
		new JacksparrowChatProcedure();
		new VicinoguardiaProcedure();
		new HeroshieldRightclickedProcedure();
		new HeroshieldblockOnPlayerStoppedUsingProcedure();
		new HeroshieldRightclickedOnBlockProcedure();
	}
}
