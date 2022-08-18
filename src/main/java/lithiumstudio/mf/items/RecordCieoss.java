package lithiumstudio.mf.items;

import lithiumstudio.mf.init.CreativeTabs;
import lithiumstudio.mf.init.SoundRegistryHandler;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class RecordCieoss extends RecordItem
{
    public RecordCieoss()
    {
        super(0, SoundRegistryHandler.REGISTRY.get(new ResourceLocation("mf:cieoss")), new Item.Properties().tab(CreativeTabs.RECORD_MINE_FURRY).stacksTo(1).rarity(Rarity.EPIC));
    }
}
