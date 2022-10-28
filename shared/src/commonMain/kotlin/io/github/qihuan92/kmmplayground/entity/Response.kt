package io.github.qihuan92.kmmplayground.entity

import kotlinx.serialization.Serializable

/**
 * Response model
 *
 * @author qihuan
 * @date 2022/10/24
 */
@Serializable
data class Response<T>(
    val errorCode: Int,
    val errorMsg: String,
    val data: T?,
)

/**
 * Page model
 */
@Serializable
data class Page<T>(
    val curPage: Int,
    val offset: Int,
    val over: Boolean,
    val pageCount: Int,
    val size: Int,
    val total: Int,
    val datas: List<T>,
)