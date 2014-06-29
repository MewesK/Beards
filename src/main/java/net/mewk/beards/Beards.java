package net.mewk.beards;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.mewk.beards.proxy.IProxy;
import net.mewk.beards.reference.Reference;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Beards {
    @Mod.Instance(Reference.MOD_ID)
    public static Beards instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    public static Item beard;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        beard = new ItemBeard().setUnlocalizedName("beard");
        GameRegistry.registerItem(beard, "beard");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}