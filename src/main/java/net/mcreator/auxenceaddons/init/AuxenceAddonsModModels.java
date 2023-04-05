
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.auxenceaddons.init;

import net.mcreator.auxenceaddons.client.model.Modelgirl;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class AuxenceAddonsModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(Modelgirl.LAYER_LOCATION, Modelgirl::createBodyLayer);
	}
}
