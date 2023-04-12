
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auxenceaddons.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.auxenceaddons.entity.VendorEntity;
import net.mcreator.auxenceaddons.entity.JacksparrowEntity;
import net.mcreator.auxenceaddons.entity.GuardiaEntity;
import net.mcreator.auxenceaddons.entity.GolemdirocciaEntity;
import net.mcreator.auxenceaddons.entity.CapimarioEntity;
import net.mcreator.auxenceaddons.entity.CapiNoizEntity;
import net.mcreator.auxenceaddons.AuxenceAddonsMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class AuxenceAddonsModEntities {
	public static EntityType<GuardiaEntity> GUARDIA;
	public static EntityType<GolemdirocciaEntity> GOLEMDIROCCIA;
	public static EntityType<VendorEntity> VENDOR;
	public static EntityType<JacksparrowEntity> JACKSPARROW;
	public static EntityType<CapimarioEntity> CAPIMARIO;
	public static EntityType<CapiNoizEntity> CAPI_NOIZ;

	public static void load() {
		GUARDIA = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(AuxenceAddonsMod.MODID, "guardia"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, GuardiaEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		GuardiaEntity.init();
		FabricDefaultAttributeRegistry.register(GUARDIA, GuardiaEntity.createAttributes());
		GOLEMDIROCCIA = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(AuxenceAddonsMod.MODID, "golemdiroccia"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, GolemdirocciaEntity::new).dimensions(new EntityDimensions(4f, 3.5f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		GolemdirocciaEntity.init();
		FabricDefaultAttributeRegistry.register(GOLEMDIROCCIA, GolemdirocciaEntity.createAttributes());
		VENDOR = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(AuxenceAddonsMod.MODID, "vendor"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, VendorEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		VendorEntity.init();
		FabricDefaultAttributeRegistry.register(VENDOR, VendorEntity.createAttributes());
		JACKSPARROW = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(AuxenceAddonsMod.MODID, "jacksparrow"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, JacksparrowEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		JacksparrowEntity.init();
		FabricDefaultAttributeRegistry.register(JACKSPARROW, JacksparrowEntity.createAttributes());
		CAPIMARIO = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(AuxenceAddonsMod.MODID, "capimario"),
				FabricEntityTypeBuilder.create(MobCategory.CREATURE, CapimarioEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		CapimarioEntity.init();
		FabricDefaultAttributeRegistry.register(CAPIMARIO, CapimarioEntity.createAttributes());
		CAPI_NOIZ = Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(AuxenceAddonsMod.MODID, "capi_noiz"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, CapiNoizEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		CapiNoizEntity.init();
		FabricDefaultAttributeRegistry.register(CAPI_NOIZ, CapiNoizEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
