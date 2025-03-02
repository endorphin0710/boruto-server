package com.junnosuke

import com.junnosuke.plugin.*
import com.junnosuke.plugin.configureKoin
import com.junnosuke.plugin.configureMonitoring
import com.junnosuke.plugin.configureRouting
import com.junnosuke.plugin.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureKoin()
    configureRouting()
    configureMonitoring()
    configureDefaultHeader()
    configureSerialization()
}