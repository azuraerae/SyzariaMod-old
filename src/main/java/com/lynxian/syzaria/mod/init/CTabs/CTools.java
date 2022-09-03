package com.lynxian.syzaria.mod.init.CTabs;

import com.lynxian.syzaria.mod.init.SItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CTools extends CreativeTabs{

    public CTools(String name) {
        super(name);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(SItems.tungstene_pickaxe);
    }
    
}
