package featherxavier.mf.client.model;

import featherxavier.mf.armor.FurSuit;
import featherxavier.mf.MineFurry;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class FurSuitModel extends AnimatedGeoModel<FurSuit>
{

    @Override
    public ResourceLocation getModelLocation(FurSuit object) {
        return new ResourceLocation(MineFurry.MODID, "geo/fur_suit.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(FurSuit object) {
        return new ResourceLocation(MineFurry.MODID, "textures/entities/entity_furry.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(FurSuit animatable) {
        return new ResourceLocation(MineFurry.MODID, "animations/entity_furry.animation.json");
    }
}
