package intro.di

import intro.di.network.AuthService
import intro.di.network.AuthServiceImpl
import intro.di.network.NetworkClient
import intro.di.network.RideRequestService
import intro.di.network.RideRequestServiceImpl
import motif.Expose
import motif.Scope

@Scope
interface RootScope {
    fun authService(): AuthService

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