package net.mewk.beards;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.lwjgl.opengl.GL11;

public class EventListener {
    @SubscribeEvent
    public void onRenderPlayer(RenderPlayerEvent.Specials.Pre event) {
        if (event.renderHelmet) {
            ItemStack itemstack = event.entityPlayer.inventory.armorItemInSlot(3);
            if (itemstack != null) {
                int color = itemstack.getItem().getColorFromItemStack(itemstack, 0);
                float r = (float) (color >> 16 & 255) / 255.0F;
                float g = (float) (color >> 8 & 255) / 255.0F;
                float b = (float) (color & 255) / 255.0F;
                GL11.glColor3f(r, g, b);
            }
        }
    }
}
