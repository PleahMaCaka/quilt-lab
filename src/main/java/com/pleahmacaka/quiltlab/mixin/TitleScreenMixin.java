package com.pleahmacaka.quiltlab.mixin;

import com.pleahmacaka.quiltlab.QuiltLab;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Inject(method = "init", at = @At("TAIL"))
    public void exampleMod$onInit(CallbackInfo ci) {
        QuiltLab.INSTANCE.getLogger().info("This line is printed by an example mod mixin!");
    }
}
