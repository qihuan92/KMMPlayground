package io.github.qihuan92.kmmplayground.database

import com.squareup.sqldelight.db.SqlDriver

/**
 * DatabaseDriverFactory
 *
 * @author qihuan
 * @date 2022/10/25
 */
expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}