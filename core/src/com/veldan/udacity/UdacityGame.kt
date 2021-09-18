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
            drawLegs()
            drawTorso()
            drawHands()
            drawHead()
            end()
        }
    }

    fun ShapeRenderer.drawLegs() {
        set(ShapeRenderer.ShapeType.Line)
        polyline(floatArrayOf(
                100f, 20f,
                150f, 70f,
                200f, 20f,
        ))
    }

    fun ShapeRenderer.drawTorso() {
        set(ShapeRenderer.ShapeType.Line)
        line(150f, 70f, 150f, 200f)
    }

    fun ShapeRenderer.drawHands() {
        set(ShapeRenderer.ShapeType.Line)
        line(125f, 117f, 175f, 117f)
    }

    fun ShapeRenderer.drawHead() {
        set(ShapeRenderer.ShapeType.Filled)
        circle(150f, 250f, 50f)
    }

    override fun dispose() {
        shapeRenderer.dispose()
    }
}