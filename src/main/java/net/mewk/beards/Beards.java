package net.mewk.beards;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.mewk.beards.proxy.IProxy;

@Mod(modid = "Beards", name = "Beards", version = "1.7.2-0.1")
public class Beards {
    @Mod.Instance("Beards")
    public static Beards instance;

    @SidedProxy(clientSide = "net.mewk.beards.proxy.ClientProxy", serverSide = "net.mewk.beards.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}