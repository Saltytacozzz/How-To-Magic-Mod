package com.glp.howtomagicmod.tools;

import com.glp.howtomagicmod.Main;
import com.glp.howtomagicmod.init.HtmmItems;
import com.glp.howtomagicmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class HtmmPickaxeBase extends ItemPickaxe implements IHasModel
	{

	public HtmmPickaxeBase(String name, ToolMaterial material) {
	  super(material);
		setUnlocalizedName(name);
		  setRegistryName(name);
		    setCreativeTab(Main.htmmtoolstab);
		    
		    
		 HtmmItems.ITEMS.add(this);
		 
         }
	   @Override
	     public void registerModels()
	     {
		   Main.proxy.registerItemRenderer(this, 0, "inventory");
  }
}

