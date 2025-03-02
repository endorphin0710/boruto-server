package com.junnosuke.plugin

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*

internal fun Application.configureDefaultHeader() {
    install(DefaultHeaders) {
        val maxAge = java.time.Duration.ofDays(365).seconds
        header(
            name = HttpHeaders.CacheControl,
            value = "public, max-age=$maxAge, immutable"
        )
    }
}