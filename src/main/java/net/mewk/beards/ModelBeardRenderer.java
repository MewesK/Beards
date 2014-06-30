package net.mewk.beards;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import org.lwjgl.opengl.GL11;

public class ModelBeardRenderer extends ModelRenderer {

    private final int color;

    public ModelBeardRenderer(ModelBase par1ModelBase, int color) {
        super(par1ModelBase, 0, 0);
        this.color = color;
        this.rotateAngleX = 0F;
        this.rotateAngleY = 0F;
        this.rotateAngleZ = 0F;
        this.mirror = true;
    }

    @SideOnly(Side.CLIENT)
    public void render(float par1) {
        float r = (float) (color >> 16 & 255) / 255.0F;
        float g = (float) (color >> 8 & 255) / 255.0F;
        float b = (float) (color & 255) / 255.0F;
        GL11.glColor3f(r, g, b);

        super.render(par1);
    }
}