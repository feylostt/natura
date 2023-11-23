package io.github.feylostt.natura.common.init;

import io.github.feylostt.natura.common.Natura;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class NaturaItems {

	public static Item GRAPHITE;

	public static void initializeItems() {
		GRAPHITE = registerItem(new Item(new QuiltItemSettings()), "graphite");
	}

	public static Item registerItem(Item item, String name) {
		Registry.register(Registries.ITEM, new Identifier(Natura.MODID, name), item);
		return item;
	}
}
