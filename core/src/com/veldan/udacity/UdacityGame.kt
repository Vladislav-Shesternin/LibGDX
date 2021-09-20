package com.veldan.udacity

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.MathUtils
import com.badlogic.gdx.utils.Array
import com.badlogic.gdx.utils.ScreenUtils
import com.badlogic.gdx.utils.viewport.*

class UdacityGame : ApplicationAdapter() {

    companion object {
        private const val WIDTH = 100f
        private const val HEIGHT = 50f
    }

    private val batch by lazy { SpriteBatch() }
    private val font by lazy { BitmapFont() }

    val words = generateWords(20)

    override fun render() {
        ScreenUtils.clear(Color.TEAL)
        with(batch) {
            begend {
                words.onEach {
                    font.data.scale(it.scale)
                    font.color = it.color
                    font.draw(batch, it.letters, it.x, it.y)
                }
            }
        }
    }

    override fun dispose() {
        batch.dispose()
        font.dispose()
    }

}

private fun generateWords(count: Int): List<Word> = MutableList<Word>(count) {
    Word.randomWord(0.5f, 3f)
}

data class Word(
        var x: Float,
        var y: Float,
        var scale: Float,
        var color: Color,
        var letters: String
) {

    companion object {
        private val WORDS = listOf("render-farm", "refrigerator", "tiger-team", "weathered", "camera", "tattoo", "boat", "soul-delay", "nodal point", "motion augmented", "reality neon", "nano-construct", "garage", "bicycle", "rebar tanto", "modem", "concrete RAF", "industrial grade media", "realism", "drone", "post-franchise shoes", "render-farm-ware", "DIY San Francisco", "rain lights", "numinous tank-traps", "pen drone", "cyber-cardboard", "denim monofilament", "order-flow", "smart-hotdog")

        fun randomWord(minScale: Float, maxScale: Float): Word {
            val x = MathUtils.random(-.25f, .75f)
            val y = MathUtils.random()
            val scale = minScale + (maxScale - minScale) * MathUtils.random()
            val color = Color(MathUtils.random(), MathUtils.random(), MathUtils.random(), 1f)
            val letters = WORDS[MathUtils.random(WORDS.size - 1)]
            return Word(x, y, scale, color, letters)
        }
    }

}