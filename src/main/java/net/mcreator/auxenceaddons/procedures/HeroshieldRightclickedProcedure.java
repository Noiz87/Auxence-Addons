package net.mcreator.auxenceaddons.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.auxenceaddons.init.AuxenceAddonsModItems;
import net.mcreator.auxenceaddons.AuxenceAddonsMod;

import java.util.Map;

public class HeroshieldRightclickedProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AuxenceAddonsMod.LOGGER.warn("Failed to load dependency entity for procedure HeroshieldRightclicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double ShieldDamage = 0;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == AuxenceAddonsModItems.HEROSHIELD) {
			ShieldDamage = ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).getDamageValue();
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(AuxenceAddonsModItems.HERO_SHIELD_BLOCK);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).setDamageValue((int) ShieldDamage);
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AuxenceAddonsModItems.HEROSHIELD) {
			ShieldDamage = ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getDamageValue();
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(AuxenceAddonsModItems.HERO_SHIELD_BLOCK);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setDamageValue((int) ShieldDamage);
		}
	}
}
