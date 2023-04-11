
package net.mcreator.auxenceaddons.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.auxenceaddons.procedures.HeroshieldblockOnPlayerStoppedUsingProcedure;
import net.mcreator.auxenceaddons.init.AuxenceAddonsModTabs;

public class HeroshieldblockItem extends Item {
	public HeroshieldblockItem() {
		super(new Item.Properties().tab(AuxenceAddonsModTabs.TAB_AUXENCE_ITEMTAB).stacksTo(1).rarity(Rarity.EPIC).food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f)

				.build()));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.NONE;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 9999;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		HeroshieldblockOnPlayerStoppedUsingProcedure.execute(com.google.common.collect.ImmutableMap.<String, Object>builder().put("entity", entity).put("itemstack", itemstack).build());
	}
}
