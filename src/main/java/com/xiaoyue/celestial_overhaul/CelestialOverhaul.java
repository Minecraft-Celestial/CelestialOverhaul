package com.xiaoyue.celestial_overhaul;

import com.mojang.logging.LogUtils;
import com.xiaoyue.celestial_overhaul.data.COModConfig;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(CelestialOverhaul.MODID)
public class CelestialOverhaul {
	public static final String MODID = "celestial_overhaul";
	public static final Logger LOGGER = LogUtils.getLogger();

	public CelestialOverhaul() {
		COModConfig.init();
	}

	public static ResourceLocation loc(String s) {
		return new ResourceLocation(MODID, s);
	}
}
