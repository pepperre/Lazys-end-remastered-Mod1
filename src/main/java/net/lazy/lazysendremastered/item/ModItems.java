package net.lazy.lazysendremastered.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lazy.lazysendremastered.LazysEndRemastered;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item NETHER_SOUL = registerItem("nether_soul", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LazysEndRemastered.MOD_ID,"nether_soul")))));
    public static final Item OVERSOUL_SOUL = registerItem("overworld_soul", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LazysEndRemastered.MOD_ID,"overworld_soul")))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LazysEndRemastered.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LazysEndRemastered.LOGGER.info("Registering Mod Items for " + LazysEndRemastered.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(NETHER_SOUL);
            fabricItemGroupEntries.add(OVERSOUL_SOUL);
        });
    }
}
