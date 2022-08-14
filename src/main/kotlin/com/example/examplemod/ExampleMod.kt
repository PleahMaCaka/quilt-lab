package com.example.examplemod

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.LoggerFactory

object ExampleMod : ModInitializer {

    val LOGGER = LoggerFactory.getLogger("Example Mod")

    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("${mod.metadata().name()} is initialized!\nWelcome to the QuiltMC!")
    }

}
