package net.mewk.beards.models;

import net.mewk.beards.ModelBeardRenderer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;

public class ModelBeardGold extends ModelBiped {
    ModelRenderer layer11;
    ModelRenderer layer21;
    ModelRenderer layer31;
    ModelRenderer layer32;
    ModelRenderer layer41;
    ModelRenderer layer42;
    ModelRenderer layer51;

    public ModelBeardGold(int color) {
        textureWidth = 64;
        textureHeight = 32;

        layer11 = new ModelBeardRenderer(this, 0, 0, color);
        layer11.addBox(0F, 0F, 0F, 6, 1, 1);
        layer11.setRotationPoint(-3F, 0F, -5F);
        layer11.setTextureSize(64, 32);
        layer11.mirror = true;
        setRotation(layer11, 0F, 0F, 0F);
        layer21 = new ModelBeardRenderer(this, 0, 0, color);
        layer21.addBox(0F, 0F, 0F, 10, 1, 1);
        layer21.setRotationPoint(-5F, -1F, -5F);
        layer21.setTextureSize(64, 32);
        layer21.mirror = true;
        setRotation(layer21, 0F, 0F, 0F);
        layer31 = new ModelBeardRenderer(this, 0, 0, color);
        layer31.addBox(0F, 0F, 0F, 4, 1, 1);
        layer31.setRotationPoint(1F, -2F, -5F);
        layer31.setTextureSize(64, 32);
        layer31.mirror = true;
        setRotation(layer31, 0F, 0F, 0F);
        layer32 = new ModelBeardRenderer(this, 0, 0, color);
        layer32.addBox(0F, 0F, 0F, 4, 1, 1);
        layer32.setRotationPoint(-5F, -2F, -5F);
        layer32.setTextureSize(64, 32);
        layer32.mirror = true;
        setRotation(layer32, 0F, 0F, 0F);
        layer41 = new ModelBeardRenderer(this, 0, 0, color);
        layer41.addBox(0F, 0F, 0F, 1, 2, 2);
        layer41.setRotationPoint(-5F, -2F, -4F);
        layer41.setTextureSize(64, 32);
        layer41.mirror = true;
        setRotation(layer41, 0F, 0F, 0F);
        layer42 = new ModelBeardRenderer(this, 0, 0, color);
        layer42.addBox(0F, 0F, 0F, 1, 2, 2);
        layer42.setRotationPoint(4F, -2F, -4F);
        layer42.setTextureSize(64, 32);
        layer42.mirror = true;
        setRotation(layer42, 0F, 0F, 0F);
        layer51 = new ModelBeardRenderer(this, 0, 0, color);
        layer51.addBox(0F, 0F, 0F, 2, 1, 1);
        layer51.setRotationPoint(-1F, -3F, -5F);
        layer51.setTextureSize(64, 32);
        layer51.mirror = true;
        setRotation(layer51, 0F, 0F, 0F);

        this.bipedHead.addChild(layer11);
        this.bipedHead.addChild(layer21);
        this.bipedHead.addChild(layer31);
        this.bipedHead.addChild(layer32);
        this.bipedHead.addChild(layer41);
        this.bipedHead.addChild(layer42);
        this.bipedHead.addChild(layer51);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
