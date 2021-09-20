package com.veldan.udacity

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.utils.viewport.ExtendViewport
import com.badlogic.gdx.utils.viewport.FitViewport

lateinit var game: UdacityGame
    private set

class UdacityGame : Game() {

    companion object {
        private const val size = 100f
        const val WIDTH = size
        const val HEIGHT = size

        var aspectRatio = 0f
            private set
    }

    private val gameScreen = GameScreen()
    val viewport by lazy {
        aspectRatio = Gdx.graphics.width.toFloat() / Gdx.graphics.height.toFloat()
        ExtendViewport(WIDTH * aspectRatio, HEIGHT)
    }

    override fun create() {
        game = this
        setScreen(gameScreen)
    }

    override fun resize(width: Int, height: Int) {
        aspectRatio = (width.toFloat() / height.toFloat())
        viewport.update((width * aspectRatio).toInt(), height, true)
        super.resize(width, height)
    }

    override fun render() {
        ScreenUtils.clear(Color.BLUE)
        viewport.apply()
        super.render()
    }

}