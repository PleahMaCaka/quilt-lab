package com.pleahmacaka.quiltlab.keybinds

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper
import net.minecraft.client.option.KeyBind
import org.lwjgl.glfw.GLFW

object QuiltLabKeybinds {

    val openMenu = KeyBindingHelper.registerKeyBinding(KeyBind(
        "key.quiltlab.open_menu",
        GLFW.GLFW_KEY_C,
        "category.quiltlab.open_menu"
    ))

    fun register() {

    }

}
