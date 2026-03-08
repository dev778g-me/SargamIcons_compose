package com.dev.sargamicons_compose

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform