package com.blackfox.awesomegenetics.Items;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class OrganicMatter extends Item {

    public OrganicMatter(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, @NotNull List<Component> componentList, @NotNull TooltipFlag tooltipFlag) {
        super.appendHoverText(itemStack, level, componentList, tooltipFlag);

        if (itemStack.getTag() != null) {
            String entityName = itemStack.getTag().getString("entityName");

            componentList.add(new TextComponent("§8Cell type: §7" + entityName));
        }
    }
}
