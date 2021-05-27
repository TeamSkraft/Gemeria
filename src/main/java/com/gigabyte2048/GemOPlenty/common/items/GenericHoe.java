package com.gigabyte2048.GemOPlenty.common.items;

import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;

public class GenericHoe extends HoeItem{

	public GenericHoe(IItemTier itemTier, int attackDamage, float attackSpeed, Properties properties) {
		super(itemTier, attackDamage, attackSpeed, properties);
	}

}
