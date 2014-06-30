package net.mewk.beards.client.renderer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.mewk.beards.client.models.ModelBeard;
import net.minecraft.client.model.ModelRenderer;
import org.lwjgl.opengl.GL11;

public class ModelBeardRenderer extends ModelRenderer {

    private ModelBeard baseModel;

    public ModelBeardRenderer(ModelBeard par1ModelBase) {
        super(par1ModelBase, 0, 0);

        this.rotateAngleX = 0F;
        this.rotateAngleY = 0F;
        this.rotateAngleZ = 0F;
        this.mirror = true;

        this.baseModel = par1ModelBase;
    }

    @SideOnly(Side.CLIENT)
    public void render(float par1) {
        int color = this.baseModel.getColor();

        float r = (float) (color >> 16 & 255) / 255.0F;
        float g = (float) (color >> 8 & 255) / 255.0F;
        float b = (float) (color & 255) / 255.0F;
        GL11.glColor3f(r, g, b);

        super.render(par1);
    }
}