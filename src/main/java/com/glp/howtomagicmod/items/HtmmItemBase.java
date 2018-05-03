package com.glp.howtomagicmod.items;

import com.glp.howtomagicmod.Main;
import com.glp.howtomagicmod.init.HtmmItems;
import com.glp.howtomagicmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HtmmItemBase extends Item implements IHasModel  
{

	public HtmmItemBase(String name)
	  {
		setUnlocalizedName(name);
		  setRegistryName(name);
		    setCreativeTab(Main.htmmmaterialstab);
		    
		    
		 HtmmItems.ITEMS.add(this);
	  }
	
	
	@Override
	  public void registerModels()
	   {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
