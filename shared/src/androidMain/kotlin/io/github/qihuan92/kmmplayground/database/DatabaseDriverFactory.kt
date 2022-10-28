package io.github.qihuan92.kmmplayground.database

import android.content.Context
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

/**
 * DatabaseDriverFactory in Android
 *
 * @author qihuan
 * @date 2022/10/25
 */
actual class DatabaseDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(AppDatabase.Schema, context, Database.DB_NAME)
    }
}