package com.novaventure.survivalessentials;

import com.novaventure.survivalessentials.registry.Blocks.*;
import com.novaventure.survivalessentials.registry.Drinks.MilkBottleBase;
import com.novaventure.survivalessentials.registry.Food.DriedBrownKelpBase;
import com.novaventure.survivalessentials.registry.Food.DriedSeaweedBase;
import com.novaventure.survivalessentials.registry.Food.HoneyCombChunkBase;
import com.novaventure.survivalessentials.registry.FoodIngredients.SaltBase;
import com.novaventure.survivalessentials.registry.Jars.*;
import com.novaventure.survivalessentials.registry.Knives.IronKnifeBase;
import com.novaventure.survivalessentials.registry.Knives.IronToolMaterialKnife;
import com.novaventure.survivalessentials.registry.Misc.IgusaBundleBase;
import com.novaventure.survivalessentials.registry.Misc.IgusaSeedBase;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.CountNoiseBiasedDecoratorConfig;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.feature.*;

import static com.novaventure.survivalessentials.IgusaFeature.OVERWORLD_IGUSA_FEATURE;
import static com.novaventure.survivalessentials.SaltOreFeature.ORE_SALT_OVERWORLD;
import static net.minecraft.world.biome.BiomeKeys.*;

public class SurvivalEssentials implements ModInitializer {
    public static final String MOD_ID = "novesues";

    public static final Block GLASS_SLAB = new GlassSlabBlock(FabricBlockSettings.of(Material.GLASS)
            .breakByHand(true)
            .sounds(BlockSoundGroup.GLASS)
            .strength(1, 0.6f));
            
    @Override
    public void onInitialize() {
        System.out.println("main mod initialization loaded fine™️");
        
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "glass_slab"), GLASS_SLAB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "glass_slab"), new BlockItem(GLASS_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
