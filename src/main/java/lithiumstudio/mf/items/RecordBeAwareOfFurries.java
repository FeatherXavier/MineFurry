package lithiumstudio.mf.items;

import lithiumstudio.mf.init.SoundRegistryHandler;
import lithiumstudio.mf.init.TabRegistryHandler;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class RecordBeAwareOfFurries extends RecordItem
{
    public RecordBeAwareOfFurries()
    {
        super(0, SoundRegistryHandler.REGISTRY.get(new ResourceLocation("mf:be_aware_of_furries")), new Item.Properties().tab(TabRegistryHandler.RECORD_MINE_FURRY).stacksTo(1).rarity(Rarity.RARE));
    }
}
