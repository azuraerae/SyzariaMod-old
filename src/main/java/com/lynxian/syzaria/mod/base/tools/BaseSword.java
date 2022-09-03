package com.lynxian.syzaria.mod.base.tools;

import com.lynxian.syzaria.mod.main;

import net.minecraft.item.ItemSword;

public class BaseSword extends ItemSword{

    public BaseSword(String name, ToolMaterial material) {
        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(main.CFight);
    }
    
}
