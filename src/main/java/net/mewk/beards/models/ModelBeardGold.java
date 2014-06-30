package net.mewk.beards.models;

import net.mewk.beards.ModelBeardRenderer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;

public class ModelBeardGold extends ModelBiped {

    public ModelBeardGold(int color, int textureWidth, int textureHeight) {
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;

        ModelRenderer layer11 = new ModelBeardRenderer(this, color);
        layer11.addBox(0F, 0F, 0F, 6, 1, 1);
        layer11.setRotationPoint(-3F, 0F, -5F);
        layer11.setTextureSize(textureWidth, textureHeight);
        ModelRenderer layer21 = new ModelBeardRenderer(this, color);
        layer21.addBox(0F, 0F, 0F, 10, 1, 1);
        layer21.setRotationPoint(-5F, -1F, -5F);
        layer21.setTextureSize(textureWidth, textureHeight);
        ModelRenderer layer31 = new ModelBeardRenderer(this, color);
        layer31.addBox(0F, 0F, 0F, 4, 1, 1);
        layer31.setRotationPoint(1F, -2F, -5F);
        layer31.setTextureSize(textureWidth, textureHeight);
        ModelRenderer layer32 = new ModelBeardRenderer(this, color);
        layer32.addBox(0F, 0F, 0F, 4, 1, 1);
        layer32.setRotationPoint(-5F, -2F, -5F);
        layer32.setTextureSize(textureWidth, textureHeight);
        ModelRenderer layer41 = new ModelBeardRenderer(this, color);
        layer41.addBox(0F, 0F, 0F, 1, 2, 2);
        layer41.setRotationPoint(-5F, -2F, -4F);
        layer41.setTextureSize(textureWidth, textureHeight);
        ModelRenderer layer42 = new ModelBeardRenderer(this, color);
        layer42.addBox(0F, 0F, 0F, 1, 2, 2);
        layer42.setRotationPoint(4F, -2F, -4F);
        layer42.setTextureSize(textureWidth, textureHeight);
        ModelRenderer layer51 = new ModelBeardRenderer(this, color);
        layer51.addBox(0F, 0F, 0F, 2, 1, 1);
        layer51.setRotationPoint(-1F, -3F, -5F);
        layer51.setTextureSize(textureWidth, textureHeight);

        this.bipedHead.addChild(layer11);
        this.bipedHead.addChild(layer21);
        this.bipedHead.addChild(layer31);
        this.bipedHead.addChild(layer32);
        this.bipedHead.addChild(layer41);
        this.bipedHead.addChild(layer42);
        this.bipedHead.addChild(layer51);
    }
}
