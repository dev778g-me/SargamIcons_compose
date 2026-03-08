package com.dev.sargamicons_compose

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "SargamIcons_compose",
    ) {
        App()
    }
}