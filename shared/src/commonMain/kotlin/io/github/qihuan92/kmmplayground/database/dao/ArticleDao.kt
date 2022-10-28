package io.github.qihuan92.kmmplayground.database.dao

import io.github.qihuan92.kmmplayground.database.AppDatabase
import io.github.qihuan92.kmmplayground.entity.Article
import io.github.qihuan92.kmmplayground.entity.Tag

/**
 * ArticleDao
 *
 * @author qihuan
 * @date 2022/10/25
 */
class ArticleDao(appDatabase: AppDatabase) {
    private val dbQuery = appDatabase.articleQueries
    private val tagQuery = appDatabase.tagQueries

    internal fun getArticleList(): List<Article> {
        return dbQuery.selectAll().executeAsList()
            .map {
                val tags = tagQuery.selectByArticleId(it.id)
                    .executeAsList()
                    .map { tag ->
                        Tag(tag.name, tag.url)
                    }
                Article(
                    it.id,
                    it.title,
                    it.author,
                    it.desc,
                    it.descMd,
                    it.link,
                    it.chapterId,
                    it.superChapterId,
                    it.superChapterName,
                    it.niceDate,
                    it.zan,
                    tags
                )
            }
    }
}