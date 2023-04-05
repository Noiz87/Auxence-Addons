package net.mcreator.auxenceaddons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.auxenceaddons.entity.VendorEntity;
import net.mcreator.auxenceaddons.client.model.Modelgirl;

public class VendorRenderer extends MobRenderer<VendorEntity, Modelgirl<VendorEntity>> {
	public VendorRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgirl(context.bakeLayer(Modelgirl.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VendorEntity entity) {
		return new ResourceLocation("auxence_addons:textures/entities/girl-shop-keeper.png");
	}
}
