package lithiumstudio.mf.init;

import lithiumstudio.mf.client.model.FurryModel;
import lithiumstudio.mf.client.renderer.EntityFurryRenderer;
import lithiumstudio.mf.entities.EntityFurry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static lithiumstudio.mf.MineFurry.MODID;

@Mod.EventBusSubscriber(modid = MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientModEventSubscriber
{
    //将所有的生物的皮肤贴图信息写在这个函数里，有几个写几个

    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {

        event.registerLayerDefinition(FurryModel.LAYER_LOCATION, FurryModel::createBodyLayer);

    }



    //将所有的生物的渲染信息写在这个函数里，有几个写几个

    @SubscribeEvent
    public static void onRegisterRenderer(EntityRenderersEvent.RegisterRenderers event) {

        event.registerEntityRenderer(EntityRegistryHandler.ENTITY_FURRY.get(), EntityFurryRenderer::new);

    }


    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {

        event.put(EntityRegistryHandler.ENTITY_FURRY.get(), EntityFurry.createAttributes());

    }

}

