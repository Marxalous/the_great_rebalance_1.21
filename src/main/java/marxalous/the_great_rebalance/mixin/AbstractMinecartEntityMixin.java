package marxalous.the_great_rebalance.mixin;

import marxalous.the_great_rebalance.blocks.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractMinecartEntity.class)
public abstract class AbstractMinecartEntityMixin {
	@Shadow
	public abstract BlockPos getBlockPos();

	@Shadow
	public abstract World getWorld();

	@Inject(at = @At("HEAD"), method = "method_7504", cancellable = true)
	private void getMaxSpeed(CallbackInfoReturnable<Double> cir) {
		BlockPos pos = this.getBlockPos();
		BlockState state = this.getWorld().getBlockState(pos);
		if (state.isOf(ModBlocks.ENHANCED_POWERED_RAIL)) {
			cir.setReturnValue(0.6D);
		} else if (state.isOf(Blocks.POWERED_RAIL)) {
			cir.setReturnValue(0.4D);
		}
	}
}
