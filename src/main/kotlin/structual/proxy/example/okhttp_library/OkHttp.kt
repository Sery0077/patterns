package structual.proxy.example.okhttp_library

interface OkHttp {
    fun get(url: String): Response
}