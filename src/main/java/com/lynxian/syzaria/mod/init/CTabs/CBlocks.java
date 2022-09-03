package com.lynxian.syzaria.mod.init.CTabs;

import com.lynxian.syzaria.mod.init.SBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CBlocks extends CreativeTabs{
    public CBlocks(String name) {
        super(name);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(SBlocks.tungstene_block));
    }
    
}
