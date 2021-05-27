package com.gigabyte2048.GemOPlenty.core.init;

import com.gigabyte2048.GemOPlenty.GemOPlenty;
import com.gigabyte2048.GemOPlenty.common.blocks.StoneDoor;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,GemOPlenty.MOD_ID);
	
	public static final RegistryObject<Block> JUMPER_BLOCK = BLOCKS.register("jumper_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.WOOL, MaterialColor.BLUE)
					.jumpFactor(15).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.STONE).hardnessAndResistance(15f, 30f).setRequiresTool()));
	
	public static final RegistryObject<Block> AMETHYSYT_BLOCK = BLOCKS.register("amethyst_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> TOPAZ_BLOCK = BLOCKS.register("topaz_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> AQUAMARINE_BLOCK = BLOCKS.register("aquamarine_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> GAlAXITE_BLOCK = BLOCKS.register("galaxite_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> GARNET_BLOCK = BLOCKS.register("garnet_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> JASPER_BLOCK = BLOCKS.register("jasper_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> OPAL_BLOCK = BLOCKS.register("opal_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> MALACHITE_BLOCK = BLOCKS.register("malachite_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> PEARL_BLOCK = BLOCKS.register("pearl_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> JADE_BLOCK = BLOCKS.register("jade_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(5f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> BLUE_JADE_BLOCK = BLOCKS.register("blue_jade_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(5f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> GREEN_JADE_BLOCK = BLOCKS.register("green_jade_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(5f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> AZURITE_BLOCK = BLOCKS.register("azurite_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(5f, 20f).setRequiresTool()));
	
	//ORES
	public static final RegistryObject<Block> AMETHYSYT_ORE = BLOCKS.register("amethyst_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.WOOL, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> TOPAZ_ORE = BLOCKS.register("topaz_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> AQUAMARINE_ORE = BLOCKS.register("aquamarine_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> GAlAXITE_ORE = BLOCKS.register("galaxite_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> GARNET_ORE = BLOCKS.register("garnet_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> JASPER_ORE = BLOCKS.register("jasper_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> OPAL_ORE = BLOCKS.register("opal_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> MALACHITE_ORE = BLOCKS.register("malachite_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(10f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> JADE_ORE = BLOCKS.register("jade_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(5f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> BLUE_JADE_ORE = BLOCKS.register("blue_jade_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(5f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> GREEN_JADE_ORE = BLOCKS.register("green_jade_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(5f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> AZURITE_ORE = BLOCKS.register("azurite_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(5f, 20f).setRequiresTool()));
	public static final RegistryObject<Block> PEARL_ORE = BLOCKS.register("pearl_ore", 
			() -> new Block(AbstractBlock.Properties.create(Material.CLAY, MaterialColor.BLUE)
					.harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.METAL).hardnessAndResistance(5f, 20f).setRequiresTool()));
	
	//BIOME
	public static final RegistryObject<Block> MOON_ROCK = BLOCKS.register("moon_rock", 
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE)
					.jumpFactor(5).harvestTool(ToolType.PICKAXE).harvestLevel(2).sound(SoundType.NETHER_BRICK).hardnessAndResistance(5f, 20f).setRequiresTool()));
	
	public static final RegistryObject<Block> STONE_DOOR = BLOCKS.register("stone_door",
			() -> new StoneDoor(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLACK)
					.harvestTool(ToolType.PICKAXE).harvestLevel(1).sound(SoundType.STONE).hardnessAndResistance(3f, 10f).setRequiresTool()));

}
