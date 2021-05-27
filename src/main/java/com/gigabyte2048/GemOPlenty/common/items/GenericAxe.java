package com.gigabyte2048.GemOPlenty.common.items;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class GenericAxe extends AxeItem{

	public GenericAxe(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

}
