package featherxavier.mf;

import com.mojang.logging.LogUtils;
import featherxavier.mf.init.CreativeTabs;
import featherxavier.mf.init.ItemRegistryHandler;
import featherxavier.mf.init.EntityRegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("mf")
public class MineFurry
{
    public static final String MODID = "mf";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public MineFurry()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistryHandler.REGISTRY.register(bus);

        CreativeTabs.load();

        EntityRegistryHandler.register(bus);

        GeckoLib.initialize();
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("Mine Furry mod loaded.");
        LOGGER.info("I'm sure that you are a furry, right?");
    }

}
