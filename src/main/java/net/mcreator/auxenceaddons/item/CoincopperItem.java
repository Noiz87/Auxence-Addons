
package net.mcreator.auxenceaddons.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.auxenceaddons.init.AuxenceAddonsModTabs;

import java.util.List;

public class CoincopperItem extends Item {
	public CoincopperItem() {
		super(new Item.Properties().tab(AuxenceAddonsModTabs.TAB_AUXENCE_ITEMTAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Una moneta di Rame"));
	}
}
