package intro.di

import intro.di.network.RideRequestService

class LoggedInController(
    private val profile: Profile,
    private val rideRequestService: RideRequestService
) {
    fun requestARide() {
        rideRequestService.requestRide()
    }
}