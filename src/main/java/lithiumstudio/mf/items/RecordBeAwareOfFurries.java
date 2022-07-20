package lithiumstudio.mf.items;

import lithiumstudio.mf.init.SoundRegistryHandler;
import lithiumstudio.mf.init.CreativeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class RecordBeAwareOfFurries extends RecordItem
{
    public RecordBeAwareOfFurries()
    {
        super(0, SoundRegistryHandler.BE_AWARE_OF_FURRIES, new Item.Properties().tab(CreativeTab.RECORD_MINE_FURRY).stacksTo(1).rarity(Rarity.RARE));
    }
}
