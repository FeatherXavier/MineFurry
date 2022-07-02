package lithiumstudio.mf.init;

import lithiumstudio.mf.MineFurry;
import lithiumstudio.mf.items.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistryHandler
{
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MineFurry.MODID);
    public static final RegistryObject<Item> ITEM_FUR = REGISTRY.register("item_fur", ItemFur::new);
    public static final RegistryObject<Item> ITEM_GLUE = REGISTRY.register("item_glue", ItemGlue::new);
    public static final RegistryObject<Item> ITEM_CLOTH = REGISTRY.register("item_cloth", ItemCloth::new);
    public static final RegistryObject<Item> DUCT_TAPE = REGISTRY.register("duct_tape", ItemTape::new);
    public static final RegistryObject<Item> RECORD_BE_AWARE_OF_FURRIES = REGISTRY.register("be_aware_of_furries", RecordBeAwareOfFurries::new);
    public static final RegistryObject<Item> ITEM_FUR_FABRIC = REGISTRY.register("fur_fabric",FurFabric::new);
    public static final RegistryObject<Item> DTD_BODY = REGISTRY.register("dtd_body",ItemDTD.Chestplate::new);
    public static final RegistryObject<Item> DTD_LEGS = REGISTRY.register("dtd_legs",ItemDTD.Leggings::new);
}
