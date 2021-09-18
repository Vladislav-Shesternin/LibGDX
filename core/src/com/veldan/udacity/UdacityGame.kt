package com.veldan.udacity

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.ScreenUtils
import kotlin.random.Random

class UdacityGame : ApplicationAdapter() {
    private val shapeRenderer by lazy { ShapeRenderer() }

    private val width by lazy { Gdx.graphics.width }
    private val height by lazy { Gdx.graphics.height }

    val human = floatArrayOf(
            100f, 10f,
            100f, 50f,

            90f, 50f,
            90f, 100f,

            100f, 100f,
            100f, 110f,

            80f, 110f,
            80f, 130f,

            150f, 130f,
            150f, 110f,

            130f, 110f,
            130f, 100f,

            140f, 100f,
            140f, 50f,

            130f, 50f,
            130f, 10f,

            117f, 10f,
            117f, 40f,

            113f, 40f,
            113f, 10f,

            100f, 10f,
    )

    override fun render() {
        ScreenUtils.clear(Color.BLACK)
        with(shapeRenderer) {
            begin(ShapeRenderer.ShapeType.Line)
            polyline(human)
            end()
        }
    }

    override fun dispose() {
        shapeRenderer.dispose()
    }
}