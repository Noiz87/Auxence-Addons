
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auxenceaddons.init;

import net.mcreator.auxenceaddons.procedures.VicinoguardiaProcedure;
import net.mcreator.auxenceaddons.procedures.JacksparrowChatProcedure;
import net.mcreator.auxenceaddons.procedures.HeroshieldatttackedProcedure;
import net.mcreator.auxenceaddons.procedures.HeroshieldToolInInventoryTickProcedure;
import net.mcreator.auxenceaddons.procedures.HeroshieldRightclickedProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class AuxenceAddonsModProcedures {
	public static void load() {
		new JacksparrowChatProcedure();
		new VicinoguardiaProcedure();
		new HeroshieldToolInInventoryTickProcedure();
		new HeroshieldRightclickedProcedure();
		new HeroshieldatttackedProcedure();
	}
}
