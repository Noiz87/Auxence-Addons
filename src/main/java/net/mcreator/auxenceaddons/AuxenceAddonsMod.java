/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.auxenceaddons;

import software.bernie.geckolib3.GeckoLib;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.nbt.CompoundTag;

import net.mcreator.auxenceaddons.init.AuxenceAddonsModTabs;
import net.mcreator.auxenceaddons.init.AuxenceAddonsModProcedures;
import net.mcreator.auxenceaddons.init.AuxenceAddonsModItems;
import net.mcreator.auxenceaddons.init.AuxenceAddonsModEntities;

import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.api.ModInitializer;

public class AuxenceAddonsMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "auxence_addons";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing AuxenceAddonsMod");
		AuxenceAddonsModTabs.load();

		AuxenceAddonsModEntities.load();

		AuxenceAddonsModItems.load();

		AuxenceAddonsModProcedures.load();

		GeckoLib.initialize();
		ServerPlayConnectionEvents.JOIN.register((handler, sender, server) -> {
			if (handler.getPlayer().getExtraCustomData().getCompound("PlayerPersisted").isEmpty()) {
				handler.getPlayer().getExtraCustomData().put("PlayerPersisted", new CompoundTag());
			}
			AuxenceAddonsMod.LOGGER.info(handler.getPlayer().getExtraCustomData());
		});
	}
}
