package lithiumstudio.mf.items;

import lithiumstudio.mf.init.TabRegistryHandler;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ItemTape extends Item
{
    public ItemTape()
    {
        super(new Properties().tab(TabRegistryHandler.TAB_MINE_FURRY).stacksTo(64).rarity(Rarity.COMMON));

    }
}

