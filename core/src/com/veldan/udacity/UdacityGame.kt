package com.veldan.udacity

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.glutils.ShapeRenderer
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.ScreenUtils
import java.awt.Shape
import kotlin.random.Random

class UdacityGame : ApplicationAdapter() {
    private val shapeRenderer by lazy { ShapeRenderer() }

    private val width by lazy { Gdx.graphics.width }
    private val height by lazy { Gdx.graphics.height }

    override fun render() {
        ScreenUtils.clear(Color.BLACK)
        with(shapeRenderer) {
            begin(ShapeRenderer.ShapeType.Filled)
            circle(50f, 50f, 40f, 1666)
            end()
        }
    }

    override fun dispose() {
        shapeRenderer.dispose()
    }
}