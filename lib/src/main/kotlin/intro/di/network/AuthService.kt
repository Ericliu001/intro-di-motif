package intro.di.network

import intro.di.Profile

interface AuthService {
    fun login(email: String, password: String): Profile
}