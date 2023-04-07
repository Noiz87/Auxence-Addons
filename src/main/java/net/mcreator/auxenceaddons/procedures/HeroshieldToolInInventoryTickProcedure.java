package net.mcreator.auxenceaddons.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.auxenceaddons.init.AuxenceAddonsModItems;
import net.mcreator.auxenceaddons.AuxenceAddonsMod;

import java.util.Map;

public class HeroshieldToolInInventoryTickProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AuxenceAddonsMod.LOGGER.warn("Failed to load dependency entity for procedure HeroshieldToolInInventoryTick!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				AuxenceAddonsMod.LOGGER.warn("Failed to load dependency itemstack for procedure HeroshieldToolInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double sheildDamage = 0;
		double localShieldTimer = 0;
		if (entity.getExtraCustomData().getCompound("PlayerPersisted").getDouble("ShieldTimer") == 0 && itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			sheildDamage = (itemstack).getDamageValue();
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(AuxenceAddonsModItems.HEROSHIELD);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).setDamageValue((int) sheildDamage);
		} else {
			localShieldTimer = sheildDamage - 1;
			entity.getExtraCustomData().getCompound("PlayerPersisted").putDouble("ShieldTimer", localShieldTimer);
		}
	}
}
