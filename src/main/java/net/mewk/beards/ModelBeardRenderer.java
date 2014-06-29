package net.mewk.beards;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import org.lwjgl.opengl.GL11;

public class ModelBeardRenderer extends ModelRenderer {

    private int color;

    public ModelBeardRenderer(ModelBase par1ModelBase, int par2, int par3, int color) {
        super(par1ModelBase, par2,par3);
        this.color = color;
    }

    @SideOnly(Side.CLIENT)
    public void render(float par1)
    {
        float r = (float) (color >> 16 & 255) / 255.0F;
        float g = (float) (color >> 8 & 255) / 255.0F;
        float b = (float) (color & 255) / 255.0F;
        GL11.glColor3f(r, g, b);

        super.render(par1);
    }
}