
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auxenceaddons.init;

import net.mcreator.auxenceaddons.client.renderer.VendorRenderer;
import net.mcreator.auxenceaddons.client.renderer.JacksparrowRenderer;
import net.mcreator.auxenceaddons.client.renderer.GuardiaRenderer;
import net.mcreator.auxenceaddons.client.renderer.GolemdirocciaRenderer;
import net.mcreator.auxenceaddons.client.renderer.CapimarioRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class AuxenceAddonsModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(AuxenceAddonsModEntities.GUARDIA, GuardiaRenderer::new);
		EntityRendererRegistry.register(AuxenceAddonsModEntities.GOLEMDIROCCIA, GolemdirocciaRenderer::new);
		EntityRendererRegistry.register(AuxenceAddonsModEntities.VENDOR, VendorRenderer::new);
		EntityRendererRegistry.register(AuxenceAddonsModEntities.JACKSPARROW, JacksparrowRenderer::new);
		EntityRendererRegistry.register(AuxenceAddonsModEntities.CAPIMARIO, CapimarioRenderer::new);
	}
}
