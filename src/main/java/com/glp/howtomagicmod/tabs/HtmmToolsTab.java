package com.glp.howtomagicmod.tabs;

import com.glp.howtomagicmod.init.HtmmBlocks;
import com.glp.howtomagicmod.init.HtmmItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HtmmToolsTab extends CreativeTabs
{
	public HtmmToolsTab(String label) { 
	  super("htmmtoolstab");
	    this.setBackgroundImageName("htmm.png"); }
	      public ItemStack getTabIconItem() {
		    return new ItemStack(HtmmItems.QUARTER_PICKAXE_OF_STRENGTH);
 }
}
