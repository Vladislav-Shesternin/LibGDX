package com.veldan.udacity

import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.utils.ScreenUtils

lateinit var sss: Game
    private set

class UdacityGame : Game() {

    private val deltaScreen = DeltaScreen()
    private val fpsScreen = FPSScreen()

    override fun create() {
        sss = this
        ScreenUtils.clear(Color.BLUE)
        setScreen(deltaScreen)
    }

}