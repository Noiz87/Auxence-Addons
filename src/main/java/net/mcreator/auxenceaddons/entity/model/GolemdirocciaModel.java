package net.mcreator.auxenceaddons.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.auxenceaddons.entity.GolemdirocciaEntity;

public class GolemdirocciaModel extends AnimatedGeoModel<GolemdirocciaEntity> {
	@Override
	public ResourceLocation getAnimationResource(GolemdirocciaEntity entity) {
		return new ResourceLocation("auxence_addons", "animations/rocky.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GolemdirocciaEntity entity) {
		return new ResourceLocation("auxence_addons", "geo/rocky.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GolemdirocciaEntity entity) {
		return new ResourceLocation("auxence_addons", "textures/entities/" + entity.getTexture() + ".png");
	}

}
