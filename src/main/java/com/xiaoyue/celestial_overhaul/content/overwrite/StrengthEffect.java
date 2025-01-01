package com.xiaoyue.celestial_overhaul.content.overwrite;

import com.xiaoyue.celestial_overhaul.data.COModConfig;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;

public class StrengthEffect extends MobEffect {
	public StrengthEffect() {
		super(MobEffectCategory.BENEFICIAL, 16762624);
		Double config = COModConfig.COMMON.strengthEffectDamageBonus.get();
		this.addAttributeModifier(Attributes.ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", config, AttributeModifier.Operation.MULTIPLY_BASE);
	}
}
