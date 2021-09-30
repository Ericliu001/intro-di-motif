package intro.di

import intro.di.network.AuthServiceImpl

class HomeActivity {
    private val authService = AuthServiceImpl()

    fun login() {
        val email = "eric.liu@uber.com"
        val password = "password"
        authService.login(email, password)
    }

    fun signOut() {
        throw UnsupportedOperationException()
    }
}