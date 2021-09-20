package com.veldan.udacity

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.SpriteBatch

fun log(message: String) = Gdx.app.log("TAG", message)

fun SpriteBatch.begend(block: SpriteBatch.() -> Unit) {
    begin()
    block()
    end()
}