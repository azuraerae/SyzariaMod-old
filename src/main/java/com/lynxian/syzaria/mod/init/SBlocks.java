package com.lynxian.syzaria.mod.init;

import static com.lynxian.syzaria.mod.utils.r.MODID;

import com.lynxian.syzaria.mod.base.BaseBlock;
import com.lynxian.syzaria.mod.base.BaseOre;
import com.lynxian.syzaria.mod.base.crops.HealCrop;
import com.lynxian.syzaria.mod.base.crops.PoisonCrop;
import com.lynxian.syzaria.mod.base.crops.SpeedCrop;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = MODID)
public class SBlocks {
    //Ore Blocks
    public static Block tungstene_block;
    public static Block iridium_block;
    public static Block sapphire_block;
    public static Block amethyst_block;
    
    //Ores
    public static Block chrome_ore;
    public static Block iridium_ore;
    public static Block sapphire_ore;
    public static Block amethyst_ore;

    //Crops
    public static Block speed_crop;
    public static Block heal_crop;
    public static Block poison_crop;

    public static void init() {
        tungstene_block = new BaseBlock("tungstene_block", Material.ROCK);
        iridium_block = new BaseBlock("iridium_block", Material.ROCK);
        sapphire_block = new BaseBlock("sapphire_block", Material.ROCK);
        amethyst_block = new BaseBlock("amethyst_block", Material.ROCK);

        chrome_ore = new BaseOre("chrome_ore", 4);
        sapphire_ore = new BaseOre("sapphire_ore", 7, 1, 3);
        amethyst_ore = new BaseOre("amethyst_ore", 7, 1, 3);
        iridium_ore = new BaseOre("iridium_ore", 8);

        speed_crop = new SpeedCrop("speed_crop");
        heal_crop = new HealCrop("heal_crop");
        poison_crop = new PoisonCrop("poison_crop");

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e){
        e.getRegistry().registerAll(tungstene_block, iridium_block, sapphire_block, amethyst_block, chrome_ore, iridium_ore, sapphire_ore, amethyst_ore, speed_crop, heal_crop, poison_crop);
    }

    @SubscribeEvent
    public static void registerItemBlock(RegistryEvent.Register<Item> e){
        e.getRegistry().registerAll(
            new ItemBlock(tungstene_block).setRegistryName(tungstene_block.getRegistryName()),
            new ItemBlock(chrome_ore).setRegistryName(chrome_ore.getRegistryName()),
            new ItemBlock(sapphire_ore).setRegistryName(sapphire_ore.getRegistryName()),
            new ItemBlock(amethyst_ore).setRegistryName(amethyst_ore.getRegistryName()),
            new ItemBlock(iridium_ore).setRegistryName(iridium_ore.getRegistryName()),
            new ItemBlock(iridium_block).setRegistryName(iridium_block.getRegistryName()),
            new ItemBlock(sapphire_block).setRegistryName(sapphire_block.getRegistryName()),
            new ItemBlock(amethyst_block).setRegistryName(amethyst_block.getRegistryName())

            );
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent e) {
        registerRender(Item.getItemFromBlock(tungstene_block));
        registerRender(Item.getItemFromBlock(chrome_ore));
        registerRender(Item.getItemFromBlock(sapphire_ore));
        registerRender(Item.getItemFromBlock(amethyst_ore));
        registerRender(Item.getItemFromBlock(iridium_ore));
        registerRender(Item.getItemFromBlock(iridium_block));
        registerRender(Item.getItemFromBlock(sapphire_block));
        registerRender(Item.getItemFromBlock(amethyst_block));

    }

    private static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}


