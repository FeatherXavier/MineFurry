package featherxavier.mf.init;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SoundRegistryHandler
{
        public static final Logger LOGGER = LogUtils.getLogger();
        public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
        static
        {
            REGISTRY.put(new ResourceLocation("mf", "be_aware_of_furries"), new SoundEvent(new ResourceLocation("mf", "be_aware_of_furries")));
            REGISTRY.put(new ResourceLocation("mf", "changed_the_library"), new SoundEvent(new ResourceLocation("mf", "changed_the_library")));
            REGISTRY.put(new ResourceLocation("mf", "changed_finale"), new SoundEvent(new ResourceLocation("mf", "changed_finale")));
            REGISTRY.put(new ResourceLocation("mf", "changed_white_forest"), new SoundEvent(new ResourceLocation("mf", "changed_white_forest")));
            REGISTRY.put(new ResourceLocation("mf", "cieoss"), new SoundEvent(new ResourceLocation("mf", "cieoss")));
        }

        @SubscribeEvent
        public static void registerSounds(RegistryEvent.Register<SoundEvent> event)
        {
            for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
                event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
            LOGGER.debug("Records successfully loaded.");
        }
    }

