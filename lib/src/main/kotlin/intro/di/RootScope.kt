package intro.di

import intro.di.network.AuthService
import intro.di.network.AuthServiceImpl
import motif.Expose
import java.util.*

@motif.Scope
interface RootScope {
    fun authService(): AuthService

    /**
     * @param profile Dynamic dependency.
     */
    fun loggedInScope(profile: Profile): LoggedInScope

    @motif.Objects
    abstract class Objects {
        @Expose
        fun profile(): Profile {
            return Profile(UUID.randomUUID(), "aoeu")
        }

        fun authService(): AuthService {
            return AuthServiceImpl()
        }
    }

}