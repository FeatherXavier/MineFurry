package lithiumstudio.mf.init;

import lithiumstudio.mf.MineFurry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SoundRegistryHandler {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MineFurry.MODID);
    public static final RegistryObject<SoundEvent> BE_AWARE_OF_FURRIES = SOUNDS.register("be_aware_of_furries", () -> new SoundEvent(new ResourceLocation("mf", "be_aware_of_furries")));

}

