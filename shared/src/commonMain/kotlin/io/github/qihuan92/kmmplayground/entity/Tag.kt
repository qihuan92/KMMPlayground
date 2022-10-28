package io.github.qihuan92.kmmplayground.entity

import kotlinx.serialization.Serializable

/**
 * Article tag model
 *
 * @author qihuan
 * @date 2022/10/24
 */
@Serializable
data class Tag(
    val name: String?,
    val url: String?,
)
