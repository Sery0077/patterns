package structual.proxy.example

import structual.proxy.example.okhttp_library.OkHttp
import structual.proxy.example.okhttp_library.OkHttpImpl
import structual.proxy.example.okhttp_library.Response

// Заместитель, кэширующий ответы сервера. Благодаря тому, что имеет тот же интерфейс, что и оригинальный OkHttpImpl, эти два класса могут быть легковзаимозаменяемы.
class CachingOkHttpProxy : OkHttp {
    private val cache = hashMapOf<String, Response>()
    private val okHttpImpl = OkHttpImpl()

    override fun get(url: String): Response {
        return cache[url] ?: okHttpImpl.get(url)
    }
}