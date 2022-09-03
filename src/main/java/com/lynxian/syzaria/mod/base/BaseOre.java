package com.lynxian.syzaria.mod.base;

import java.util.Random;

import com.lynxian.syzaria.mod.main;
import com.lynxian.syzaria.mod.init.SBlocks;
import com.lynxian.syzaria.mod.init.SItems;

import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BaseOre extends BlockOre{
    
    private boolean smeltable = true;
    private int minDrop;
    private int maxDrop;

    public BaseOre(String name, int harvestLevel) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setHarvestLevel("pickaxe", harvestLevel);
        setCreativeTab(main.CBlocks);
    }

    public BaseOre(String name, int harvestLevel, int minDrop, int maxDrop) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setHarvestLevel("pickaxe", harvestLevel);
        setCreativeTab(main.CBlocks);

        this.smeltable = false;
        this.minDrop = minDrop;
        this.maxDrop = maxDrop;
    }

    @Override
    public Item getItemDropped(IBlockState s, Random r, int fortune){
        if(this == SBlocks.sapphire_ore) {
            return SItems.sapphire;
        } else if(this == SBlocks.amethyst_ore) {
            return SItems.amethyst_gem;
        } else {
            return Item.getItemFromBlock(this);
        }
    }

    @Override
    public int quantityDropped(Random random) {
        return this.smeltable ? 1 : this.minDrop + random.nextInt(this.maxDrop - this.minDrop);
    }
    
    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        Random r = world instanceof World ? ((World)world).rand : new Random();

        if(this.getItemDropped(state, r, fortune) != Item.getItemFromBlock(this)){
            //As long as drop == ore xp WILL be dropped; add if statement if behavior not wanted.
                return MathHelper.getInt(r, 5, 20);
        }

        return 0;
    }
}
