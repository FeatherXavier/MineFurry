package lithiumstudio.mf.client.renderer;

import lithiumstudio.mf.client.model.FurryModel;
import lithiumstudio.mf.entities.EntityFurry;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import static lithiumstudio.mf.MineFurry.MODID;


public class EntityFurryRenderer extends MobRenderer<EntityFurry, FurryModel<EntityFurry>>
{
    public EntityFurryRenderer(EntityRendererProvider.Context context)
    {
        super(context, new FurryModel<>(context.bakeLayer(FurryModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(EntityFurry entity)
    {
        return new ResourceLocation(MODID,"entity_furry");
    }
}

