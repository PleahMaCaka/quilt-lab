package com.pleahmacaka.quiltlab.keybinds

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.minecraft.client.option.KeyBind
import net.minecraft.text.Text
import org.lwjgl.glfw.GLFW
import org.quiltmc.qsl.lifecycle.api.client.event.ClientTickEvents

object QuiltLabKeybinds {

    private val openMenu = KeyBindingHelper.registerKeyBinding(KeyBind(
        "key.quiltlab.open_menu",
        GLFW.GLFW_KEY_C,
        "category.quiltlab.open_menu"
    ))

    fun register() {
        ClientTickEvents.End { client ->
            while (openMenu.wasPressed()) {
                client.player?.sendMessage(Text.literal("Hello, world!"), false)
            }
        }
    }

}
