package intro.di

import intro.di.network.AuthService
import intro.di.network.AuthServiceImpl
import intro.di.network.NetworkClient
import motif.Expose

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
        fun networkClient(): NetworkClient {
            return NetworkClient()
        }

        fun authService(networkClient: NetworkClient): AuthService {
            return AuthServiceImpl(networkClient)
        }
    }

}