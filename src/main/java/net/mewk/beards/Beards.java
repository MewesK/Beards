package net.mewk.beards;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.mewk.beards.proxy.IProxy;
import net.mewk.beards.reference.Reference;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.RecipeSorter;
import net.minecraftforge.oredict.ShapedOreRecipe;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Beards {
    @Mod.Instance(Reference.MOD_ID)
    public static Beards instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    public static Item beardLeather;
    public static Item beardIron;
    public static Item beardGold;
    public static Item beardDiamond;

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        beardLeather = new ItemBeard(ItemArmor.ArmorMaterial.CLOTH).setUnlocalizedName("beardLeather");
        GameRegistry.registerItem(beardLeather, "beardLeather");
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(beardLeather, " h ", "w w", "www", 'w', Blocks.wool, 'h', Items.leather_helmet));

        beardIron = new ItemBeard(ItemArmor.ArmorMaterial.IRON).setUnlocalizedName("beardIron");
        GameRegistry.registerItem(beardIron, "beardIron");
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(beardIron, " h ", "w w", "www", 'w', Blocks.wool, 'h', Items.iron_helmet));

        beardGold = new ItemBeard(ItemArmor.ArmorMaterial.GOLD).setUnlocalizedName("beardGold");
        GameRegistry.registerItem(beardGold, "beardGold");
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(beardGold, " h ", "w w", "www", 'w', Blocks.wool, 'h', Items.golden_helmet));

        beardDiamond = new ItemBeard(ItemArmor.ArmorMaterial.DIAMOND).setUnlocalizedName("beardDiamond");
        GameRegistry.registerItem(beardDiamond, "beardDiamond");
        CraftingManager.getInstance().getRecipeList().add(new ShapedOreRecipe(beardDiamond, " h ", "w w", "www", 'w', Blocks.wool, 'h', Items.diamond_helmet));

        GameRegistry.addRecipe(new RecipesBeardDyes());
        RecipeSorter.register("beardDyes", RecipesBeardDyes.class, RecipeSorter.Category.SHAPELESS, "after:minecraft:shapeless");
    }
}