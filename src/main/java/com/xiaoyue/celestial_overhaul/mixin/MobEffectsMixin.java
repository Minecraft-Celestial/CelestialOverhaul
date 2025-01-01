package com.xiaoyue.celestial_overhaul.mixin;

import com.xiaoyue.celestial_overhaul.content.overwrite.StrengthEffect;
import com.xiaoyue.celestial_overhaul.data.COModConfig;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MobEffects.class)
public class MobEffectsMixin {

	@Inject(at = @At("HEAD"), method = "register", cancellable = true)
	private static void celestial_overhaul$register(int pId, String pKey, MobEffect pEffect, CallbackInfoReturnable<MobEffect> cir) {
		Double config = COModConfig.COMMON.strengthEffectDamageBonus.get();
		if ((pId == 5 || pKey.equals("strength")) && config >= 0) {
			cir.setReturnValue(Registry.registerMapping(BuiltInRegistries.MOB_EFFECT, pId, pKey, new StrengthEffect()));
		}
	}
}
