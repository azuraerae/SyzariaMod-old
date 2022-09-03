package com.lynxian.syzaria.mod.init;

import static com.lynxian.syzaria.mod.utils.r.MODID;

import com.lynxian.syzaria.mod.base.BaseArmor;
import com.lynxian.syzaria.mod.base.BaseItem;
import com.lynxian.syzaria.mod.base.berries.HealBerry;
import com.lynxian.syzaria.mod.base.berries.PoisonBerry;
import com.lynxian.syzaria.mod.base.berries.SpeedBerry;
import com.lynxian.syzaria.mod.base.tools.BaseAxe;
import com.lynxian.syzaria.mod.base.tools.BasePickaxe;
import com.lynxian.syzaria.mod.base.tools.BaseShovel;
import com.lynxian.syzaria.mod.base.tools.BaseSword;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod.EventBusSubscriber(modid = MODID)
public class SItems {
    //Materials
    public static ToolMaterial tool_tungstene = EnumHelper.addToolMaterial("tungstene_tool", 7, 5000, 15.0F, 5.0F, 20);
    public static ArmorMaterial armor_tungstene = EnumHelper.addArmorMaterial("tungstene_armor", MODID + ":tungstene", 1000, new int[]{5, 10, 13, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 10.0F);
    
    public static ToolMaterial tool_iridium = EnumHelper.addToolMaterial("iridium_tool", 8, 6000, 30.0F, 5.0F, 20);
    public static ArmorMaterial armor_iridium = EnumHelper.addArmorMaterial("iridium_armor", MODID + ":iridium", 1200, new int[]{10, 20, 17, 8}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 30.0F);

    //Normal Items    
    public static Item tungstene_ingot;
    public static Item iridium_ingot;
    public static Item amethyst_gem;
    public static Item sapphire;

    //Nuggets
    public static Item iridium_nugget;
    public static Item tungstene_nugget;

    //Food
    public static Item speed_berry;
    public static Item heal_berry;
    public static Item poison_berry;

    //Armors and Tools
    public static Item tungstene_axe;
    public static Item tungstene_hoe;
    public static Item tungstene_pickaxe;
    public static Item tungstene_shovel;
    public static Item tungstene_sword;
    public static Item iridium_axe;
    public static Item iridium_pickaxe;
    public static Item iridium_shovel;
    public static Item iridium_sword;

    public static Item tungstene_helmet;
    public static Item tungstene_chestplate;
    public static Item tungstene_leggings;
    public static Item tungstene_boots;
    public static Item iridium_helmet;
    public static Item iridium_chestplate;
    public static Item iridium_leggings;
    public static Item iridium_boots;

    public static void init() {

        tungstene_ingot = new BaseItem("tungstene_ingot");
        iridium_ingot = new BaseItem("iridium_ingot");
        amethyst_gem = new BaseItem("amethyst_gem");
        sapphire = new BaseItem("sapphire");

        iridium_nugget = new BaseItem("iridium_nugget");
        tungstene_nugget = new BaseItem("tungstene_nugget");

        speed_berry = new SpeedBerry("speed_berry", 4, false);
        heal_berry = new HealBerry("heal_berry", 4, false);
        poison_berry = new PoisonBerry("poison_berry", 4, false);

        tungstene_axe = new BaseAxe("tungstene_axe", tool_tungstene);
        tungstene_pickaxe = new BasePickaxe("tungstene_pickaxe", tool_tungstene);
        tungstene_shovel = new BaseShovel("tungstene_shovel", tool_tungstene);
        tungstene_sword = new BaseSword("tungstene_sword", tool_tungstene);
        iridium_axe = new BaseAxe("iridium_axe", tool_iridium);
        iridium_pickaxe = new BasePickaxe("iridium_pickaxe", tool_iridium);
        iridium_shovel = new BaseShovel("iridium_shovel", tool_iridium);
        iridium_sword = new BaseSword("iridium_sword", tool_iridium);

        tungstene_helmet = new BaseArmor("tungstene_helmet", armor_tungstene, 1, EntityEquipmentSlot.HEAD);
        tungstene_chestplate = new BaseArmor("tungstene_chestplate", armor_tungstene, 1, EntityEquipmentSlot.CHEST);
        tungstene_leggings = new BaseArmor("tungstene_leggings", armor_tungstene, 2, EntityEquipmentSlot.LEGS);
        tungstene_boots = new BaseArmor("tungstene_boots", armor_tungstene, 1, EntityEquipmentSlot.FEET);
        iridium_helmet = new BaseArmor("iridium_helmet", armor_iridium, 1, EntityEquipmentSlot.HEAD);
        iridium_chestplate = new BaseArmor("iridium_chestplate", armor_iridium, 1, EntityEquipmentSlot.CHEST);
        iridium_leggings = new BaseArmor("iridium_leggings", armor_iridium, 2, EntityEquipmentSlot.LEGS);
        iridium_boots = new BaseArmor("iridium_boots", armor_iridium, 1, EntityEquipmentSlot.FEET);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> e) {
        e.getRegistry().registerAll(
            tungstene_ingot, 
            iridium_ingot,
            amethyst_gem,
            sapphire,
            iridium_nugget,
            tungstene_nugget,
            speed_berry,
            heal_berry,
            poison_berry, 
            tungstene_axe, 
            tungstene_boots, 
            tungstene_chestplate, 
            tungstene_helmet,  
            tungstene_leggings, 
            tungstene_pickaxe, 
            tungstene_shovel, 
            tungstene_sword,
            iridium_axe,
            iridium_boots,
            iridium_chestplate,
            iridium_helmet,
            iridium_leggings,
            iridium_pickaxe,
            iridium_shovel,
            iridium_sword
            );
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent e) {
        registerRender(tungstene_ingot);
        registerRender(iridium_ingot);
        registerRender(amethyst_gem);
        registerRender(sapphire);
        registerRender(tungstene_nugget);
        registerRender(iridium_nugget);
        registerRender(speed_berry);
        registerRender(heal_berry);
        registerRender(poison_berry);
        registerRender(tungstene_axe);
        registerRender(tungstene_boots);
        registerRender(tungstene_chestplate);
        registerRender(tungstene_helmet);
        registerRender(tungstene_leggings);
        registerRender(tungstene_pickaxe);
        registerRender(tungstene_shovel);
        registerRender(tungstene_sword);
        registerRender(iridium_axe);
        registerRender(iridium_boots);
        registerRender(iridium_chestplate);
        registerRender(iridium_helmet);
        registerRender(iridium_leggings);
        registerRender(iridium_pickaxe);
        registerRender(iridium_shovel);
        registerRender(iridium_sword);
        
    }

    private static void registerRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
