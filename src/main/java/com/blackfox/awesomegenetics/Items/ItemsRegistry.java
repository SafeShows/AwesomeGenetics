package com.blackfox.awesomegenetics.Items;

import com.blackfox.awesomegenetics.AwesomeGeneticsMod;
import com.blackfox.awesomegenetics.blocks.BlocksRegistry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class ItemsRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AwesomeGeneticsMod.MOD_ID);

    public static final RegistryObject<Item> SCRAPER = ITEMS.register("scraper",
            () -> new Scraper(new Item.Properties().tab(AwesomeGeneticsMod.CREATIVE_MODE_TAB).durability(125)));
    public static final RegistryObject<Item> ORGANIC_MATTER = ITEMS.register("organic_matter",
            () -> new OrganicMatter(new Item.Properties().tab(AwesomeGeneticsMod.CREATIVE_MODE_TAB)));

    public static final RegistryObject<Item> HELIX = ITEMS.register("dna_helix",
            () -> new Helix(new Item.Properties().tab(AwesomeGeneticsMod.CREATIVE_MODE_TAB)));


    // Block Items
    public static final RegistryObject<BlockItem> MATTER_ANALYSER_ITEM = ITEMS.register("matter_analyser",
            () -> new BlockItem(
                    BlocksRegistry.MATTER_ANALYSER.get(),
                    new Item.Properties().tab(AwesomeGeneticsMod.CREATIVE_MODE_TAB)
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
