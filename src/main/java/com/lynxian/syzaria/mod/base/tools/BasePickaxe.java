package com.lynxian.syzaria.mod.base.tools;

import com.lynxian.syzaria.mod.main;

import net.minecraft.item.ItemPickaxe;

public class BasePickaxe extends ItemPickaxe{

    public BasePickaxe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(main.CTools);
    }
    
}
