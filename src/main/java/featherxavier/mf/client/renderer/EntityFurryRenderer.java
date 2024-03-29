package featherxavier.mf.client.renderer;

import featherxavier.mf.MineFurry;
import featherxavier.mf.client.model.FurryModel;
import featherxavier.mf.entities.EntityFurry;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class EntityFurryRenderer extends MobRenderer<EntityFurry, FurryModel<EntityFurry>>
{
    public static final ResourceLocation TEXTURE = new ResourceLocation(MineFurry.MODID, "textures/entities/entity_furry.png");
    public EntityFurryRenderer(EntityRendererProvider.Context context) {
        super(context, new FurryModel<>(context.bakeLayer(FurryModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(EntityFurry p_114482_) {
        return TEXTURE;
    }

}

