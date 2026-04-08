package com.dinzeer.srelic.compat.avaritia;

import com.dinzeer.srelic.Srelic;
import com.dinzeer.srelic.registry.SRItemRegsitry;
import com.tterrag.registrate.util.entry.ItemEntry;
import committee.nova.mods.avaritia.core.singularity.Singularity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.awt.*;
import java.util.List;

import static com.dinzeer.srelic.Srelic.MODID;
import static com.dinzeer.srelic.Srelic.SRItems;

public class SRSingularities {


    public static final Singularity demon_ingot = fastSingularity(SRItemRegsitry.demon_ingot,4879982,0);
    public static final Singularity wendy_core_ingot = fastSingularity(SRItemRegsitry.windy_core_ingot,2330216,65407);
    public static final Singularity ScarletflameIngot = fastSingularity(SRItemRegsitry.ScarletflameIngot,13734517,16777215);
    public static final Singularity AbyssalLuminanceIngot = fastSingularity(SRItemRegsitry.AbyssalLuminanceIngot,65535,255);
    public static final Singularity NightmareCoreIngot = fastSingularity(SRItemRegsitry.NightmareCoreIngot,9315179,9315107);
    public static final Singularity oceanic_netherite_alloy = fastSingularity(SRItemRegsitry.oceanic_netherite_alloy,65535,3289805);
    public static final Singularity thunder_netherite_alloy = fastSingularity(SRItemRegsitry.thunder_netherite_alloy,5066239,255);
    public static final Singularity PhantomTraceIngot = fastSingularity(SRItemRegsitry.PhantomTraceIngot,8323327,156);
    public static final Singularity NightstalkerIngot = fastSingularity(SRItemRegsitry.NightstalkerIngot,12326679,16720896);
    public static final Singularity void_ingot = fastSingularity(SRItemRegsitry.void_ingot,10040013,16777215);
    public static final Singularity DreamweaveIngot = fastSingularity(SRItemRegsitry.DreamweaveIngot,3289805,8323327);
    public static final Singularity black_hole_metal = fastSingularity(SRItemRegsitry.black_hole_metal,16777215,0);
    public static final Singularity fel_metal = fastSingularity(SRItemRegsitry.fel_metal,8323327,0);
    public static final Singularity soul_metal = fastSingularity(SRItemRegsitry.soul_metal,14276889,16711680);
    public static final Singularity frozen_netherite_alloy = fastSingularity(SRItemRegsitry.frozen_netherite_alloy,12638681,65535);
    public static final Singularity max_ingot = fastSingularity(SRItemRegsitry.max_ingot,16720896,14381275);
    public static final Singularity flame_netherite_alloy = fastSingularity(SRItemRegsitry.flame_netherite_alloy,16744192,16720896);
    public static final Singularity ender_metal = fastSingularity(SRItemRegsitry.ender_metal,4353858,2330216);
    public static final Singularity sakura_steel_ingot = fastSingularity(SRItemRegsitry.sakura_steel_ingot,15379946,0);
    public static final Singularity crimson_shadow_ingot = fastSingularity(SRItemRegsitry.crimson_shadow_ingot,15379946,14740039);
    public static final Singularity eternal_plum = fastSingularity(SRItemRegsitry.eternal_plum,13467442,14276889);
    public static Singularity fastSingularity(ItemEntry<? extends Item> itemEntry,int color1,int color2){
        String name = itemEntry.getId().getPath();
        return Singularity.create(
                Srelic.prefix(name),"item.srelic."+name,
                new int[]{color1, color2},
                Ingredient.of(new ItemLike[]{itemEntry}));
    }
    public static List<Singularity> getDefaults() {
        return List.of(
                demon_ingot,
                wendy_core_ingot,
                ScarletflameIngot,
                AbyssalLuminanceIngot,
                NightmareCoreIngot,
                oceanic_netherite_alloy,
                thunder_netherite_alloy,
                PhantomTraceIngot,
                NightstalkerIngot,
                void_ingot,
                DreamweaveIngot,
                black_hole_metal,
                fel_metal,
                soul_metal,
                frozen_netherite_alloy,
                max_ingot,
                flame_netherite_alloy,
                ender_metal,
                sakura_steel_ingot,
                crimson_shadow_ingot,
                eternal_plum
        );
    }

}
