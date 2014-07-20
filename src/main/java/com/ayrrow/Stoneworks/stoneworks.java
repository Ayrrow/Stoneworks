package com.ayrrow.Stoneworks;

/**
 * Created by Ayrrow on 20/07/2014.
 */

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="stoneworks", name="Stoneworks", version="0.1a")
public class stoneworks
{

    @Mod.Instance("stoneworks")
    public static stoneworks instance;

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
