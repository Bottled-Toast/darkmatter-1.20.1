package bottled.darkmatter.item;

import bottled.darkmatter.DarkMatter;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DARK_POWDER = registerItem("dark_powder", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DarkMatter.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DarkMatter.LOGGER.info("Registering Mod Items for" + DarkMatter.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(DARK_POWDER);
        });
    }
}