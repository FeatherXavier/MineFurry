package featherxavier.mf.items;

import featherxavier.mf.init.ArmorMaterials;
import featherxavier.mf.init.CreativeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemFurSuit extends ArmorItem
{

    public ItemFurSuit(ArmorMaterial DTDMaterial, EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return new int[]{13, 15, 16, 11}[slot.getIndex()] * 50;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot) {
                return new int[]{2, 5, 6, 2}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 0;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }

            @Override
            public String getName() {
                return "fursuit";
            }

            @Override
            public float getToughness() {
                return 0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, slot, properties);
    }

    public static class Chestplate extends ItemFurSuit {
        public Chestplate() {
            super(ArmorMaterials.DTDMaterial, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeTabs.TAB_MINE_FURRY));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "mf:textures/entities/entity_furry.png";
        }
    }

    public static class Leggings extends ItemFurSuit {
        public Leggings() {
            super(ArmorMaterials.DTDMaterial, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeTabs.TAB_MINE_FURRY));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "mf:textures/models/armor/dtd_layer_2.png";
        }
    }
}
