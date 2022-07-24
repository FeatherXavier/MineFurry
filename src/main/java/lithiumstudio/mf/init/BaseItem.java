package lithiumstudio.mf.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class BaseItem extends Item
{
    public BaseItem()
    {
        super(new Properties().tab(CreativeTabs.TAB_MINE_FURRY).stacksTo(64).rarity(Rarity.COMMON));
    }

}
