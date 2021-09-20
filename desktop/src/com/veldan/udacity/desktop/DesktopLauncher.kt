package com.veldan.udacity.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import com.veldan.udacity.UdacityGame

object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        val config = LwjglApplicationConfiguration()
        config.apply {
            width = 600
            height = 400
        }
        LwjglApplication(UdacityGame(), config)
    }
}