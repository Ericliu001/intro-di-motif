package intro.di.network

import intro.di.Profile
import java.util.*

class AuthServiceImpl(email: String, password: String) : AuthService {
    override fun login(): Profile {
        return Profile(UUID.randomUUID(), "xxxx-xxxx-xxxx")
    }
}