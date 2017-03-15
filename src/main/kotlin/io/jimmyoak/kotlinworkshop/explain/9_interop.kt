package io.jimmyoak.kotlinworkshop.explain

import java.util.*
import kotlin.concurrent.schedule
import kotlin.concurrent.scheduleAtFixedRate
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val timer = Timer()

    val task = timer.scheduleAtFixedRate(0, 1000) {
        println("Hi")
    }

    timer.schedule(5000) {
        task.cancel()
        exitProcess(0)
    }
}
