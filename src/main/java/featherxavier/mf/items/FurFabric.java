package featherxavier.mf.items;

import featherxavier.mf.init.CreativeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class FurFabric extends Item
{
    public FurFabric()
    {
        super(new Properties().tab(CreativeTabs.TAB_MINE_FURRY).stacksTo(64).rarity(Rarity.COMMON));

    }
}
