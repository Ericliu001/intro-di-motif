package intro.di.network

class NetworkClient {
    fun newCall(url: String): String {
        return "$url is ok"
    }
}