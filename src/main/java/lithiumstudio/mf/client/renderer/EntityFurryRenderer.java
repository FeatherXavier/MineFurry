package lithiumstudio.mf.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import lithiumstudio.mf.MineFurry;
import lithiumstudio.mf.client.model.FurryModel;
import lithiumstudio.mf.entities.EntityFurry;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import static lithiumstudio.mf.MineFurry.MODID;


public class EntityFurryRenderer extends GeoEntityRenderer<EntityFurry>
{

    public EntityFurryRenderer(EntityRendererProvider.Context renderManager)
    {
        super(renderManager, new FurryModel());
        this.shadowRadius = 0.6F;
    }

    @Override
    public ResourceLocation getTextureLocation(EntityFurry instance)
    {
        return new ResourceLocation(MODID,"textures/entities/entity_furry.png");
    }

    @Override
    public RenderType getRenderType(EntityFurry animatable, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation)
    {
        stack.scale(1.0f,1.0f,1.0f);
        return super.getRenderType(animatable,partialTicks,stack,renderTypeBuffer,vertexBuilder,packedLightIn,textureLocation);
    }
}

