package io.github.qihuan92.kmmplayground.database

import io.github.qihuan92.kmmplayground.database.dao.ArticleDao

/**
 * Database
 *
 * @author qihuan
 * @date 2022/10/25
 */
internal class Database(databaseDriverFactory: DatabaseDriverFactory) {
    companion object {
        const val DB_NAME = "wanandroid.db"
    }

    private val appDatabase = AppDatabase(databaseDriverFactory.createDriver())

    private val articleDao by lazy { ArticleDao(appDatabase) }
}