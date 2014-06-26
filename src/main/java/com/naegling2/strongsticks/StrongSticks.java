package com.naegling2.strongsticks;

import com.naegling2.strongsticks.proxy.IProxy;
import com.naegling2.strongsticks.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class StrongSticks {

    @Mod.Instance(Reference.MOD_ID)
    public static StrongSticks instance;

    @SidedProxy(clientSide = "com.naegling2.strongsticks.proxy.ClientProxy", serverSide = "com.naegling2.strongsticks.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
