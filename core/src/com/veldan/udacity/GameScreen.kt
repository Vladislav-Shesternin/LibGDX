package com.veldan.udacity

import com.badlogic.gdx.*
import com.badlogic.gdx.InputAdapter
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2
import com.veldan.udacity.UdacityGame.Companion.HEIGHT
import com.veldan.udacity.UdacityGame.Companion.WIDTH
import com.veldan.udacity.UdacityGame.Companion.aspectRatio

class GameScreen : ScreenAdapter(), VeldanInputProcessor {

    private val shapeRenderer by lazy { ShapeRenderer() }
    private val font by lazy { BitmapFont() }
    private val batch by lazy { SpriteBatch() }

    var x = WIDTH * .10f
    var y = HEIGHT * .10f

    override fun show() {
        Gdx.input.inputProcessor = this
    }

    override fun render(delta: Float) {
        shapeRenderer.projectionMatrix = game.viewport.camera.combined
        batch.projectionMatrix = game.viewport.camera.combined

        batch.begend {
            font.draw(batch, "x = ${Gdx.input.accelerometerX}; y = ${Gdx.input.accelerometerY}; z = ${Gdx.input.accelerometerZ};",0f, HEIGHT * .9f)
        }
        with(shapeRenderer) {
            begin(ShapeRenderer.ShapeType.Filled)

            end()
        }
    }

    override fun touchDragged(screenX: Int, screenY: Int, pointer: Int): Boolean {
        val v = game.viewport.unproject(Vector2(screenX.toFloat(), screenY.toFloat()))
        x = v.x
        y = v.y
        return false
    }

}