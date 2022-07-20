package lithiumstudio.mf.items;

import lithiumstudio.mf.init.CreativeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class BaseMineFurryItem extends Item
{
    public BaseMineFurryItem()
    {
        super(new Properties().tab(CreativeTab.TAB_MINE_FURRY).stacksTo(64).rarity(Rarity.COMMON));

    }
}
