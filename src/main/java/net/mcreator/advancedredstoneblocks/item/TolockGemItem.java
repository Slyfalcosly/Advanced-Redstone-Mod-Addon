
package net.mcreator.advancedredstoneblocks.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.advancedredstoneblocks.AdvancedredstoneblocksModElements;

@AdvancedredstoneblocksModElements.ModElement.Tag
public class TolockGemItem extends AdvancedredstoneblocksModElements.ModElement {
	@ObjectHolder("advancedredstoneblocks:tolock_gem")
	public static final Item block = null;
	public TolockGemItem(AdvancedredstoneblocksModElements instance) {
		super(instance, 102);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("tolock_gem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
