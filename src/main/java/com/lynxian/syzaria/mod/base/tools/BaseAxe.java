package com.lynxian.syzaria.mod.base.tools;

import com.lynxian.syzaria.mod.main;

import net.minecraft.item.ItemAxe;

public class BaseAxe extends ItemAxe{

    public BaseAxe(String name, ToolMaterial material) {
        super(material, material.getAttackDamage(), 1.0F);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(main.CTools);
    }
    
}
