
package net.mcreator.auxenceaddons.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.auxenceaddons.init.AuxenceAddonsModTabs;

public class GomGomItem extends Item {
	public GomGomItem() {
		super(new Item.Properties().tab(AuxenceAddonsModTabs.TAB_AUXENCE_ITEMTAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
