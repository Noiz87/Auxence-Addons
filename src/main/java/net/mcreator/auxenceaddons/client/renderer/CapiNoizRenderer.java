package net.mcreator.auxenceaddons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.auxenceaddons.entity.CapiNoizEntity;

public class CapiNoizRenderer extends HumanoidMobRenderer<CapiNoizEntity, HumanoidModel<CapiNoizEntity>> {
	public CapiNoizRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(CapiNoizEntity entity) {
		return new ResourceLocation("auxence_addons:textures/entities/trafalgar_law_dressrosa.png");
	}
}
