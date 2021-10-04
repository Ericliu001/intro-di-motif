package intro.di

import intro.di.network.AuthService
import intro.di.network.AuthServiceImpl
import motif.Expose
import java.util.*
import javax.inject.Named

@motif.Scope
interface RootScope {
    fun authService(): AuthService

    /**
     * @param profile Dynamic dependency.
     */
    fun loggedInScope(): LoggedInScope

    @motif.Objects
    abstract class Objects {
        @Expose
        fun profile(): Profile {
            return Profile(UUID.randomUUID(), "aoeu")
        }

        fun authService(@Named("email") email: String, @Named("password") password: String): AuthService {
            return AuthServiceImpl(email, password)
        }

        @Named("email")
        fun email(): String {
            return "eric.liu@uber.com"
        }

        @Named("password")
        fun password(): String {
            return "password"
        }
    }

}