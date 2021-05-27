	package com.gigabyte2048.GemOPlenty;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.gigabyte2048.GemOPlenty.core.init.BlockInit;
import com.gigabyte2048.GemOPlenty.core.init.ItemInit;

import com.gigabyte2048.GemOPlenty.world.OreGeneration;
//import com.gigabyte2048.GemOPlenty.world.BiomeInit;
//import com.gigabyte2048.GemOPlenty.core.init.SurfaceBuilderInit;



import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(GemOPlenty.MOD_ID)
public class GemOPlenty {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "gemeria";
    
    public static final ItemGroup GEMERIA_GROUP = new GemeriaGroupa("gemeriatab");
    public static final ItemGroup RING_GROUP = new GemeriaGroupb("ringstab");
    public static final ItemGroup ORES_GROUP = new GemeriaGroupc("orestab");
    public static final ItemGroup ARMORY_GROUP = new GemeriaGroupd("armorytab");
    public static final ItemGroup BIOME_GROUP = new GemeriaGroupe("biometab");
    

    public GemOPlenty() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
    	bus.addListener(this::setup);
    	
        
    	ItemInit.ITEMS.register(bus);
    	BlockInit.BLOCKS.register(bus);
    	//SurfaceBuilderInit.SURFACE_BUILDERS.register(bus);

    	
    	
    	
    	MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);
    	   
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }
    
    public static class	GemeriaGroupa extends ItemGroup {

		public GemeriaGroupa(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.VIBRANIUM.get().getDefaultInstance();
		}
    }
    public static class GemeriaGroupb extends ItemGroup{

		public GemeriaGroupb(String label) {
			super(label);
		}
		@Override
		public ItemStack createIcon() {
			return ItemInit.RING.get().getDefaultInstance();
		}   	
    }
    public static class GemeriaGroupc extends ItemGroup{

		public GemeriaGroupc(String label) {
			super(label);
		}
		@Override
		public ItemStack createIcon() {
			return ItemInit.AMETHYST_ORE.get().getDefaultInstance();
		}
	}
    public static class GemeriaGroupd extends ItemGroup{

		public GemeriaGroupd(String label) {
			super(label);
		}
		@Override
		public ItemStack createIcon() {
			return ItemInit.VIBRANIUM_SWORD.get().getDefaultInstance();
		}
    }
    public static class GemeriaGroupe extends ItemGroup{

		public GemeriaGroupe(String label) {
			super(label);
		}
		@Override
		public ItemStack createIcon() {
			return ItemInit.MOON_ROCK.get().getDefaultInstance();
		}
    }
}
