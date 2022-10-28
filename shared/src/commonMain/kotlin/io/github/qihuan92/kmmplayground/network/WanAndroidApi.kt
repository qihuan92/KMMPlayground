package io.github.qihuan92.kmmplayground.network

import io.github.qihuan92.kmmplayground.entity.Article
import io.github.qihuan92.kmmplayground.entity.Page
import io.github.qihuan92.kmmplayground.entity.Response
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json

/**
 * WanAndroid network service.
 *
 * @author qihuan
 * @date 2022/10/24
 */
class WanAndroidApi {
    companion object {
        const val BASE_URL = "https://www.wanandroid.com"
    }

    private val httpClient = HttpClient {
        install(ContentNegotiation) {
            json(Json {
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    suspend fun getArticleList(page: Int): Response<Page<Article>> {
        return httpClient.get("${BASE_URL}/article/list/${page}/json").body()
    }
}