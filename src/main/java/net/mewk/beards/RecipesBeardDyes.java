package net.mewk.beards;

import net.minecraft.block.BlockColored;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.RecipesArmorDyes;
import net.minecraft.world.World;

import java.util.ArrayList;

public class RecipesBeardDyes extends RecipesArmorDyes {
    @Override
    public boolean matches(InventoryCrafting par1InventoryCrafting, World par2World) {
        ItemStack itemStack = null;
        ArrayList arraylist = new ArrayList();

        for (int i = 0; i < par1InventoryCrafting.getSizeInventory(); ++i) {
            ItemStack itemStack1 = par1InventoryCrafting.getStackInSlot(i);

            if (itemStack1 != null) {
                if (itemStack1.getItem() instanceof ItemBeard) {
                    if (itemStack != null) {
                        return false;
                    }

                    itemStack = itemStack1;
                } else {
                    if (itemStack1.getItem() != Items.dye) {
                        return false;
                    }

                    arraylist.add(itemStack1);
                }
            }
        }

        return itemStack != null && !arraylist.isEmpty();
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting par1InventoryCrafting) {
        ItemBeard itemBeard = null;
        ItemStack itemStack = null;
        int[] color = new int[3];

        int i = 0;
        int j = 0;
        int k;
        int l;
        int l1;
        float f;
        float f1;

        for (k = 0; k < par1InventoryCrafting.getSizeInventory(); ++k) {
            ItemStack itemStack1 = par1InventoryCrafting.getStackInSlot(k);

            if (itemStack1 != null) {
                if (itemStack1.getItem() instanceof ItemBeard) {
                    itemBeard = (ItemBeard) itemStack1.getItem();

                    if (itemStack != null) {
                        return null;
                    }

                    itemStack = itemStack1.copy();
                    itemStack.stackSize = 1;

                    if (itemBeard.hasColor(itemStack1)) {
                        l = itemBeard.getColor(itemStack);
                        f = (float) (l >> 16 & 255) / 255.0F;
                        f1 = (float) (l >> 8 & 255) / 255.0F;
                        float f2 = (float) (l & 255) / 255.0F;
                        i = (int) ((float) i + Math.max(f, Math.max(f1, f2)) * 255.0F);
                        color[0] = (int) ((float) color[0] + f * 255.0F);
                        color[1] = (int) ((float) color[1] + f1 * 255.0F);
                        color[2] = (int) ((float) color[2] + f2 * 255.0F);
                        ++j;
                    }
                } else {
                    if (itemStack1.getItem() != Items.dye) {
                        return null;
                    }

                    float[] afloat = EntitySheep.fleeceColorTable[BlockColored.func_150032_b(itemStack1.getItemDamage())];
                    int j1 = (int) (afloat[0] * 255.0F);
                    int k1 = (int) (afloat[1] * 255.0F);
                    l1 = (int) (afloat[2] * 255.0F);
                    i += Math.max(j1, Math.max(k1, l1));
                    color[0] += j1;
                    color[1] += k1;
                    color[2] += l1;
                    ++j;
                }
            }
        }

        if (itemBeard == null) {
            return null;
        } else {
            k = color[0] / j;
            int i1 = color[1] / j;
            l = color[2] / j;
            f = (float) i / (float) j;
            f1 = (float) Math.max(k, Math.max(i1, l));
            k = (int) ((float) k * f / f1);
            i1 = (int) ((float) i1 * f / f1);
            l = (int) ((float) l * f / f1);
            l1 = (k << 8) + i1;
            l1 = (l1 << 8) + l;
            itemBeard.func_82813_b(itemStack, l1);
            return itemStack;
        }
    }
}
