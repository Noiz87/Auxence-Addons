
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auxenceaddons.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.auxenceaddons.block.GuardblockBlock;
import net.mcreator.auxenceaddons.AuxenceAddonsMod;

public class AuxenceAddonsModBlocks {
	public static Block GUARDBLOCK;

	public static void load() {
		GUARDBLOCK = Registry.register(Registry.BLOCK, new ResourceLocation(AuxenceAddonsMod.MODID, "guardblock"), new GuardblockBlock());
	}

	public static void clientLoad() {
		GuardblockBlock.clientInit();
	}
}
