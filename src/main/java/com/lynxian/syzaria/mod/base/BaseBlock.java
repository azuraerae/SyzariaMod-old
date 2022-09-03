package com.lynxian.syzaria.mod.base;

import com.lynxian.syzaria.mod.main;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BaseBlock extends Block{

    public BaseBlock(String name, Material materialIn) {
        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(main.CBlocks);
    }

}
