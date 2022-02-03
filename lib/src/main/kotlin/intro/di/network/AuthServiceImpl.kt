package intro.di.network

import intro.di.Profile
import java.util.*

class AuthServiceImpl() : AuthService {
    override fun login(email: String, password: String): Profile {
        return Profile(UUID.randomUUID(), "xxxx-xxxx-xxxx")
    }
}