package com.junnosuke.plugin

import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger

internal fun Application.configureKoin() {
    install(Koin ) {
        slf4jLogger()
    }
}