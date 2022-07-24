package lithiumstudio.mf.items;

import lithiumstudio.mf.init.CreativeTabs;
import net.minecraft.world.item.*;

public class ItemFur extends Item
{
    public ItemFur()
    {
        super(new Properties().tab(CreativeTabs.TAB_MINE_FURRY).stacksTo(64).rarity(Rarity.COMMON));

    }
/*
    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag)
    {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("item.fur.descr"));
    }
 */
}
