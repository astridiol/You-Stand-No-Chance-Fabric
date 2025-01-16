package net.estradial.ysncf.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.estradial.ysncf.config;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup SCYTHES = Registry.register(Registries.ITEM_GROUP, new Identifier(yourbad.MOD_ID, "yourbad"),
            FabricItemGroup.builder().displayName(Text.translatable("yourbad.scythes"))
                    .icon(() -> new ItemStack(ModItems.NETHERITESCYTHE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.WOODSCYTHE);
                        entries.add(ModItems.STONESCYTHE);
                        entries.add(ModItems.IRONSCYTHE);
                        entries.add(ModItems.GOLDSCYTHE);
                        entries.add(ModItems.DIAMONDSCYTHE);
                        entries.add(ModItems.NETHERITESCYTHE);
                    }).build());

    public static void registerItemGroups() {
        // Example of adding to existing Item Group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
        });
    }
}
