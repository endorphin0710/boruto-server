package com.junnosuke.plugin

import io.ktor.server.application.*
import io.ktor.server.plugins.calllogging.*

internal fun Application.configureMonitoring() {
    install(CallLogging)
}