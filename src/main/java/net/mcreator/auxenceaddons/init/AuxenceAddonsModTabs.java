
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auxenceaddons.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class AuxenceAddonsModTabs {
	public static CreativeModeTab TAB_AUXENCE_MOBTAB;
	public static CreativeModeTab TAB_AUXENCE_ITEMTAB;
	public static CreativeModeTab TAB_NPC;

	public static void load() {
		TAB_AUXENCE_MOBTAB = FabricItemGroupBuilder.create(new ResourceLocation("auxence_addons", "auxence_mobtab")).icon(() -> new ItemStack(Items.TOTEM_OF_UNDYING)).build();
		TAB_AUXENCE_ITEMTAB = FabricItemGroupBuilder.create(new ResourceLocation("auxence_addons", "auxence_itemtab")).icon(() -> new ItemStack(Items.RECOVERY_COMPASS)).build();
		TAB_NPC = FabricItemGroupBuilder.create(new ResourceLocation("auxence_addons", "npc")).icon(() -> new ItemStack(Items.SPIDER_SPAWN_EGG)).build();
	}
}
