package lithiumstudio.mf.init;

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
        }

        @SubscribeEvent
        public static void registerSounds(RegistryEvent.Register<SoundEvent> event)
        {
            for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
                event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
            LOGGER.debug("Records successfully loaded.");
        }
    }

