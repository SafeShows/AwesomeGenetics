package com.blackfox.awesomegenetics.blocks;

import com.blackfox.awesomegenetics.AwesomeGeneticsMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksRegistry {

    public final static DeferredRegister<Block>  BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AwesomeGeneticsMod.MOD_ID);

    public static final RegistryObject<Block> MATTER_ANALYZER = BLOCKS.register("matter_analyzer",
            () -> new MatterAnalyzer(BlockBehaviour.Properties.of(Material.STONE).strength(1.0f).noOcclusion()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
