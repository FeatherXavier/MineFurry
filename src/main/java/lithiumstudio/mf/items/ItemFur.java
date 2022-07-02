package lithiumstudio.mf.items;

import lithiumstudio.mf.init.TabRegistryHandler;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import java.util.List;

public class ItemFur extends Item
{
    public ItemFur()
    {
        super(new Properties().tab(TabRegistryHandler.TAB_MINE_FURRY).stacksTo(64).rarity(Rarity.COMMON));

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
