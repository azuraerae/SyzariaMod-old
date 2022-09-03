package com.lynxian.syzaria.mod.base;

import com.lynxian.syzaria.mod.main;

import net.minecraft.item.Item;

public class BaseItem extends Item{
    public BaseItem(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(main.CItems);
    }
}
