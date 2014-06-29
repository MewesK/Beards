package net.mewk.beards;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBeard extends ModelBiped {
    public ModelBeard() {
        textureWidth = 64;
        textureHeight = 32;

        ModelRenderer layer11 = new ModelRenderer(this, 0, 0);
        layer11.addBox(0F, 0F, 0F, 6, 1, 1);
        layer11.setRotationPoint(-3F, 0F, -5F);
        layer11.setTextureSize(64, 32);
        layer11.mirror = true;
        setRotation(layer11, 0F, 0F, 0F);
        ModelRenderer layer21 = new ModelRenderer(this, 0, 0);
        layer21.addBox(0F, 0F, 0F, 8, 1, 1);
        layer21.setRotationPoint(-4F, -1F, -5F);
        layer21.setTextureSize(64, 32);
        layer21.mirror = true;
        setRotation(layer21, 0F, 0F, 0F);
        ModelRenderer layer31 = new ModelRenderer(this, 0, 0);
        layer31.addBox(0F, 0F, 0F, 3, 1, 1);
        layer31.setRotationPoint(1F, -2F, -5F);
        layer31.setTextureSize(64, 32);
        layer31.mirror = true;
        setRotation(layer31, 0F, 0F, 0F);
        ModelRenderer layer32 = new ModelRenderer(this, 0, 0);
        layer32.addBox(0F, 0F, 0F, 3, 1, 1);
        layer32.setRotationPoint(-4F, -2F, -5F);
        layer32.setTextureSize(64, 32);
        layer32.mirror = true;
        setRotation(layer32, 0F, 0F, 0F);
        ModelRenderer layer41 = new ModelRenderer(this, 0, 0);
        layer41.addBox(0F, 0F, 0F, 1, 2, 2);
        layer41.setRotationPoint(-5F, -2F, -4F);
        layer41.setTextureSize(64, 32);
        layer41.mirror = true;
        setRotation(layer41, 0F, 0F, 0F);
        ModelRenderer layer42 = new ModelRenderer(this, 0, 0);
        layer42.addBox(0F, 0F, 0F, 1, 2, 2);
        layer42.setRotationPoint(4F, -2F, -4F);
        layer42.setTextureSize(64, 32);
        layer42.mirror = true;
        setRotation(layer42, 0F, 0F, 0F);

        this.bipedHead.addChild(layer11);
        this.bipedHead.addChild(layer21);
        this.bipedHead.addChild(layer31);
        this.bipedHead.addChild(layer32);
        this.bipedHead.addChild(layer41);
        this.bipedHead.addChild(layer42);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
