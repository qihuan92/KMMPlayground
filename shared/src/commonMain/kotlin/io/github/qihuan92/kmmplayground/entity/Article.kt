package io.github.qihuan92.kmmplayground.entity

import kotlinx.serialization.Serializable

/**
 * Article entity
 *
 * @author qihuan
 * @date 2022/10/24
 */
@Serializable
data class Article(
    val id: Long,
    val title: String?,
    val author: String?,
    val desc: String?,
    val descMd: String?,
    val link: String?,
    val chapterId: Long?,
    val superChapterId: Long?,
    val superChapterName: String?,
    val niceDate: String?,
    val zan: Int?,
    val tags: List<Tag>?,
)
