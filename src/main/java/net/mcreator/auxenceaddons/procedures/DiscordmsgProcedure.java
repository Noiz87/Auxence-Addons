package net.mcreator.auxenceaddons.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.auxenceaddons.AuxenceAddonsMod;

import java.util.Map;

public class DiscordmsgProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AuxenceAddonsMod.LOGGER.warn("Failed to load dependency entity for procedure Discordmsg!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performPrefixedCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"tellraw @p [\"\",{\"text\":\"\\u27a1 Entra nel Discord ufficiale di Auxence Reborn \\u2b05\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" \\u21d2 \"},{\"text\":\"clicca qui! \\u21d0\",\"bold\":true,\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://discord.gg/wATyffWWWn\"}}]");
		}
	}
}
