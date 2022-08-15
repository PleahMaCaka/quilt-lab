package com.example.examplemod.mixinkt

import com.example.examplemod.ExampleMod

fun titleScreenBindingMixin(/*ci: CallbackInfo*/) {
    ExampleMod.LOGGER.info("TitleScreenBindingMixin!")
}
