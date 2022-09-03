package com.lynxian.syzaria.mod.base.tools;

import com.lynxian.syzaria.mod.main;

import net.minecraft.item.ItemSpade;

public class BaseShovel extends ItemSpade{
    public BaseShovel(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(main.CTools);
    }
    
}
