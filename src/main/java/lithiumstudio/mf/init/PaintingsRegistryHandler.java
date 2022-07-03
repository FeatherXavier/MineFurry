package lithiumstudio.mf.init;

import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PaintingsRegistryHandler
{
    @SubscribeEvent
    public static void registerMotives(RegistryEvent.@NotNull Register<Motive> event)
    {
        event.getRegistry().register(new Motive(16, 16).setRegistryName("img_0000"));
        event.getRegistry().register(new Motive(32, 32).setRegistryName("img_0001"));
        event.getRegistry().register(new Motive(48, 32).setRegistryName("img_0002"));
        event.getRegistry().register(new Motive(48, 64).setRegistryName("img_0003"));
        event.getRegistry().register(new Motive(64, 80).setRegistryName("img_0004"));
        event.getRegistry().register(new Motive(16, 32).setRegistryName("img_0005"));
        event.getRegistry().register(new Motive(256, 144).setRegistryName("img_0006"));
        event.getRegistry().register(new Motive(48, 64).setRegistryName("img_0007"));
        event.getRegistry().register(new Motive(16, 32).setRegistryName("img_0008"));
        event.getRegistry().register(new Motive(32, 32).setRegistryName("img_0009"));
        event.getRegistry().register(new Motive(80, 64).setRegistryName("img_0010"));
        event.getRegistry().register(new Motive(80, 64).setRegistryName("img_0011"));
        event.getRegistry().register(new Motive(80, 64).setRegistryName("img_0012"));
    }
}
