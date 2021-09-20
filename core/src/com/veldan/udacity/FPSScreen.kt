package com.veldan.udacity

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.utils.ScreenUtils

class FPSScreen: Screen {

    private val font by lazy { BitmapFont() }
    private val batch by lazy { SpriteBatch() }

    override fun show() {
    }

    override fun render(delta: Float) {
        ScreenUtils.clear(Color.BROWN)
        log("Delta - $delta")
        batch.begend {
            font.draw(this, "Delta = ${Gdx.graphics.framesPerSecond}", 30f, 30f)
        }
        if (Gdx.input.justTouched()) sss.screen = DeltaScreen()
    }

    override fun resize(width: Int, height: Int) {
    }

    override fun pause() {
    }

    override fun resume() {
    }

    override fun hide() {
    }

    override fun dispose() {
    }
}