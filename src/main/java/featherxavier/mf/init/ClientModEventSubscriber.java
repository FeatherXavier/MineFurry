package featherxavier.mf.init;

import featherxavier.mf.MineFurry;
import featherxavier.mf.armor.FurSuit;
import featherxavier.mf.client.model.FurryModel;
import featherxavier.mf.client.renderer.FurSuitRenderer;
import featherxavier.mf.client.renderer.EntityFurryRenderer;
import featherxavier.mf.entities.EntityFurry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = MineFurry.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
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

    @OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.AddLayers event) {

        //渲染类进行注册
        GeoArmorRenderer.registerArmorRenderer(FurSuit.class, new FurSuitRenderer());
    }

}

