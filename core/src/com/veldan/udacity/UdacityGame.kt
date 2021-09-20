package com.veldan.udacity

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.utils.viewport.*

class UdacityGame : ApplicationAdapter() {

    companion object {
        const val WIDTH = 100f
        const val HEIGHT = 50f
    }

    private val shapeRenderer by lazy { ShapeRenderer() }
    private val viewport by lazy { FitViewport(WIDTH, HEIGHT) }

    override fun resize(width: Int, height: Int) {
        viewport.update(width, height, true)
    }

    override fun render() {
        ScreenUtils.clear(Color.BLUE)
        viewport.camera.update()

        shapeRenderer.apply {
            projectionMatrix = viewport.camera.combined
            begin(ShapeType.Filled)

            color = Color.YELLOW
            circle(WIDTH / 2f, HEIGHT / 2f, HEIGHT / 2, 1000)
            color = Color.BLACK
            circle(WIDTH * 0.4f, HEIGHT * 0.7f, HEIGHT * 0.1f, 1000)
            circle(WIDTH * 0.6f, HEIGHT * 0.7f, HEIGHT * 0.1f, 1000)
            arc(WIDTH / 2f, HEIGHT / 2f, HEIGHT / 4f, -180f, 180f, 1000)
            color = Color.YELLOW
            arc(WIDTH / 2f, HEIGHT / 2f, HEIGHT / 6f, -180f, 180f, 1000)
            end()
        }
    }

    override fun dispose() {
        shapeRenderer.dispose()
    }
}