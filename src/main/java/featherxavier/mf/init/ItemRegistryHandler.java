package featherxavier.mf.init;

import featherxavier.mf.items.*;
import featherxavier.mf.MineFurry;
import lithiumstudio.mf.items.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
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
    public static final RegistryObject<Item> RECORD_CHANGED_THE_LIBRARY = REGISTRY.register("changed_the_library", RecordChangedTheLibrary::new);
    public static final RegistryObject<Item> RECORD_CHANGED_FINALE = REGISTRY.register("changed_finale", RecordChangedFinale::new);
    public static final RegistryObject<Item> RECORD_CHANGED_WHITE_FOREST = REGISTRY.register("changed_white_forest", RecordChangedWhiteForest::new);
    public static final RegistryObject<Item> RECORD_CIEOSS = REGISTRY.register("cieoss", RecordCieoss::new);
    public static final RegistryObject<Item> ITEM_FUR_FABRIC = REGISTRY.register("fur_fabric",FurFabric::new);
    public static final RegistryObject<Item> DTD_BODY = REGISTRY.register("dtd_body", ItemDTD.Chestplate::new);
    public static final RegistryObject<Item> DTD_LEGS = REGISTRY.register("dtd_legs",ItemDTD.Leggings::new);
    public static final RegistryObject<Item> ENTITY_FURRY = REGISTRY.register("entity_furry_egg", () -> new ForgeSpawnEggItem(EntityRegistryHandler.ENTITY_FURRY, -1, -43088, new Item.Properties().tab(CreativeTabs.TAB_MINE_FURRY)));

    public static final RegistryObject<ItemFurSuit> FURSUIT_HEAD = REGISTRY.register("fur_suit_head",
            () -> new ItemFurSuit(ArmorMaterials.DTDMaterial, EquipmentSlot.HEAD, new Item.Properties()));
    public static final RegistryObject<ItemFurSuit> FURSUIT_SUIT = REGISTRY.register("fur_suit_suit",
            () -> new ItemFurSuit(ArmorMaterials.DTDMaterial, EquipmentSlot.CHEST, new Item.Properties()));
    public static final RegistryObject<ItemFurSuit> FURSUIT_LEGG = REGISTRY.register("fur_suit_legg",
            () -> new ItemFurSuit(ArmorMaterials.DTDMaterial, EquipmentSlot.LEGS, new Item.Properties()));
    public static final RegistryObject<ItemFurSuit> FURSUIT_BOOTS = REGISTRY.register("fur_suit_boots",
            () -> new ItemFurSuit(ArmorMaterials.DTDMaterial, EquipmentSlot.FEET, new Item.Properties()));

}
