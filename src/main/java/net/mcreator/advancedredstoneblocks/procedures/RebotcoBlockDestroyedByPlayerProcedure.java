package net.mcreator.advancedredstoneblocks.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.advancedredstoneblocks.AdvancedredstoneblocksModElements;
import net.mcreator.advancedredstoneblocks.AdvancedredstoneblocksMod;

import java.util.Map;

@AdvancedredstoneblocksModElements.ModElement.Tag
public class RebotcoBlockDestroyedByPlayerProcedure extends AdvancedredstoneblocksModElements.ModElement {
	public RebotcoBlockDestroyedByPlayerProcedure(AdvancedredstoneblocksModElements instance) {
		super(instance, 57);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AdvancedredstoneblocksMod.LOGGER.warn("Failed to load dependency x for procedure RebotcoBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AdvancedredstoneblocksMod.LOGGER.warn("Failed to load dependency y for procedure RebotcoBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AdvancedredstoneblocksMod.LOGGER.warn("Failed to load dependency z for procedure RebotcoBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AdvancedredstoneblocksMod.LOGGER.warn("Failed to load dependency world for procedure RebotcoBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), Blocks.AIR.getDefaultState(), 3);
	}
}
