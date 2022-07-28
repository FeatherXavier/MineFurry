package lithiumstudio.mf.init;

import com.mojang.logging.LogUtils;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;

import org.slf4j.Logger;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PaintingsRegistryHandler
{
    public static final Logger LOGGER = LogUtils.getLogger();
    @SubscribeEvent
    public static void registerMotives(RegistryEvent.@NotNull Register<Motive> event)
    {
        LoadSmall(event);
        LoadBig(event);
        LOGGER.debug("Pictures successfully loaded");
    }

    //长宽比小于16:9的放在这里
    private static void LoadSmall(RegistryEvent.@NotNull Register<Motive> event)
    {
        event.getRegistry().register(new Motive(16, 16).setRegistryName("img_0000"));
        event.getRegistry().register(new Motive(32, 32).setRegistryName("img_0001"));
        event.getRegistry().register(new Motive(48, 32).setRegistryName("img_0002"));
        event.getRegistry().register(new Motive(48, 64).setRegistryName("img_0003"));
        event.getRegistry().register(new Motive(64, 80).setRegistryName("img_0004"));
        event.getRegistry().register(new Motive(16, 32).setRegistryName("img_0005"));
        event.getRegistry().register(new Motive(48, 64).setRegistryName("img_0007"));
        event.getRegistry().register(new Motive(16, 32).setRegistryName("img_0008"));
        event.getRegistry().register(new Motive(32, 32).setRegistryName("img_0009"));
        event.getRegistry().register(new Motive(80, 64).setRegistryName("img_0010"));
        event.getRegistry().register(new Motive(80, 64).setRegistryName("img_0011"));
        event.getRegistry().register(new Motive(80, 64).setRegistryName("img_0012"));
        event.getRegistry().register(new Motive(32, 48).setRegistryName("img_0013"));
        event.getRegistry().register(new Motive(32, 32).setRegistryName("img_0014"));
        event.getRegistry().register(new Motive(48, 64).setRegistryName("img_0015"));
        event.getRegistry().register(new Motive(48, 32).setRegistryName("img_0016"));
        event.getRegistry().register(new Motive(32, 48).setRegistryName("img_0017"));
        event.getRegistry().register(new Motive(64, 48).setRegistryName("img_0018"));
        event.getRegistry().register(new Motive(32, 64).setRegistryName("img_0019"));
        event.getRegistry().register(new Motive(32, 32).setRegistryName("img_0020"));
    }

    //长宽比16:9/21:9/32:9的放在这里
    private static void LoadBig(RegistryEvent.@NotNull Register<Motive> event)
    {
        event.getRegistry().register(new Motive(256, 144).setRegistryName("img_0006"));
    }
}
