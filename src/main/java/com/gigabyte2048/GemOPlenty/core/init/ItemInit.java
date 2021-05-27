package com.gigabyte2048.GemOPlenty.core.init;

import com.gigabyte2048.GemOPlenty.GemOPlenty;
import com.gigabyte2048.GemOPlenty.armor.ModArmorMaterial;
import com.gigabyte2048.GemOPlenty.armor.ModArmorMaterialt;
import com.gigabyte2048.GemOPlenty.common.items.AmethystRing;
import com.gigabyte2048.GemOPlenty.common.items.AquamarineRing;
import com.gigabyte2048.GemOPlenty.common.items.AzuriteRing;
import com.gigabyte2048.GemOPlenty.common.items.BlueJadeRing;
import com.gigabyte2048.GemOPlenty.common.items.GarnetRing;
import com.gigabyte2048.GemOPlenty.common.items.GenericAxe;
import com.gigabyte2048.GemOPlenty.common.items.GenericHoe;
import com.gigabyte2048.GemOPlenty.common.items.GenericPickaxe;
import com.gigabyte2048.GemOPlenty.common.items.GenericShovel;
import com.gigabyte2048.GemOPlenty.common.items.GreenJadeRing;
import com.gigabyte2048.GemOPlenty.common.items.JadeRing;
import com.gigabyte2048.GemOPlenty.common.items.JasperRing;
import com.gigabyte2048.GemOPlenty.common.items.MalachiteRing;
import com.gigabyte2048.GemOPlenty.common.items.MoonSword;
import com.gigabyte2048.GemOPlenty.common.items.OpalRing;
import com.gigabyte2048.GemOPlenty.common.items.PearlRing;
import com.gigabyte2048.GemOPlenty.common.items.SapphireRing;
import com.gigabyte2048.GemOPlenty.common.items.SpecialItem;
import com.gigabyte2048.GemOPlenty.common.items.TopazRing;
import com.gigabyte2048.GemOPlenty.common.items.VibraniumSword;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
//import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GemOPlenty.MOD_ID);
	
	
	//Gems
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> GALAXITE = ITEMS.register("galaxite",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> GARNET = ITEMS.register("garnet",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> JASPER = ITEMS.register("jasper",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> JADE = ITEMS.register("jade",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> BLUE_JADE = ITEMS.register("blue_jade",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> GREEN_JADE = ITEMS.register("green_jade",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> AZURITE = ITEMS.register("azurite",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> IROLD = ITEMS.register("irold",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> VIBRANIUM = ITEMS.register("vibranium",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> IROLD_NUGGET = ITEMS.register("irold_nugget",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<Item> RING = ITEMS.register("ring",
			() -> new Item(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<Item> MOONITE = ITEMS.register("moonite",
			() -> new Item(new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	
	//Blocks
	public static final RegistryObject<BlockItem> JUMPER_BLOCK = ITEMS.register("jumper_block",
			() -> new BlockItem(BlockInit.JUMPER_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block",
			() -> new BlockItem(BlockInit.RUBY_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> SAPPHIRE_BLOCK = ITEMS.register("sapphire_block",
			() -> new BlockItem(BlockInit.SAPPHIRE_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> TOPAZ_BLOCK = ITEMS.register("topaz_block",
			() -> new BlockItem(BlockInit.TOPAZ_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> AQUAMARINE_BLOCK = ITEMS.register("aquamarine_block",
			() -> new BlockItem(BlockInit.AQUAMARINE_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> GALAXITE_BLOCK = ITEMS.register("galaxite_block",
			() -> new BlockItem(BlockInit.GAlAXITE_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> AMETHYST_BLOCK = ITEMS.register("amethyst_block",
			() -> new BlockItem(BlockInit.AMETHYSYT_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> GARNET_BLOCK = ITEMS.register("garnet_block",
			() -> new BlockItem(BlockInit.GARNET_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> JASPER_BLOCK = ITEMS.register("jasper_block",
			() -> new BlockItem(BlockInit.JASPER_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> OPAL_BLOCK = ITEMS.register("opal_block",
			() -> new BlockItem(BlockInit.OPAL_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> MALACHITE_BLOCK = ITEMS.register("malachite_block",
			() -> new BlockItem(BlockInit.MALACHITE_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> PEARL_BLOCK = ITEMS.register("pearl_block",
			() -> new BlockItem(BlockInit.PEARL_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> JADE_BLOCK = ITEMS.register("jade_block",
			() -> new BlockItem(BlockInit.JADE_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> BLUE_JADE_BLOCK = ITEMS.register("blue_jade_block",
			() -> new BlockItem(BlockInit.BLUE_JADE_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> GREEN_JADE_BLOCK = ITEMS.register("green_jade_block",
			() -> new BlockItem(BlockInit.GREEN_JADE_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	public static final RegistryObject<BlockItem> AZURITE_BLOCK = ITEMS.register("azurite_block",
			() -> new BlockItem(BlockInit.AZURITE_BLOCK.get(), new Item.Properties().group(GemOPlenty.GEMERIA_GROUP)));
	
	
	// ORES
	public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore",
			() -> new BlockItem(BlockInit.RUBY_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));	
	public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore",
			() -> new BlockItem(BlockInit.SAPPHIRE_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> TOPAZ_ORE = ITEMS.register("topaz_ore",
			() -> new BlockItem(BlockInit.TOPAZ_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> AQUAMARINE_ORE = ITEMS.register("aquamarine_ore",
			() -> new BlockItem(BlockInit.AQUAMARINE_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> GALAXITE_ORE = ITEMS.register("galaxite_ore",
			() -> new BlockItem(BlockInit.GAlAXITE_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> AMETHYST_ORE = ITEMS.register("amethyst_ore",
			() -> new BlockItem(BlockInit.AMETHYSYT_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> GARNET_ORE = ITEMS.register("garnet_ore",
			() -> new BlockItem(BlockInit.GARNET_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> JASPER_ORE = ITEMS.register("jasper_ore",
			() -> new BlockItem(BlockInit.JASPER_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> OPAL_ORE = ITEMS.register("opal_ore",
			() -> new BlockItem(BlockInit.OPAL_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> MALACHITE_ORE = ITEMS.register("malachite_ore",
			() -> new BlockItem(BlockInit.MALACHITE_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> JADE_ORE = ITEMS.register("jade_ore",
			() -> new BlockItem(BlockInit.JADE_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> BLUE_JADE_ORE = ITEMS.register("blue_jade_ore",
			() -> new BlockItem(BlockInit.BLUE_JADE_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> GREEN_JADE_ORE = ITEMS.register("green_jade_ore",
			() -> new BlockItem(BlockInit.GREEN_JADE_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> AZURITE_ORE = ITEMS.register("azurite_ore",
			() -> new BlockItem(BlockInit.AZURITE_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	public static final RegistryObject<BlockItem> PEARL_ORE = ITEMS.register("pearl_ore",
			() -> new BlockItem(BlockInit.PEARL_ORE.get(), new Item.Properties().group(GemOPlenty.ORES_GROUP)));
	
	//RINGS
	public static final RegistryObject<SpecialItem> RUBY_RING = ITEMS.register("ruby_ring", 
			() -> new SpecialItem(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<SapphireRing> SAPPHIRE_RING = ITEMS.register("sapphire_ring", 
			() -> new SapphireRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<TopazRing> TOPAZ_RING = ITEMS.register("topaz_ring", 
			() -> new TopazRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<AquamarineRing> AQUAMARINE_RING = ITEMS.register("aquamarine_ring", 
			() -> new AquamarineRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<GarnetRing> GARNET_RING = ITEMS.register("garnet_ring", 
			() -> new GarnetRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<AmethystRing> AMETHYST_RING = ITEMS.register("amethyst_ring", 
			() -> new AmethystRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<JasperRing> JASPER_RING = ITEMS.register("jasper_ring", 
			() -> new JasperRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<MalachiteRing> MALACHITE_RING = ITEMS.register("malachite_ring", 
			() -> new MalachiteRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<OpalRing> OPAL_RING = ITEMS.register("opal_ring", 
			() -> new OpalRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<PearlRing> PEARL_RING = ITEMS.register("pearl_ring", 
			() -> new PearlRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<GreenJadeRing> GREEN_JADE_RING = ITEMS.register("green_jade_ring", 
			() -> new GreenJadeRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<BlueJadeRing> BLUE_JADE_RING = ITEMS.register("blue_jade_ring", 
			() -> new BlueJadeRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<JadeRing> JADE_RING = ITEMS.register("jade_ring", 
			() -> new JadeRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	public static final RegistryObject<AzuriteRing> AZURITE_RING = ITEMS.register("azurite_ring", 
			() -> new AzuriteRing(new Item.Properties().group(GemOPlenty.RING_GROUP)));
	
	
	//TOOLS
	public static final RegistryObject<SwordItem> VIBRANIUM_SWORD = ITEMS.register("vibranium_sword", 
			() -> new VibraniumSword(new Item.Properties().group(GemOPlenty.ARMORY_GROUP)));
	public static final RegistryObject<SwordItem> MOON_SWORD = ITEMS.register("moon_sword", 
			() -> new MoonSword(new Item.Properties().group(GemOPlenty.ARMORY_GROUP)));
	
	public static final RegistryObject<PickaxeItem> VIBRANIUM_PICKAXE = ITEMS.register("vibranium_pickaxe", 
			() -> new GenericPickaxe(ItemTier.NETHERITE, 4, 2, new Item.Properties().addToolType(ToolType.PICKAXE, 4).group(GemOPlenty.ARMORY_GROUP)));
	public static final RegistryObject<ShovelItem> VIBRANIUM_SHOVEL = ITEMS.register("vibranium_shovel", 
			() -> new GenericShovel(ItemTier.NETHERITE, 3, 2, new Item.Properties().addToolType(ToolType.SHOVEL, 4).group(GemOPlenty.ARMORY_GROUP)));
	public static final RegistryObject<HoeItem> VIBRANIUM_HOE = ITEMS.register("vibranium_hoe", 
			() -> new GenericHoe(ItemTier.NETHERITE, 3, 2, new Item.Properties().addToolType(ToolType.HOE, 4).group(GemOPlenty.ARMORY_GROUP)));
	public static final RegistryObject<AxeItem> VIBRANIUM_AXE = ITEMS.register("vibranium_axe", 
			() -> new GenericAxe(ItemTier.NETHERITE, 10, 1, new Item.Properties().addToolType(ToolType.AXE, 4).group(GemOPlenty.ARMORY_GROUP)));
	
	//ARMORY
	public static final RegistryObject<ArmorItem> VIBRANIUM_HELMET = ITEMS.register("vibranium_helmet", 
			() -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.HEAD, new Item.Properties().group(GemOPlenty.ARMORY_GROUP)));
	
	public static final RegistryObject<ArmorItem> VIBRANIUM_CHESTPLATE = ITEMS.register("vibranium_chestplate", 
			() -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.CHEST, new Item.Properties().group(GemOPlenty.ARMORY_GROUP)));
	
	public static final RegistryObject<ArmorItem> VIBRANIUM_LEGGINGS = ITEMS.register("vibranium_leggings", 
			() -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.LEGS, new Item.Properties().group(GemOPlenty.ARMORY_GROUP)));
	
	public static final RegistryObject<ArmorItem> VIBRANIUM_BOOTS = ITEMS.register("vibranium_boots", 
			() -> new ArmorItem(ModArmorMaterial.VIBRANIUM, EquipmentSlotType.FEET, new Item.Properties().group(GemOPlenty.ARMORY_GROUP)));
	
	
	public static final RegistryObject<ArmorItem> MOON_HELMET = ITEMS.register("moon_helmet", 
			() -> new ArmorItem(ModArmorMaterialt.MOONITE, EquipmentSlotType.HEAD, new Item.Properties().group(GemOPlenty.ARMORY_GROUP)));
	
	public static final RegistryObject<ArmorItem> MOON_CHESTPLATE = ITEMS.register("moon_chestplate", 
			() -> new ArmorItem(ModArmorMaterialt.MOONITE, EquipmentSlotType.CHEST, new Item.Properties().group(GemOPlenty.ARMORY_GROUP)));
	
	public static final RegistryObject<ArmorItem> MOON_LEGGINGS = ITEMS.register("moon_leggings", 
			() -> new ArmorItem(ModArmorMaterialt.MOONITE, EquipmentSlotType.LEGS, new Item.Properties().group(GemOPlenty.ARMORY_GROUP)));
	
	public static final RegistryObject<ArmorItem> MOON_BOOTS = ITEMS.register("moon_boots", 
			() -> new ArmorItem(ModArmorMaterialt.MOONITE, EquipmentSlotType.FEET, new Item.Properties().group(GemOPlenty.ARMORY_GROUP)));

	
	
	public static final RegistryObject<BlockItem> MOON_ROCK = ITEMS.register("moon_rock",
			() -> new BlockItem(BlockInit.MOON_ROCK.get(), new Item.Properties().group(GemOPlenty.BIOME_GROUP)));
	public static final RegistryObject<BlockItem> STONE_DOOR = ITEMS.register("stone_door",
			() -> new BlockItem(BlockInit.STONE_DOOR.get(), new Item.Properties().group(GemOPlenty.BIOME_GROUP)));
	
	//FOOD
	public static final RegistryObject<Item> BAUGETTE = ITEMS.register("baugette",
			() -> new Item(new Item.Properties().group(GemOPlenty.BIOME_GROUP)
					.food(new Food.Builder().hunger(8).saturation(0.5f).build())));
	
	public static final RegistryObject<Item> CHEESE_BURGER = ITEMS.register("cheese_burger",
			() -> new Item(new Item.Properties().group(GemOPlenty.BIOME_GROUP)
					.food(new Food.Builder().hunger(7).saturation(1.0f).build())));
	public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
			() -> new Item(new Item.Properties().group(GemOPlenty.BIOME_GROUP)));
	
	public static final RegistryObject<Item> CHEESE_SLICE = ITEMS.register("cheese_slice",
			() -> new Item(new Item.Properties().group(GemOPlenty.BIOME_GROUP)
					.food(new Food.Builder().hunger(2).effect(() -> new EffectInstance(Effects.NAUSEA,40,3),0.5f)
							.saturation(0.5f).build())));
	
	public static final RegistryObject<Item> BAT_MEAT = ITEMS.register("bat_meat",
			() -> new Item(new Item.Properties().group(GemOPlenty.BIOME_GROUP)
					.food(new Food.Builder().hunger(2).effect(() -> new EffectInstance(Effects.POISON,600,3),1.0f)
							.saturation(0.5f).build())));
	
	public static final RegistryObject<Item> BAT_MEAT_UNCOOKED = ITEMS.register("bat_meat_uncooked",
			() -> new Item(new Item.Properties().group(GemOPlenty.BIOME_GROUP)
					.food(new Food.Builder().hunger(2).effect(() -> new EffectInstance(Effects.POISON,300,3),1.0f)
							.saturation(0.5f).build())));
	
	
	
	
		

}
