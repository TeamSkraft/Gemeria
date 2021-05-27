package com.gigabyte2048.GemOPlenty.common.items;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class GenericPickaxe extends PickaxeItem{

	public GenericPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

}
