package intro.di

import intro.di.network.RideRequestService

class LoggedInController(val profile: Profile, val rideRequestService: RideRequestService) {
    fun requestARide() {
        rideRequestService.requestARide(profile.uuid, profile.authToken)
    }
}