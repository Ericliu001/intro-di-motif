package intro.di

import intro.di.network.NetworkClient
import intro.di.network.RideRequestService
import intro.di.network.RideRequestServiceImpl

@motif.Scope
interface LoggedInScope {
    fun rideRequestService(): RideRequestService

    @motif.Objects
    abstract class Objects {
        fun rideRequestService(profile: Profile, networkClient: NetworkClient): RideRequestService {
            return RideRequestServiceImpl(profile, networkClient)
        }
    }
}