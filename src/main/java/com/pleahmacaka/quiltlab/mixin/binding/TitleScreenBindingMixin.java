package com.pleahmacaka.quiltlab.mixin.binding;

import com.pleahmacaka.quiltlab.mixins.TitleScreenBindingMixinKt;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenBindingMixin {
    @Inject(method = "init", at = @At("TAIL"))
    public void exampleMod$onInit(CallbackInfo ci) {
        TitleScreenBindingMixinKt.titleScreenBinding();
    }
}
