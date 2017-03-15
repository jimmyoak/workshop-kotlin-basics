package io.jimmyoak.kotlinworkshop.explain

import java.math.BigInteger
import java.util.*
import kotlin.concurrent.schedule
import kotlin.concurrent.scheduleAtFixedRate
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    bigInteger()
    scheduling()
}

private fun bigInteger() {
    val a = BigInteger.valueOf(5)
    val b = BigInteger.ONE

    val c = a + b

    println(c)
}

private fun scheduling() {
    val timer = Timer()

    val task = timer.scheduleAtFixedRate(0, 1000) {
        println("Hi")
    }

    timer.schedule(5000) {
        task.cancel()
        exitProcess(0)
    }
}
