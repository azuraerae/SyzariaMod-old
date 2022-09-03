package com.lynxian.syzaria.mod.base.tools;

import com.lynxian.syzaria.mod.main;

import net.minecraft.item.ItemHoe;

public class BaseHoe extends ItemHoe{

    public BaseHoe(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(main.CTools);
    }
    
}
