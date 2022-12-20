package featherxavier.mf.init;

import featherxavier.mf.MineFurry;
import featherxavier.mf.blocks.ProtogenBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistryHandler
{
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MineFurry.MODID);
    public static final RegistryObject<Block> PROTOGEN_BLOCK = REGISTRY.register("protogen_block", ProtogenBlock::new);

}
