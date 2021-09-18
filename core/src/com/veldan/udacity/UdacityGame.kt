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

    val x by lazy { List<Float>(300) { (1..width).random().toFloat() } }
    val y by lazy { List<Float>(300) { (1..height).random().toFloat() } }

    override fun render() {
        ScreenUtils.clear(Color.BLACK)
        with(shapeRenderer) {
            begin(ShapeRenderer.ShapeType.Point)
            x.zip(y).onEach { point(it.first, it.second, 0f) }
            end()
        }
    }

    override fun dispose() {
        shapeRenderer.dispose()
    }
}