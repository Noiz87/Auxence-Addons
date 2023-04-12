
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auxenceaddons.init;

import net.mcreator.auxenceaddons.command.DiscordCommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class AuxenceAddonsModCommands {
	public static void load() {
		CommandRegistrationCallback.EVENT.register((dispatcher, commandBuildContext, dedicated) -> {
			DiscordCommand.register(dispatcher, commandBuildContext);
		});
	}
}
