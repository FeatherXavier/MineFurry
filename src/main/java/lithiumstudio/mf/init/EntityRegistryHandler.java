package lithiumstudio.mf.init;

import lithiumstudio.mf.entities.EntityFurry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static lithiumstudio.mf.MineFurry.MODID;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityRegistryHandler
{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, MODID);

    public static final RegistryObject<EntityType<EntityFurry>> ENTITY_FURRY = ENTITY_TYPES.register("entity_furry",

            () -> EntityType.Builder.of(EntityFurry::new, MobCategory.CREATURE).sized(0.9f,1.6f).setTrackingRange(30)

                    .build(new ResourceLocation("mf:entity_furry").toString()));

    public static void register(IEventBus bus)
    {
        ENTITY_TYPES.register(bus);
    }
}


