package net.mewk.beards;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.mewk.beards.models.ModelBeardDiamond;
import net.mewk.beards.models.ModelBeardGold;
import net.mewk.beards.models.ModelBeardIron;
import net.mewk.beards.models.ModelBeardLeather;
import net.mewk.beards.reference.Reference;
import net.mewk.beards.util.LogHelper;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;

public class ItemBeard extends ItemArmor {
    public ItemBeard(ItemArmor.ArmorMaterial p_i45325_1_) {
        super(p_i45325_1_, 3, 0);
        setMaxStackSize(1);
        setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
        if (armorSlot == 0) {
            switch (getArmorMaterial()) {
                case CLOTH:
                    return new ModelBeardLeather();
                case IRON:
                    return new ModelBeardIron();
                case GOLD:
                    return new ModelBeardGold();
                case DIAMOND:
                    int color = itemStack.getItem().getColorFromItemStack(itemStack, 0);
                    return new ModelBeardDiamond(color);
            }
        }
        LogHelper.debug("getArmorModel with wrong slot or wrong material");
        return null;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        if (slot == 0) {
            switch (getArmorMaterial()) {
                case CLOTH:
                    return Reference.RESOURCE_PREFIX + "textures/models/beard_leather.png";
                case IRON:
                    return Reference.RESOURCE_PREFIX + "textures/models/beard_iron.png";
                case GOLD:
                    return Reference.RESOURCE_PREFIX + "textures/models/beard_gold.png";
                case DIAMOND:
                    return Reference.RESOURCE_PREFIX + "textures/models/beard_diamond.png";
            }
        }
        LogHelper.debug("getArmorTexture with wrong slot or wrong material");
        return null;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister) {
        this.itemIcon = par1IconRegister.registerIcon(Reference.RESOURCE_PREFIX + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses() {
        return true;
    }

    @Override
    public void removeColor(ItemStack par1ItemStack) {
        NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();

        if (nbttagcompound != null) {
            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");

            if (nbttagcompound1.hasKey("color")) {
                nbttagcompound1.removeTag("color");
            }
        }
    }

    @Override
    public boolean hasColor(ItemStack par1ItemStack) {
        return !par1ItemStack.hasTagCompound() ? false : (!par1ItemStack.getTagCompound().hasKey("display", 10) ? false : par1ItemStack.getTagCompound().getCompoundTag("display").hasKey("color", 3));
    }

    @Override
    public int getColor(ItemStack par1ItemStack) {
        NBTTagCompound nbttagcompound = par1ItemStack.getTagCompound();

        if (nbttagcompound == null) {
            return 10511680;
        } else {
            NBTTagCompound nbttagcompound1 = nbttagcompound.getCompoundTag("display");
            return nbttagcompound1 == null ? 10511680 : (nbttagcompound1.hasKey("color", 3) ? nbttagcompound1.getInteger("color") : 10511680);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        int j = this.getColor(par1ItemStack);
        return j < 0 ? 16777215 : j;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamageForRenderPass(int par1, int par2) {
        return this.getIconFromDamage(par1);
    }
}
