package intro.di

import intro.di.network.RideRequestService
import intro.di.network.RideRequestServiceImpl

@motif.Scope
interface LoggedInScope {
    fun rideRequestService(): RideRequestService

    @motif.Objects
    abstract class Objects {
        abstract fun loggedInController(): LoggedInController

        fun rideRequestService(profile: Profile): RideRequestService {
            return RideRequestServiceImpl(profile)
        }
    }
}