package lithiumstudio.mf.init;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;

public class CreativeTabs
{
    public static CreativeModeTab TAB_MINE_FURRY;
    public static CreativeModeTab RECORD_MINE_FURRY;

    public static final Logger LOGGER = LogUtils.getLogger();

    public static void load() {
        TAB_MINE_FURRY = new CreativeModeTab("mine_furry")
        {
            @Override
            public ItemStack makeIcon()
            {
                return new ItemStack(ItemRegistryHandler.ITEM_FUR.get());
            }
        };
        RECORD_MINE_FURRY = new CreativeModeTab("record_mine_furry")
        {
            @Override
            public ItemStack makeIcon()
            {
                return new ItemStack(ItemRegistryHandler.RECORD_BE_AWARE_OF_FURRIES.get());
            }
        };
        LOGGER.debug("Creative tabs successfully loaded.");
}
}
