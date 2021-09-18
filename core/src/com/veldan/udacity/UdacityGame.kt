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
            setAutoShapeType(true)
            begin()
            drawFrame()
            drawCenter()
            end()
        }
    }

    fun ShapeRenderer.drawFrame() {
        set(ShapeRenderer.ShapeType.Line)
        rect(50f, 50f, width - 100f, height - 100f)
    }

    fun ShapeRenderer.drawCenter() {
        set(ShapeRenderer.ShapeType.Filled)
        rect(width / 2 - 50f, height / 2 - 50f, 100f, 100f)
    }

    override fun dispose() {
        shapeRenderer.dispose()
    }
}