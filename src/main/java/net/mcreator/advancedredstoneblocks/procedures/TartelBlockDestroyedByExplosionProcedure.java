package net.mcreator.advancedredstoneblocks.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;

import net.mcreator.advancedredstoneblocks.AdvancedredstoneblocksModVariables;
import net.mcreator.advancedredstoneblocks.AdvancedredstoneblocksModElements;
import net.mcreator.advancedredstoneblocks.AdvancedredstoneblocksMod;

import java.util.Map;

@AdvancedredstoneblocksModElements.ModElement.Tag
public class TartelBlockDestroyedByExplosionProcedure extends AdvancedredstoneblocksModElements.ModElement {
	public TartelBlockDestroyedByExplosionProcedure(AdvancedredstoneblocksModElements instance) {
		super(instance, 128);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AdvancedredstoneblocksMod.LOGGER.warn("Failed to load dependency world for procedure TartelBlockDestroyedByExplosion!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().func_232641_a_(new StringTextComponent("Location block 1 destroyed by a explosion"), ChatType.SYSTEM,
						Util.DUMMY_UUID);
		}
		AdvancedredstoneblocksModVariables.WorldVariables.get(world).tpd = (double) 0;
		AdvancedredstoneblocksModVariables.WorldVariables.get(world).syncData(world);
		AdvancedredstoneblocksModVariables.WorldVariables.get(world).tpdy = (double) 0;
		AdvancedredstoneblocksModVariables.WorldVariables.get(world).syncData(world);
		AdvancedredstoneblocksModVariables.WorldVariables.get(world).tpdz = (double) 0;
		AdvancedredstoneblocksModVariables.WorldVariables.get(world).syncData(world);
	}
}
