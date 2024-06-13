package structual.proxy.example.okhttp_library

class OkHttpImpl : OkHttp {

    override fun get(url: String): Response {
        println("Getting data from $url")
        return Response(httpCode = 200, errorMessage = null, result = "Success")
    }
}