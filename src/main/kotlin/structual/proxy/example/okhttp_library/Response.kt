package structual.proxy.example.okhttp_library

data class Response(
    val httpCode: Int,
    val errorMessage: String? = null,
    val result: Any
)
