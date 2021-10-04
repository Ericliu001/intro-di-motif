package intro.di.network

import intro.di.Profile

interface AuthService {
    fun login(): Profile
}