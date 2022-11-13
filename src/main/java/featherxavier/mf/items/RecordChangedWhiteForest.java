package featherxavier.mf.items;

import featherxavier.mf.init.CreativeTabs;
import featherxavier.mf.init.SoundRegistryHandler;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.RecordItem;

public class RecordChangedWhiteForest extends RecordItem
{
    public RecordChangedWhiteForest()
    {
        super(0, SoundRegistryHandler.REGISTRY.get(new ResourceLocation("mf:changed_white_forest")), new Item.Properties().tab(CreativeTabs.RECORD_MINE_FURRY).stacksTo(1).rarity(Rarity.RARE));
    }
}
