package lithiumstudio.mf.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab
{
    public static CreativeModeTab TAB_MINE_FURRY = new CreativeModeTab("mine_furry")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ItemRegistryHandler.ITEM_FUR.get());
        }
    };
    public static CreativeModeTab RECORD_MINE_FURRY = new CreativeModeTab("record_mine_furry")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ItemRegistryHandler.RECORD_BE_AWARE_OF_FURRIES.get());
        }
    };
}
