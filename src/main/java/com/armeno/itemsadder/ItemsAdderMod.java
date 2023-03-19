package com.armeno.itemsadder;

import com.armeno.itemsadder.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class ItemsAdderMod implements ModInitializer {

    public static final String MOD_ID = "itemsadder";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
