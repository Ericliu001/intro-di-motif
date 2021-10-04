package intro.di

import intro.di.network.RideRequestService
import intro.di.network.RideRequestServiceImpl

@motif.Scope
interface LoggedInScope {

    @motif.Objects
    abstract class Objects {
        abstract fun loggedInController(): LoggedInController

        fun rideRequestService(): RideRequestService {
            return RideRequestServiceImpl()
        }
    }
}