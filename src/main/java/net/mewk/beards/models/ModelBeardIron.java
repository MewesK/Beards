package net.mewk.beards.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;

public class ModelBeardIron extends ModelBiped {
    ModelRenderer layer11;
    ModelRenderer layer21;
    ModelRenderer layer31;
    ModelRenderer layer32;
    ModelRenderer layer41;

    public ModelBeardIron() {
        textureWidth = 64;
        textureHeight = 32;

        layer11 = new ModelRenderer(this, 0, 0);
        layer11.addBox(0F, 0F, 0F, 2, 1, 1);
        layer11.setRotationPoint(-1F, 0F, -5F);
        layer11.setTextureSize(64, 32);
        layer11.mirror = true;
        setRotation(layer11, 0F, 0F, 0F);
        layer21 = new ModelRenderer(this, 0, 0);
        layer21.addBox(0F, 0F, 0F, 4, 1, 1);
        layer21.setRotationPoint(-2F, -1F, -5F);
        layer21.setTextureSize(64, 32);
        layer21.mirror = true;
        setRotation(layer21, 0F, 0F, 0F);
        layer31 = new ModelRenderer(this, 0, 0);
        layer31.addBox(0F, 0F, 0F, 1, 1, 1);
        layer31.setRotationPoint(1F, -2F, -5F);
        layer31.setTextureSize(64, 32);
        layer31.mirror = true;
        setRotation(layer31, 0F, 0F, 0F);
        layer32 = new ModelRenderer(this, 0, 0);
        layer32.addBox(0F, 0F, 0F, 1, 1, 1);
        layer32.setRotationPoint(-2F, -2F, -5F);
        layer32.setTextureSize(64, 32);
        layer32.mirror = true;
        setRotation(layer32, 0F, 0F, 0F);
        layer41 = new ModelRenderer(this, 0, 0);
        layer41.addBox(0F, 0F, 0F, 2, 1, 1);
        layer41.setRotationPoint(-1F, -3F, -5F);
        layer41.setTextureSize(64, 32);
        layer41.mirror = true;
        setRotation(layer41, 0F, 0F, 0F);

        this.bipedHead.addChild(layer11);
        this.bipedHead.addChild(layer21);
        this.bipedHead.addChild(layer31);
        this.bipedHead.addChild(layer32);
        this.bipedHead.addChild(layer41);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
