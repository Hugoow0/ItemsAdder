package com.armeno.itemsadder.registry;

import com.armeno.itemsadder.ItemsAdderMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Items
    public static final Item CRYSTAL = new Item(new Item.Settings().group(ItemGroup.MISC).rarity(Rarity.EPIC));

    // modid:itemName
    // itemsadder:crystal
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(ItemsAdderMod.MOD_ID, "crystal"), CRYSTAL);
    }
}
