package com.ayrrow.Stoneworks;

/**
 * Created by Ayrrow on 20/07/2014.
 */

import com.ayrrow.Stoneworks.Proxy.IProxy;
import com.ayrrow.Stoneworks.Reference.Reference;
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

    @SidedProxy(clientSide = "com.ayrrow.Stoneworks.Proxy.ClientProxy", serverSide = "com.ayrrow.Stoneworks.Proxy.ServerProxy")
    public static IProxy proxy;
    //Pre-Inital
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {


    }

    //Inital (GUI, Event Handlers, Tile entitites etc)

   @Mod.EventHandler
    public void init(FMLInitializationEvent event)
   {


   }
    //Post-Inital

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {



    }
}
