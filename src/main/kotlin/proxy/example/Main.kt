package proxy.example

import proxy.example.okhttp_library.OkHttp

fun main() {
    val okHttp: OkHttp = CachingOkHttpProxy()
    okHttp.get("someUrl")
}