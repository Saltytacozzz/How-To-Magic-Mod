package com.glp.howtomagicmod.tabs;

import com.glp.howtomagicmod.init.HtmmBlocks;
import com.glp.howtomagicmod.init.HtmmItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class HtmmBlocksTab extends CreativeTabs
{
	public HtmmBlocksTab(String label) { 
	  super("htmmblokstab");
	    this.setBackgroundImageName("htmm.png"); }
	      public ItemStack getTabIconItem() {
		    return new ItemStack(Item.getItemFromBlock(HtmmBlocks.SARLAGA_STONE));
 }
}
