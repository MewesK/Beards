package net.mewk.beards.client.models;

import net.minecraft.client.model.ModelBiped;

public abstract class ModelBeard extends ModelBiped {

    private int color;

    public ModelBeard(int color, int textureWidth, int textureHeight) {
        this.color = color;
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
