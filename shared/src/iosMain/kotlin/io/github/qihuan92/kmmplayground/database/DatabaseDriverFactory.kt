package io.github.qihuan92.kmmplayground.database

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

/**
 * DatabaseDriverFactory in iOS
 *
 * @author qihuan
 * @date 2022/10/25
 */
actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(AppDatabase.Schema, Database.DB_NAME)
    }
}