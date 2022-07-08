package com.blackfox.awesomegenetics.events;

import com.blackfox.awesomegenetics.Items.ItemsRegistry;
import com.blackfox.awesomegenetics.Items.Scraper;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;

public class RightClickEntityEvent {

    public RightClickEntityEvent() {}

    @SubscribeEvent
    public static void entityInteract(@NotNull EntityInteract entityInteract) {
        if (entityInteract.getHand() == InteractionHand.MAIN_HAND && entityInteract.getPlayer().isLocalPlayer()) {
            Player player = entityInteract.getPlayer();
            Entity target = entityInteract.getTarget();
            if (entityInteract.getPlayer().getMainHandItem().getItem() instanceof Scraper) {
                ItemStack organicMatter = new ItemStack(ItemsRegistry.ORGANIC_MATTER.get(), 1);
                target.hurt(DamageSource.playerAttack(player), 0.5f);
                CompoundTag tag = new CompoundTag();
                tag.putString("entityName", target.getDisplayName().getString());
                organicMatter.setTag(tag);
                player.addItem(organicMatter);
                Scraper item = (Scraper) player.getMainHandItem().getItem();
                item.damageItem(player.getMainHandItem(), 1, entityInteract.getEntityLiving(), livingEntity -> {} );
            }
        }
    }
}
