package com.veldan.udacity

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.utils.Array
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.utils.TimeUtils
import com.badlogic.gdx.utils.viewport.*

class UdacityGame : ApplicationAdapter() {

    companion object {
        private const val WIDTH = 100f
        private const val HEIGHT = 100f
    }

    private val viewport by lazy { FitViewport(WIDTH, HEIGHT) }
    private val shapeRenderer by lazy { ShapeRenderer() }

    private var initialTime = 0f

    override fun resize(width: Int, height: Int) {
        viewport.update(width, height, true)
    }

    override fun render() {
        ScreenUtils.clear(Color.TEAL)
        viewport.camera.update()
        shapeRenderer.projectionMatrix = viewport.camera.combined
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled)
        shapeRenderer.circle(initialTime, HEIGHT / 2f, 10f)
        shapeRenderer.end()
        initialTime += 0.5f
    }

    override fun dispose() {
        shapeRenderer.dispose()
    }

}