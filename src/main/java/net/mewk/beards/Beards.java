package net.mewk.beards;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.mewk.beards.proxy.IProxy;
import net.mewk.beards.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.MinecraftForge;

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
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        EventListener eventListener = new EventListener();
        FMLCommonHandler.instance().bus().register(eventListener);
        MinecraftForge.EVENT_BUS.register(eventListener);
        proxy.registerRenderers();

        beardLeather = new ItemBeard(ItemArmor.ArmorMaterial.CLOTH).setUnlocalizedName("beardLeather");
        GameRegistry.registerItem(beardLeather, "beardLeather");

        beardIron = new ItemBeard(ItemArmor.ArmorMaterial.IRON).setUnlocalizedName("beardIron");
        GameRegistry.registerItem(beardIron, "beardIron");

        beardGold = new ItemBeard(ItemArmor.ArmorMaterial.GOLD).setUnlocalizedName("beardGold");
        GameRegistry.registerItem(beardGold, "beardGold");

        beardDiamond = new ItemBeard(ItemArmor.ArmorMaterial.DIAMOND).setUnlocalizedName("beardDiamond");
        GameRegistry.registerItem(beardDiamond, "beardDiamond");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}