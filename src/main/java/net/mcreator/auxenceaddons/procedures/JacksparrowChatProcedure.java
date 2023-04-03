package net.mcreator.auxenceaddons.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.auxenceaddons.AuxenceAddonsMod;

import java.util.Map;

public class JacksparrowChatProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				AuxenceAddonsMod.LOGGER.warn("Failed to load dependency sourceentity for procedure JacksparrowChat!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (sourceentity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("Benvenuto/a in Auxence!"), (false));
	}
}
