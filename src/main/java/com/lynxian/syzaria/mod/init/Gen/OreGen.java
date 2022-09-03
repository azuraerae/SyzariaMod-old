package com.lynxian.syzaria.mod.init.Gen;

import java.util.Random;

import com.google.common.base.Predicate;
import com.lynxian.syzaria.mod.init.SBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class OreGen implements IWorldGenerator{

    private void genModule(IBlockState state, int amount, int chance, int minY, int maxY, Predicate<IBlockState> replace, World dim, Random r, int cX,  int cZ){
        if(minY < 0 || maxY > 256 || minY > maxY)
            throw new IllegalArgumentException("Height Error Caused by genModule in class OreGen");

        WorldGenMinable gen = new WorldGenMinable(state, amount, replace);
        int heightdiff = maxY - minY + 1;
        for (int i = 0; i < chance; i++){
            int x = cX * 16 + r.nextInt(16);
            int y = minY + r.nextInt(heightdiff);
            int z = cZ * 16 + r.nextInt(16);
    
            gen.generate(dim, r, new BlockPos(x, y, z));
        }
    }


    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()) {
            //Nether
            case -1:
              break;
            //Overworld
            case 0:
            genModule(SBlocks.chrome_ore.getDefaultState(), 8, 10, 4, 30, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
            genModule(SBlocks.amethyst_ore.getDefaultState(), 4, 3, 2, 7, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
            genModule(SBlocks.sapphire_ore.getDefaultState(), 4, 3, 2, 7, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
              break;
            //End
            case 1:
              break;
            //Everything else
            case 2:
            genModule(SBlocks.iridium_ore.getDefaultState(), 8, 10, 4, 30, BlockMatcher.forBlock(Blocks.STONE), world, random, chunkX, chunkZ);
              break;
            default:
              break;
            }
    }
    
}
