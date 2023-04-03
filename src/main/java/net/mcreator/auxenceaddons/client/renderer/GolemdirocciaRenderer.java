package net.mcreator.auxenceaddons.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.auxenceaddons.entity.model.GolemdirocciaModel;
import net.mcreator.auxenceaddons.entity.GolemdirocciaEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GolemdirocciaRenderer extends GeoEntityRenderer<GolemdirocciaEntity> {
	public GolemdirocciaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GolemdirocciaModel());
		this.shadowRadius = 1.5f;
	}

	@Override
	public RenderType getRenderType(GolemdirocciaEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
