package com.junnosuke.plugin

import io.ktor.client.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*

internal fun Application.configureSerialization() {
    HttpClient {
        install(ContentNegotiation) {
            json()
        }
    }
}