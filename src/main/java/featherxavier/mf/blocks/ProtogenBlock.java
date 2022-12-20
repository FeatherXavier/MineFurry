package featherxavier.mf.blocks;

import featherxavier.mf.init.BlockRegistryHandler;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class ProtogenBlock extends Block
{

    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public ProtogenBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.COPPER).strength(1f, 10f).lightLevel(s -> 10).noOcclusion()
                .hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).isRedstoneConductor((bs, br, bp) -> false));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        if (context.getClickedFace().getAxis() == Direction.Axis.Y)
            return this.defaultBlockState().setValue(FACING, Direction.NORTH);
        return this.defaultBlockState().setValue(FACING, context.getClickedFace());
    }


    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(BlockRegistryHandler.PROTOGEN_BLOCK.get(), renderType -> renderType == RenderType.cutout());
    }
}
