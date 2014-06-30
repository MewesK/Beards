package net.mewk.beards.client.models;

import net.mewk.beards.client.renderer.ModelBeardRenderer;
import net.minecraft.client.model.ModelRenderer;

public class ModelBeardLeather extends ModelBeard {

    public ModelBeardLeather(int color, int textureWidth, int textureHeight) {
        super(color, textureWidth, textureHeight);

        ModelRenderer layer31 = new ModelBeardRenderer(this);
        layer31.addBox(0F, 0F, 0F, 1, 1, 1);
        layer31.setRotationPoint(1F, -2F, -5F);
        layer31.setTextureSize(textureWidth, textureHeight);
        ModelRenderer layer32 = new ModelBeardRenderer(this);
        layer32.addBox(0F, 0F, 0F, 1, 1, 1);
        layer32.setRotationPoint(-2F, -2F, -5F);
        layer32.setTextureSize(textureWidth, textureHeight);
        ModelRenderer layer41 = new ModelBeardRenderer(this);
        layer41.addBox(0F, 0F, 0F, 2, 1, 1);
        layer41.setRotationPoint(-1F, -3F, -5F);
        layer41.setTextureSize(textureWidth, textureHeight);

        this.bipedHead.addChild(layer31);
        this.bipedHead.addChild(layer32);
        this.bipedHead.addChild(layer41);
    }
}
