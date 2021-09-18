package com.veldan.udacity

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.utils.ScreenUtils
import kotlin.random.Random

class UdacityGame : ApplicationAdapter() {
    private val shapeRenderer by lazy { ShapeRenderer() }

    private val width by lazy { Gdx.graphics.width }
    private val height by lazy { Gdx.graphics.height }

    val xy = floatArrayOf(
            300f, 100f,
            200f, 200f,
            400f, 400f,
            500f, 300f,
    )

    override fun render() {
        ScreenUtils.clear(Color.BLACK)
        with(shapeRenderer) {
            begin(ShapeRenderer.ShapeType.Line)
            line(10f, 10f, 100f, 100f, Color.RED, Color.BLUE)
            color = Color.BLUE
            line(20f, 10f, 110f, 100f)
            polyline(xy)
            end()
        }
    }

    override fun dispose() {
        shapeRenderer.dispose()
    }
}