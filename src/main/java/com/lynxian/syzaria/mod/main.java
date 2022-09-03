package com.lynxian.syzaria.mod;

import static com.lynxian.syzaria.mod.utils.r.*;

import com.lynxian.syzaria.mod.init.SBlocks;
import com.lynxian.syzaria.mod.init.SItems;
import com.lynxian.syzaria.mod.init.CTabs.CBlocks;
import com.lynxian.syzaria.mod.init.CTabs.CFight;
import com.lynxian.syzaria.mod.init.CTabs.CItems;
import com.lynxian.syzaria.mod.init.CTabs.CMisc;
import com.lynxian.syzaria.mod.init.CTabs.CTools;
import com.lynxian.syzaria.mod.init.Gen.OreGen;
import com.lynxian.syzaria.mod.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = MODID, name = NAME, version = VERSION, useMetadata = true)
public class main {

	@Mod.Instance(MODID)
	public static main instance; 

	public static CreativeTabs CItems = new CItems("syza_items_tab");
	public static CreativeTabs CBlocks = new CBlocks("syza_blocks_tab");
	public static CreativeTabs CFight = new CFight("syza_fight_tab");
	public static CreativeTabs CTools = new CTools("syza_tools_tab");
	public static CreativeTabs CMisc = new CMisc("syza_misc_tab");
	
	@SidedProxy(clientSide = cProxy, serverSide = sProxy)
	public static CommonProxy proxy; 
	
	public main() {
		SBlocks.init();
		SItems.init();
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent e) {
		proxy.Init();
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit();
	}

}

