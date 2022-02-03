package intro.di.network

import intro.di.Profile
import java.util.*

class AuthServiceImpl(private val networkClient: NetworkClient) : AuthService {
    override fun login(email: String, password: String): Profile {
        networkClient.newCall("www.example.com/login?email=$email&password=$password")
        return Profile(UUID.randomUUID(), "xxxx-xxxx-xxxx")
    }
}