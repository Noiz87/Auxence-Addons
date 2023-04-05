
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auxenceaddons.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.auxenceaddons.item.GomGomItem;
import net.mcreator.auxenceaddons.item.CoinironItem;
import net.mcreator.auxenceaddons.item.CoingoldItem;
import net.mcreator.auxenceaddons.item.CoinemeraldItem;
import net.mcreator.auxenceaddons.item.CoindiamondItem;
import net.mcreator.auxenceaddons.item.CoincopperItem;
import net.mcreator.auxenceaddons.AuxenceAddonsMod;

public class AuxenceAddonsModItems {
	public static Item GUARDIA_SPAWN_EGG;
	public static Item GOM_GOM;
	public static Item GOLEMDIROCCIA_SPAWN_EGG;
	public static Item VENDOR_SPAWN_EGG;
	public static Item JACKSPARROW_SPAWN_EGG;
	public static Item COINCOPPER;
	public static Item COINIRON;
	public static Item COINEMERALD;
	public static Item COINGOLD;
	public static Item COINDIAMOND;

	public static void load() {
		GUARDIA_SPAWN_EGG = Registry.register(Registry.ITEM, new ResourceLocation(AuxenceAddonsMod.MODID, "guardia_spawn_egg"),
				new SpawnEggItem(AuxenceAddonsModEntities.GUARDIA, -6684673, -1, new Item.Properties().tab(AuxenceAddonsModTabs.TAB_NPC)));
		GOM_GOM = Registry.register(Registry.ITEM, new ResourceLocation(AuxenceAddonsMod.MODID, "gom_gom"), new GomGomItem());
		GOLEMDIROCCIA_SPAWN_EGG = Registry.register(Registry.ITEM, new ResourceLocation(AuxenceAddonsMod.MODID, "golemdiroccia_spawn_egg"),
				new SpawnEggItem(AuxenceAddonsModEntities.GOLEMDIROCCIA, -16750849, -16777216, new Item.Properties().tab(AuxenceAddonsModTabs.TAB_AUXENCE_MOBTAB)));
		VENDOR_SPAWN_EGG = Registry.register(Registry.ITEM, new ResourceLocation(AuxenceAddonsMod.MODID, "vendor_spawn_egg"), new SpawnEggItem(AuxenceAddonsModEntities.VENDOR, -1, -1, new Item.Properties().tab(AuxenceAddonsModTabs.TAB_NPC)));
		JACKSPARROW_SPAWN_EGG = Registry.register(Registry.ITEM, new ResourceLocation(AuxenceAddonsMod.MODID, "jacksparrow_spawn_egg"),
				new SpawnEggItem(AuxenceAddonsModEntities.JACKSPARROW, -16763905, -13369600, new Item.Properties().tab(AuxenceAddonsModTabs.TAB_NPC)));
		COINCOPPER = Registry.register(Registry.ITEM, new ResourceLocation(AuxenceAddonsMod.MODID, "coincopper"), new CoincopperItem());
		COINIRON = Registry.register(Registry.ITEM, new ResourceLocation(AuxenceAddonsMod.MODID, "coiniron"), new CoinironItem());
		COINEMERALD = Registry.register(Registry.ITEM, new ResourceLocation(AuxenceAddonsMod.MODID, "coinemerald"), new CoinemeraldItem());
		COINGOLD = Registry.register(Registry.ITEM, new ResourceLocation(AuxenceAddonsMod.MODID, "coingold"), new CoingoldItem());
		COINDIAMOND = Registry.register(Registry.ITEM, new ResourceLocation(AuxenceAddonsMod.MODID, "coindiamond"), new CoindiamondItem());
	}
}
