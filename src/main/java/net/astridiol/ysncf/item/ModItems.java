package net.astridiol.ysncf.item;

import net.astridiol.ysncf.ysncf;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    private static Identifier Item;
    public static final Item WOODSCYTHE = registerItem("woodscythe",
        new SwordItem(ToolMaterial.WOOD, 2, -3f, new Item.Settings()
                .registryKey(RegistryKey.of(RegistryKey.ofRegistry(Item),  Identifier.of(ysncf.MOD_ID, "woodscythe")))));

    public static final Item STONESCYTHE = registerItem("stonescythe",
            new SwordItem(ToolMaterial.STONE, 3, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKey.ofRegistry(Item),  Identifier.of(ysncf.MOD_ID, "stonescythe")))));

    public static final Item GOLDSCYTHE = registerItem("goldscythe",
            new SwordItem(ToolMaterial.GOLD, 7, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKey.ofRegistry(Item),  Identifier.of(ysncf.MOD_ID, "goldscythe")))));

    public static final Item IRONSCYTHE = registerItem("ironscythe",
            new SwordItem(ToolMaterial.WOOD, 7, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKey.ofRegistry(Item),  Identifier.of(ysncf.MOD_ID, "ironscythe")))));

    public static final Item DIAMONDSCYTHE = registerItem("diamondscythe",
            new SwordItem(ToolMaterial.WOOD, 9, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKey.ofRegistry(Item),  Identifier.of(ysncf.MOD_ID, "diamondscythe")))));

    public static final Item NETHERITESCYTHE = registerItem("netheritescythe",
            new SwordItem(ToolMaterial.WOOD, 13, -3f, new Item.Settings()
                    .registryKey(RegistryKey.of(RegistryKey.ofRegistry(Item),  Identifier.of(ysncf.MOD_ID, "netheritescythe")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ysncf.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ysncf.LOGGER.info("Registering Mod Items for " + ysncf.MOD_ID);
    }
}
