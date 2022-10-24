package io.github.qihuan92.kmmplayground

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform