package com.veldan.udacity

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Input
import com.badlogic.gdx.ScreenAdapter
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.veldan.udacity.UdacityGame.Companion.HEIGHT
import com.veldan.udacity.UdacityGame.Companion.WIDTH
import com.veldan.udacity.UdacityGame.Companion.aspectRatio

class GameScreen : ScreenAdapter() {

    private val shapeRenderer by lazy { ShapeRenderer() }

    var x = WIDTH * .10f
    var y = HEIGHT * .10f

    override fun render(delta: Float) {
        handleEvent()

        shapeRenderer.projectionMatrix = game.viewport.camera.combined
        with(shapeRenderer) {
            begin(ShapeRenderer.ShapeType.Filled)
            color = Color.YELLOW
            rect(0f, 0f, WIDTH * aspectRatio, HEIGHT)
            color = Color.BLUE
            circle(x, y, 10f)
            end()
        }
    }

    private fun handleEvent() {
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) y += 1f
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) y -= 1f
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) x += 1f
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) x -= 1f
    }

}