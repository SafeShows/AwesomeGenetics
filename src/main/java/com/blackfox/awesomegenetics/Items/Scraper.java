package com.blackfox.awesomegenetics.Items;

import com.blackfox.awesomegenetics.AwesomeGeneticsMod;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openjdk.nashorn.internal.parser.JSONParser;

import javax.json.JsonObject;
import javax.json.JsonWriter;
import java.util.List;
import java.util.UUID;

public class Scraper extends Item {


    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, @NotNull List<Component> componentList, @NotNull TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, level, componentList, tooltipFlag);

        componentList.add(new TextComponent("§7Right click on a mob to get there organic matter."));
    }

    public Scraper(Properties properties) {
        super(properties);
    }
}
