package com.example.examplemod.mixin

import com.example.examplemod.ExampleMod
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

fun titleScreenBindingMixin(ci: CallbackInfo) {
    ExampleMod.LOGGER.info("TitleScreenBindingMixin!")
}
