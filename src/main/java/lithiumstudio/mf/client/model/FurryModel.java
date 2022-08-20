package lithiumstudio.mf.client.model;

import lithiumstudio.mf.MineFurry;
import lithiumstudio.mf.entities.EntityFurry;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FurryModel extends AnimatedGeoModel<EntityFurry>{
	@Override
	public ResourceLocation getModelLocation(EntityFurry object)
	{
		return new ResourceLocation(MineFurry.MODID,"geo/entity_furry.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(EntityFurry object) {
		return new ResourceLocation(MineFurry.MODID,"textures/entities/entity_furry.png");
	}

	@Override
	public ResourceLocation getAnimationFileLocation(EntityFurry animatable) {
		return new ResourceLocation(MineFurry.MODID,"animations/entity_furry.animation.json");
	}
}