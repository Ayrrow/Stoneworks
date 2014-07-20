package com.ayrrow.Stoneworks;

import com.ayrrow.Stoneworks.proxy.IProxy;
import com.ayrrow.Stoneworks.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
public class stoneworks
{

    @Mod.Instance(Reference.MOD_ID)
    public static stoneworks instance;

    @SidedProxy(clientSide = "com.ayrrow.Stoneworks.proxy.ClientProxy", serverSide = "com.ayrrow.Stoneworks.proxy.ServerProxy")
    public static IProxy proxy;
    //Pre-Init
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {


    }

    //Init (GUI, Event Handlers, Tile Entities etc)

   @Mod.EventHandler
    public void init(FMLInitializationEvent event)
   {


   }
    //Post-Init

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {



    }
}
