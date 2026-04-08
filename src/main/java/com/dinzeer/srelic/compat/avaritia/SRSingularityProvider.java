package com.dinzeer.srelic.compat.avaritia;

import committee.nova.mods.avaritia.Const;
import committee.nova.mods.avaritia.core.singularity.Singularity;
import committee.nova.mods.avaritia.util.SingularityUtils;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;

public class SRSingularityProvider implements DataProvider {

    private final DataGenerator generator;
    private final PackOutput.PathProvider pathProvider;
    private final ExistingFileHelper fileHelper;
    private final Map<ResourceLocation, Singularity> singularities = new TreeMap<>();

    public SRSingularityProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        this.generator = generator;
        this.pathProvider = generator.getPackOutput().createPathProvider(PackOutput.Target.DATA_PACK, "singularities");
        this.fileHelper = fileHelper;
    }


    @Override
    public @NotNull CompletableFuture<?> run(@NotNull CachedOutput output) {
        List<CompletableFuture<?>> list = new ArrayList<>();
        this.singularities.clear();

        // 收集所有默认奇点
        this.collectDefaultSingularities();

        // 生成JSON文件
        for (var entry : this.singularities.entrySet()) {
            var id = entry.getKey();
            var singularity = entry.getValue();

            var json = SingularityUtils.writeToJson(singularity);

            var path = this.pathProvider.json(id);

            list.add(DataProvider.saveStable(output, json, path));
        }
        return CompletableFuture.allOf(list.toArray(CompletableFuture[]::new));
    }


    private void collectDefaultSingularities() {
        for (var singularity : SRSingularities.getDefaults()) {
            this.singularities.put(singularity.getRegistryName(), singularity);
        }

        Const.LOGGER.debug("Collected {} default singularities for data generation",
                this.singularities.size());
    }

    @Override
    public @NotNull String getName() {
        return "Avaritia Singularities Data Provider";
    }
}
