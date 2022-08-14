package com.example.examplemod.mixin;

import com.example.examplemod.ExampleMod;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {

	@Inject(method = "init", at = @At("TAIL"))
	public void onInit(CallbackInfo ci) {
		ExampleMod.INSTANCE.getLOGGER().info("Awesome Mixin!");
	}

}
